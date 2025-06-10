export const SQUAD_MANAGER_URL = "https://squad-manager-service:8081"
export const POSITIONS_CALCULATOR_URL = "https://positions-calculator-service:8082"
export const FORMATION_CALCULATOR_URL = "https://formation-calculator-service:8083"

export type LinePlayer = {
    id?: string,
    name: string,
    aggression: number,
    anticipation: number,
    bravery: number,
    composure: number,
    concentration: number,
    decisions: number,
    determination: number,
    flair: number,
    leadership: number,
    offTheBall: number,
    positioning: number,
    teamwork: number,
    vision: number,
    workRate: number,
    acceleration: number,
    agility: number,
    balance: number,
    jumpingReach: number,
    naturalFitness: number,
    pace: number,
    stamina: number,
    strength: number,
    freeKickTaking: number,
    penaltyTaking: number,
    technique: number,
    firstTouch: number,
    passing: number,
    corners: number,
    crossing: number,
    dribbling: number,
    finishing: number,
    heading: number,
    longShots: number,
    longThrows: number,
    marking: number,
    tackling: number,
}

export function isLinePlayer(linePlayer: object): linePlayer is LinePlayer {
    return Object.keys(linePlayer).includes("corners");
}

export function isLinePlayerArray(linePlayers: object[]): linePlayers is LinePlayer[] {
    return linePlayers.length > 0 && linePlayers.every((linePlayer) => Object.keys(linePlayer).includes("corners"));
}

export type GoalkeeperPlayer = {
    id?: string,
    name: string,
    aggression: number,
    anticipation: number,
    bravery: number,
    composure: number,
    concentration: number,
    decisions: number,
    determination: number,
    flair: number,
    leadership: number,
    offTheBall: number,
    positioning: number,
    teamwork: number,
    vision: number,
    workRate: number,
    acceleration: number,
    agility: number,
    balance: number,
    jumpingReach: number,
    naturalFitness: number,
    pace: number,
    stamina: number,
    strength: number,
    freeKickTaking: number,
    penaltyTaking: number,
    technique: number,
    firstTouch: number,
    passing: number,
    aerialReach: number,
    commandOfArea: number,
    communication: number,
    eccentricity: number,
    handling: number,
    kicking: number,
    oneOnOnes: number,
    punching: number,
    reflexes: number,
    rushingOut: number,
    throwing: number,
}

export function isGoalkeeperPlayer(goalkeeperPlayer: object): goalkeeperPlayer is GoalkeeperPlayer {
    return Object.keys(goalkeeperPlayer).includes("aerialReach");
}

export function isGoalkeeperPlayerArray(goalkeeperPlayers: object[]): goalkeeperPlayers is GoalkeeperPlayer[] {
    return goalkeeperPlayers.length > 0 && goalkeeperPlayers.every((goalkeeperPlayer) => Object.keys(goalkeeperPlayer).includes("aerialReach"));
}

export type SuitablePosition = {
    name: string,
    percentage: number,
    quantityKeyAttributes: number,
    quantityPreferableAttributes: number
}

export function isSuitablePosition(suitablePosition: object): suitablePosition is SuitablePosition {
    return Object.keys(suitablePosition).includes("percentage");
}

export function isSuitablePositionArray(suitablePositions: object[]): suitablePositions is SuitablePosition[] {
    return suitablePositions.length > 0 && suitablePositions.every((suitablePosition) => Object.keys(suitablePosition).includes("percentage"));
}

export type CalculateFormationsRequest = {
    linePlayersIds: string[],
    goalkeeperPlayersIds: string[]
}

export type Formation = {
    linePositions: [
        {
            name: string,
            playerId: string,
            playerName: string,
            percentage: number
        }
    ],
    goalkeeperPosition: {
        name: string,
        playerId: string,
        playerName: string,
        percentage: number
    },
    name: string,
    averagePercentage: number
}

export type TacticalStyle = {
    name: string,
    mentality: 'very defensive' | 'defensive' | 'cautious' | 'balanced' | 'positive' | 'attacking' | 'very attacking',
    preferableFormations: Formation[]
}

export function isSuitableTacticalStyle(tacticalStyle: object): tacticalStyle is TacticalStyle {
    return Object.keys(tacticalStyle).includes("preferableFormations");
}

export function isSuitableTacticalStyleArray(tacticalStyles: object[]): tacticalStyles is SuitablePosition[] {
    return tacticalStyles.length > 0 && tacticalStyles.every((tacticalStyle) => Object.keys(tacticalStyle).includes("preferableFormations"));
}