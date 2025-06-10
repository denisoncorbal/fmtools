import { FORMATION_CALCULATOR_URL, GoalkeeperPlayer, LinePlayer, POSITIONS_CALCULATOR_URL, SQUAD_MANAGER_URL, SuitablePosition, TacticalStyle } from "./definitions";

export async function fetchAllLinePlayers(): Promise<LinePlayer[]> {
    try {
        console.info("INFO - " + (new Date()).toISOString() + " - Trying to fetch all line players");
        const res = await fetch(SQUAD_MANAGER_URL + "/v1/api/linePlayer");

        if (!res.ok) {
            console.warn("WARN - " + (new Date()).toISOString() + " - fetch all line players failed on backend");
            console.warn("WARN - " + (new Date()).toISOString() + " - Status: " + res.status);
            throw new Error((new Date()).toISOString() + " - Failed to fetch all line players", { cause: 'server' });
        }

        console.info("INFO - " + (new Date()).toISOString() + " - Fetch all line players with success");
        return res.json() as Promise<LinePlayer[]>;
    } catch (e: unknown) {
        const err = e as Error;
        if (err.cause && err.cause == 'server') {
            console.warn("WARN - " + (new Date()).toISOString() + " - " + err.message);
            console.warn("WARN - " + (new Date()).toISOString() + " - " + err.stack);
        } else {
            console.error("ERROR - " + (new Date()).toISOString() + " - " + err.message);
            console.error("ERROR - " + (new Date()).toISOString() + " - " + err.stack);
        }
        return new Promise((resolve) => {
            resolve([]);
        });
    }
}

export async function fetchAllGoalkeeperPlayers(): Promise<GoalkeeperPlayer[]> {
    let res = null;
    try {
        res = await fetch(SQUAD_MANAGER_URL + "/v1/api/goalkeeperPlayer");
    } catch (error) {
        return new Promise((resolve) => {
            console.log("Failed to fetch all goalkeeper players");
            console.error((error as Error).message);
            resolve([]);
        });
    }
    return res.json() as Promise<GoalkeeperPlayer[]>;
}

export async function fetchAllPositions(id: string): Promise<SuitablePosition[]> {
    let res = null;
    try {
        res = await fetch(POSITIONS_CALCULATOR_URL + "/v1/api/getAllPositionsById/" + id);
    } catch (error) {
        return new Promise((resolve) => {
            console.log("Failed to fetch all positions by id");
            console.error((error as Error).message);
            resolve([]);
        });
    }
    return res.json() as Promise<SuitablePosition[]>;
}

export async function fetchLinePlayerById(id: string): Promise<LinePlayer> {
    let res = null;
    try {
        res = await fetch(SQUAD_MANAGER_URL + "/v1/api/linePlayer/" + id);
    } catch (error) {
        return new Promise((resolve) => {
            console.log("Failed to fetch line player by id");
            console.error((error as Error).message);
            resolve({} as LinePlayer);
        });
    }
    return res.json() as Promise<LinePlayer>;
}

export async function fetchGoalkeeperPlayerById(id: string): Promise<GoalkeeperPlayer> {
    let res = null;
    try {
        res = await fetch(SQUAD_MANAGER_URL + "/v1/api/goalkeeperPlayer/" + id);
    } catch (error) {
        return new Promise((resolve) => {
            console.log("Failed to fetch goalkeeper player by id");
            console.error((error as Error).message);
            resolve({} as GoalkeeperPlayer);
        });
    }
    return res.json() as Promise<GoalkeeperPlayer>;
}

export async function fetchFormations(id: string): Promise<TacticalStyle[]> {
    let res = null;
    try {
        res = await fetch(FORMATION_CALCULATOR_URL + "/v1/api/calculateFormation/" + id);
    } catch (error) {
        return new Promise((resolve) => {
            console.log("Failed to fetch formations");
            console.error((error as Error).message);
            resolve({} as TacticalStyle[]);
        });
    }
    return res.json() as Promise<TacticalStyle[]>;
}