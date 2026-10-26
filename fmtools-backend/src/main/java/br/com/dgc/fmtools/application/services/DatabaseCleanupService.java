package br.com.dgc.fmtools.application.services;

import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DatabaseCleanupService {

    private static final Set<String> EXCLUDED_TABLES = Set.of(
            "flyway_schema_history",
            "databasechangelog",
            "databasechangeloglock");

    private static final Pattern SAFE_IDENTIFIER = Pattern.compile("[a-zA-Z_][a-zA-Z0-9_$]*");

    private final JdbcTemplate jdbcTemplate;
    private final String schema;

    public DatabaseCleanupService(
            JdbcTemplate jdbcTemplate,
            @Value("${app.database-cleanup.schema:public}") String schema) {

        if (!SAFE_IDENTIFIER.matcher(schema).matches()) {
            throw new IllegalArgumentException(
                    "Nome de schema inválido: " + schema);
        }

        this.jdbcTemplate = jdbcTemplate;
        this.schema = schema;
    }

    @Transactional
    public void clearAllData() {
        List<String> tables = jdbcTemplate.queryForList(
                """
                        SELECT table_name
                        FROM information_schema.tables
                        WHERE table_schema = ?
                          AND table_type = 'BASE TABLE'
                        ORDER BY table_name
                        """,
                String.class,
                schema);

        tables = tables.stream()
                .filter(table -> !EXCLUDED_TABLES.contains(table))
                .toList();

        if (tables.isEmpty()) {
            throw new IllegalStateException(
                    "Nenhuma tabela encontrada no schema configurado: "
                            + schema);
        }

        String tableList = tables.stream()
                .map(table -> quoteIdentifier(schema)
                        + "." + quoteIdentifier(table))
                .reduce((a, b) -> a + ", " + b)
                .orElseThrow();

        String sql = "TRUNCATE TABLE " + tableList
                + " RESTART IDENTITY CASCADE";

        jdbcTemplate.execute(sql);
    }

    private static String quoteIdentifier(String identifier) {
        return "\"" + identifier.replace("\"", "\"\"") + "\"";
    }
}