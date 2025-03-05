import { GoalkeeperPlayer, LinePlayer } from "./definitions";

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