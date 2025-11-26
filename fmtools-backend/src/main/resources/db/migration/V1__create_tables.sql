CREATE TABLE IF NOT EXISTS TB_Team(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    owner_id UUID NOT NULL,
    name VARCHAR(64) NOT NULL
);
CREATE TABLE IF NOT EXISTS TB_Squad(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name VARCHAR(64) NOT NULL,
    team_id UUID NOT NULL,
    owner_id UUID NOT NULL,
    CONSTRAINT fk_team_id FOREIGN KEY(team_id) REFERENCES TB_Team(id)
);
CREATE TABLE IF NOT EXISTS TB_Tactic(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name VARCHAR(64) NOT NULL,
    team_id UUID NOT NULL,
    owner_id UUID NOT NULL,
    CONSTRAINT fk_team_id FOREIGN KEY(team_id) REFERENCES TB_Team(id)
);
CREATE TABLE IF NOT EXISTS TB_Tactical_Style(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name VARCHAR(64) NOT NULL,
    tactic_id UUID UNIQUE NOT NULL,
    owner_id UUID NOT NULL,
    CONSTRAINT fk_tactic_id FOREIGN KEY(tactic_id) REFERENCES TB_Tactic(id)
);
CREATE TABLE IF NOT EXISTS TB_Formation(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name VARCHAR(64) NOT NULL,
    suitability REAL,
    tactical_style_id UUID NOT NULL,
    owner_id UUID NOT NULL,
    CONSTRAINT fk_tactical_style_id FOREIGN KEY(tactical_style_id) REFERENCES TB_Tactical_Style(id)
);
CREATE TABLE IF NOT EXISTS TB_Player(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name VARCHAR(128) NOT NULL,
    attributes TEXT NOT NULL,
    squad_id UUID NOT NULL,
    owner_id UUID NOT NULL,
    CONSTRAINT fk_squad_id FOREIGN KEY(squad_id) REFERENCES TB_Squad(id)
);
CREATE TABLE IF NOT EXISTS TB_Tactical_Position(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    field_position VARCHAR(8) NOT NULL,
    role VARCHAR(32) NOT NULL,
    duty VARCHAR(16) NOT NULL,
    formation_id UUID NOT NULL,
    player_id UUID,
    suitability REAL,
    owner_id UUID NOT NULL,
    CONSTRAINT fk_formation_id FOREIGN KEY(formation_id) REFERENCES TB_Formation(id),
    CONSTRAINT fk_player_id FOREIGN KEY(player_id) REFERENCES TB_Player(id)
);
CREATE TABLE IF NOT EXISTS TB_User(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    username VARCHAR(128) UNIQUE NOT NULL,
    password VARCHAR(128) NOT NULL,
    salt VARCHAR(128) NOT NULL
)