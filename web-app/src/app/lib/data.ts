import { GoalkeeperPlayer, LinePlayer, SuitablePosition, TacticalStyle } from "./definitions";

export async function fetchAllLinePlayers(): Promise<LinePlayer[]> {
    let res = null;
    try {
        res = await fetch("http://localhost:8081/v1/api/linePlayer");
    } catch (error) {
        return new Promise((resolve) => {
            console.error((error as Error).message);
            resolve([]);
        });
    }
    return res.json() as Promise<LinePlayer[]>;
}

export async function fetchAllGoalkeeperPlayers(): Promise<GoalkeeperPlayer[]> {
    let res = null;
    try {
        res = await fetch("http://localhost:8081/v1/api/goalkeeperPlayer");
    } catch (error) {
        return new Promise((resolve) => {
            console.error((error as Error).message);
            resolve([]);
        });
    }
    return res.json() as Promise<GoalkeeperPlayer[]>;
}

export async function fetchAllPositions(id: string): Promise<SuitablePosition[]> {
    let res = null;
    try {
        res = await fetch("http://localhost:8082/v1/api/getAllPositionsById/" + id);
    } catch (error) {
        return new Promise((resolve) => {
            console.error((error as Error).message);
            resolve([]);
        });
    }
    return res.json() as Promise<SuitablePosition[]>;
}

export async function fetchLinePlayerById(id: string): Promise<LinePlayer> {
    let res = null;
    try {
        res = await fetch("http://localhost:8081/v1/api/linePlayer/" + id);
    } catch (error) {
        return new Promise((resolve) => {
            console.error((error as Error).message);
            resolve({} as LinePlayer);
        });
    }
    return res.json() as Promise<LinePlayer>;
}

export async function fetchGoalkeeperPlayerById(id: string): Promise<GoalkeeperPlayer> {
    let res = null;
    try {
        res = await fetch("http://localhost:8081/v1/api/goalkeeperPlayer/" + id);
    } catch (error) {
        return new Promise((resolve) => {
            console.error((error as Error).message);
            resolve({} as GoalkeeperPlayer);
        });
    }
    return res.json() as Promise<GoalkeeperPlayer>;
}

export async function fetchFormations(id: string): Promise<TacticalStyle[]> {
    let res = null;
    try {
        res = await fetch("http://localhost:8083/v1/api/calculateFormation/" + id);
    } catch (error) {
        return new Promise((resolve) => {
            console.error((error as Error).message);
            resolve({} as TacticalStyle[]);
        });
    }
    return res.json() as Promise<TacticalStyle[]>;
}