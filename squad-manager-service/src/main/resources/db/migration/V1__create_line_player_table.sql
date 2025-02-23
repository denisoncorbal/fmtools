CREATE TABLE TB_LINE_PLAYER(
    id UUID NOT NULL UNIQUE,
    name VARCHAR(50) NOT NULL,
    aggression SMALLINT NOT NULL,
    anticipation SMALLINT NOT NULL,
    bravery SMALLINT NOT NULL,
    composure SMALLINT NOT NULL,
    concentration SMALLINT NOT NULL,
    decisions SMALLINT NOT NULL,
    determination SMALLINT NOT NULL,
    flair SMALLINT NOT NULL,
    leadership SMALLINT NOT NULL,
    off_the_ball SMALLINT NOT NULL,
    positioning SMALLINT NOT NULL,
    teamwork SMALLINT NOT NULL,
    vision SMALLINT NOT NULL,
    work_rate SMALLINT NOT NULL,
    acceleration SMALLINT NOT NULL,
    agility SMALLINT NOT NULL,
    balance SMALLINT NOT NULL,
    jumping_reach SMALLINT NOT NULL,
    natural_fitness SMALLINT NOT NULL,
    pace SMALLINT NOT NULL,
    stamina SMALLINT NOT NULL,
    strength SMALLINT NOT NULL,
    free_kick_taking SMALLINT NOT NULL,
    penalty_taking SMALLINT NOT NULL,
    technique SMALLINT NOT NULL,
    first_touch SMALLINT NOT NULL,
    passing SMALLINT NOT NULL,
    corners SMALLINT NOT NULL,
    crossing SMALLINT NOT NULL,
    dribbling SMALLINT NOT NULL,
    finishing SMALLINT NOT NULL,
    heading SMALLINT NOT NULL,
    long_shots SMALLINT NOT NULL,
    long_throws SMALLINT NOT NULL,
    marking SMALLINT NOT NULL,
    tackling SMALLINT NOT NULL,
    PRIMARY KEY (id)
)