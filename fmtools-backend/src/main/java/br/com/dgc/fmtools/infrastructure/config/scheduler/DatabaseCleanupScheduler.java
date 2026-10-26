package br.com.dgc.fmtools.infrastructure.config.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.com.dgc.fmtools.application.services.DatabaseCleanupService;

@Component
@ConditionalOnProperty(prefix = "app.database-cleanup", name = "enabled", havingValue = "true")
public class DatabaseCleanupScheduler {

    private static final Logger log = LoggerFactory.getLogger(DatabaseCleanupScheduler.class);

    private final DatabaseCleanupService cleanupService;

    public DatabaseCleanupScheduler(
            DatabaseCleanupService cleanupService) {
        this.cleanupService = cleanupService;
    }

    @Scheduled(cron = "${app.database-cleanup.cron:0 0 3 * * *}", zone = "${app.database-cleanup.zone:America/Sao_Paulo}")
    public void runCleanup() {
        log.warn("Starting daily database cleanup.");

        try {
            cleanupService.clearAllData();
            log.warn("Daily database cleanup succeded.");
        } catch (Exception exception) {
            log.error(
                    "Failure on daily database cleanup.",
                    exception);
        }
    }

}