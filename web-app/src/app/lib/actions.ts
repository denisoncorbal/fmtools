'use server';

import { revalidatePath } from "next/cache";
import { CalculateFormationsRequest, FORMATION_CALCULATOR_URL, GoalkeeperPlayer, LinePlayer, POSITIONS_CALCULATOR_URL, SQUAD_MANAGER_URL } from "./definitions";

export async function createLinePlayer(prevState: unknown, formData: FormData) {
    const newLinePlayer: LinePlayer = {
        name: formData.get("name")!.toString(),
        aggression: parseInt(formData.get("aggression")!.toString()),
        anticipation: parseInt(formData.get("anticipation")!.toString()),
        bravery: parseInt(formData.get("bravery")!.toString()),
        composure: parseInt(formData.get("composure")!.toString()),
        concentration: parseInt(formData.get("concentration")!.toString()),
        decisions: parseInt(formData.get("decisions")!.toString()),
        determination: parseInt(formData.get("determination")!.toString()),
        flair: parseInt(formData.get("flair")!.toString()),
        leadership: parseInt(formData.get("leadership")!.toString()),
        offTheBall: parseInt(formData.get("offTheBall")!.toString()),
        positioning: parseInt(formData.get("positioning")!.toString()),
        teamwork: parseInt(formData.get("teamwork")!.toString()),
        vision: parseInt(formData.get("vision")!.toString()),
        workRate: parseInt(formData.get("workRate")!.toString()),
        acceleration: parseInt(formData.get("acceleration")!.toString()),
        agility: parseInt(formData.get("agility")!.toString()),
        balance: parseInt(formData.get("balance")!.toString()),
        jumpingReach: parseInt(formData.get("jumpingReach")!.toString()),
        naturalFitness: parseInt(formData.get("naturalFitness")!.toString()),
        pace: parseInt(formData.get("pace")!.toString()),
        stamina: parseInt(formData.get("stamina")!.toString()),
        strength: parseInt(formData.get("strength")!.toString()),
        freeKickTaking: parseInt(formData.get("freeKickTaking")!.toString()),
        penaltyTaking: parseInt(formData.get("penaltyTaking")!.toString()),
        technique: parseInt(formData.get("technique")!.toString()),
        firstTouch: parseInt(formData.get("firstTouch")!.toString()),
        passing: parseInt(formData.get("passing")!.toString()),
        corners: parseInt(formData.get("corners")!.toString()),
        crossing: parseInt(formData.get("crossing")!.toString()),
        dribbling: parseInt(formData.get("dribbling")!.toString()),
        finishing: parseInt(formData.get("finishing")!.toString()),
        heading: parseInt(formData.get("heading")!.toString()),
        longShots: parseInt(formData.get("longShots")!.toString()),
        longThrows: parseInt(formData.get("longThrows")!.toString()),
        marking: parseInt(formData.get("marking")!.toString()),
        tackling: parseInt(formData.get("tackling")!.toString())
    };

    console.info("INFO - " + (new Date()).toISOString() + " - Trying to POST the new line player");

    console.log("LOG - " + (new Date()).toISOString() + " - New line player: " + JSON.stringify(newLinePlayer));

    try {
        const res = await fetch(SQUAD_MANAGER_URL + "/v1/api/linePlayer", {
            method: "POST",
            body: JSON.stringify(newLinePlayer),
            headers: {
                "Content-Type": "application/json"
            }
        })

        if (!res.ok) {
            console.warn("WARN - " + (new Date()).toISOString() + " - POST new line player failed on backend");
            console.warn("WARN - " + (new Date()).toISOString() + " - Status: " + res.status);
            throw new Error((new Date()).toISOString() + " - Failed to POST", { cause: 'server' });
        }

        console.info("INFO - " + (new Date()).toISOString() + " - POST new line player with success");

        revalidatePath('/squad-manager');

    } catch (e: unknown) {
        const err = e as Error;
        if (err.cause && err.cause == 'server') {
            console.warn("WARN - " + (new Date()).toISOString() + " - " + err.message);
            console.warn("WARN - " + (new Date()).toISOString() + " - " + err.stack);
        } else {
            console.error("ERROR - " + (new Date()).toISOString() + " - " + err.message);
            console.error("ERROR - " + (new Date()).toISOString() + " - " + err.stack);
        }
    }
}

export async function editLinePlayer(prevState: unknown, formData: FormData) {
    const newLinePlayer: LinePlayer = {
        name: formData.get("name")!.toString(),
        aggression: parseInt(formData.get("aggression")!.toString()),
        anticipation: parseInt(formData.get("anticipation")!.toString()),
        bravery: parseInt(formData.get("bravery")!.toString()),
        composure: parseInt(formData.get("composure")!.toString()),
        concentration: parseInt(formData.get("concentration")!.toString()),
        decisions: parseInt(formData.get("decisions")!.toString()),
        determination: parseInt(formData.get("determination")!.toString()),
        flair: parseInt(formData.get("flair")!.toString()),
        leadership: parseInt(formData.get("leadership")!.toString()),
        offTheBall: parseInt(formData.get("offTheBall")!.toString()),
        positioning: parseInt(formData.get("positioning")!.toString()),
        teamwork: parseInt(formData.get("teamwork")!.toString()),
        vision: parseInt(formData.get("vision")!.toString()),
        workRate: parseInt(formData.get("workRate")!.toString()),
        acceleration: parseInt(formData.get("acceleration")!.toString()),
        agility: parseInt(formData.get("agility")!.toString()),
        balance: parseInt(formData.get("balance")!.toString()),
        jumpingReach: parseInt(formData.get("jumpingReach")!.toString()),
        naturalFitness: parseInt(formData.get("naturalFitness")!.toString()),
        pace: parseInt(formData.get("pace")!.toString()),
        stamina: parseInt(formData.get("stamina")!.toString()),
        strength: parseInt(formData.get("strength")!.toString()),
        freeKickTaking: parseInt(formData.get("freeKickTaking")!.toString()),
        penaltyTaking: parseInt(formData.get("penaltyTaking")!.toString()),
        technique: parseInt(formData.get("technique")!.toString()),
        firstTouch: parseInt(formData.get("firstTouch")!.toString()),
        passing: parseInt(formData.get("passing")!.toString()),
        corners: parseInt(formData.get("corners")!.toString()),
        crossing: parseInt(formData.get("crossing")!.toString()),
        dribbling: parseInt(formData.get("dribbling")!.toString()),
        finishing: parseInt(formData.get("finishing")!.toString()),
        heading: parseInt(formData.get("heading")!.toString()),
        longShots: parseInt(formData.get("longShots")!.toString()),
        longThrows: parseInt(formData.get("longThrows")!.toString()),
        marking: parseInt(formData.get("marking")!.toString()),
        tackling: parseInt(formData.get("tackling")!.toString())
    };

    console.info("INFO - " + (new Date()).toISOString() + " - Trying to PUT existing line player");

    console.log("LOG - " + (new Date()).toISOString() + " - Line player info to update: " + JSON.stringify(newLinePlayer));

    try {
        const res = await fetch(`${SQUAD_MANAGER_URL}/v1/api/linePlayer/${formData.get("id")!.toString()}`, {
            method: "PUT",
            body: JSON.stringify(newLinePlayer),
            headers: {
                "Content-Type": "application/json"
            }
        })

        if (!res.ok) {
            console.warn("WARN - " + (new Date()).toISOString() + " - PUT existing line player failed on backend");
            console.warn("WARN - " + (new Date()).toISOString() + " - Status: " + res.status);
            throw new Error((new Date()).toISOString() + " - Failed to PUT", { cause: 'server' });
        }

        console.info("INFO - " + (new Date()).toISOString() + " - PUT existing line player with success");

        revalidatePath('/squad-manager');

    } catch (e: unknown) {
        const err = e as Error;
        if (err.cause && err.cause == 'server') {
            console.warn("WARN - " + (new Date()).toISOString() + " - " + err.message);
            console.warn("WARN - " + (new Date()).toISOString() + " - " + err.stack);
        } else {
            console.error("ERROR - " + (new Date()).toISOString() + " - " + err.message);
            console.error("ERROR - " + (new Date()).toISOString() + " - " + err.stack);
        }
    }
}

export async function createGoalkeeperPlayer(prevState: unknown, formData: FormData) {
    const newGoalkeeperPlayer: GoalkeeperPlayer = {
        name: formData.get("name")!.toString(),
        aggression: parseInt(formData.get("aggression")!.toString()),
        anticipation: parseInt(formData.get("anticipation")!.toString()),
        bravery: parseInt(formData.get("bravery")!.toString()),
        composure: parseInt(formData.get("composure")!.toString()),
        concentration: parseInt(formData.get("concentration")!.toString()),
        decisions: parseInt(formData.get("decisions")!.toString()),
        determination: parseInt(formData.get("determination")!.toString()),
        flair: parseInt(formData.get("flair")!.toString()),
        leadership: parseInt(formData.get("leadership")!.toString()),
        offTheBall: parseInt(formData.get("offTheBall")!.toString()),
        positioning: parseInt(formData.get("positioning")!.toString()),
        teamwork: parseInt(formData.get("teamwork")!.toString()),
        vision: parseInt(formData.get("vision")!.toString()),
        workRate: parseInt(formData.get("workRate")!.toString()),
        acceleration: parseInt(formData.get("acceleration")!.toString()),
        agility: parseInt(formData.get("agility")!.toString()),
        balance: parseInt(formData.get("balance")!.toString()),
        jumpingReach: parseInt(formData.get("jumpingReach")!.toString()),
        naturalFitness: parseInt(formData.get("naturalFitness")!.toString()),
        pace: parseInt(formData.get("pace")!.toString()),
        stamina: parseInt(formData.get("stamina")!.toString()),
        strength: parseInt(formData.get("strength")!.toString()),
        freeKickTaking: parseInt(formData.get("freeKickTaking")!.toString()),
        penaltyTaking: parseInt(formData.get("penaltyTaking")!.toString()),
        technique: parseInt(formData.get("technique")!.toString()),
        firstTouch: parseInt(formData.get("firstTouch")!.toString()),
        passing: parseInt(formData.get("passing")!.toString()),
        aerialReach: parseInt(formData.get("aerialReach")!.toString()),
        commandOfArea: parseInt(formData.get("commandOfArea")!.toString()),
        communication: parseInt(formData.get("communication")!.toString()),
        eccentricity: parseInt(formData.get("eccentricity")!.toString()),
        handling: parseInt(formData.get("handling")!.toString()),
        kicking: parseInt(formData.get("kicking")!.toString()),
        oneOnOnes: parseInt(formData.get("oneOnOnes")!.toString()),
        punching: parseInt(formData.get("punching")!.toString()),
        reflexes: parseInt(formData.get("reflexes")!.toString()),
        rushingOut: parseInt(formData.get("rushingOut")!.toString()),
        throwing: parseInt(formData.get("throwing")!.toString())
    };

    console.info("INFO - " + (new Date()).toISOString() + " - Trying to POST the new goalkeeper player");

    console.log("LOG - " + (new Date()).toISOString() + " - New goalkeeper player: " + JSON.stringify(newGoalkeeperPlayer));

    try {

        const res = await fetch(SQUAD_MANAGER_URL + "/v1/api/goalkeeperPlayer", {
            method: "POST",
            body: JSON.stringify(newGoalkeeperPlayer),
            headers: {
                "Content-Type": "application/json"
            }
        })

        if (!res.ok) {
            console.warn("WARN - " + (new Date()).toISOString() + " - POST new goalkeeper player failed on backend");
            console.warn("WARN - " + (new Date()).toISOString() + " - Status: " + res.status);
            throw new Error((new Date()).toISOString() + " - Failed to POST", { cause: 'server' });
        }

        console.info("INFO - " + (new Date()).toISOString() + " - POST new goalkeeper player with success");

        revalidatePath('/squad-manager');

    } catch (e: unknown) {
        const err = e as Error;
        if (err.cause && err.cause == 'server') {
            console.warn("WARN - " + (new Date()).toISOString() + " - " + err.message);
            console.warn("WARN - " + (new Date()).toISOString() + " - " + err.stack);
        } else {
            console.error("ERROR - " + (new Date()).toISOString() + " - " + err.message);
            console.error("ERROR - " + (new Date()).toISOString() + " - " + err.stack);
        }
    }
}

export async function editGoalkeeperPlayer(prevState: unknown, formData: FormData) {
    const newGoalkeeperPlayer: GoalkeeperPlayer = {
        name: formData.get("name")!.toString(),
        aggression: parseInt(formData.get("aggression")!.toString()),
        anticipation: parseInt(formData.get("anticipation")!.toString()),
        bravery: parseInt(formData.get("bravery")!.toString()),
        composure: parseInt(formData.get("composure")!.toString()),
        concentration: parseInt(formData.get("concentration")!.toString()),
        decisions: parseInt(formData.get("decisions")!.toString()),
        determination: parseInt(formData.get("determination")!.toString()),
        flair: parseInt(formData.get("flair")!.toString()),
        leadership: parseInt(formData.get("leadership")!.toString()),
        offTheBall: parseInt(formData.get("offTheBall")!.toString()),
        positioning: parseInt(formData.get("positioning")!.toString()),
        teamwork: parseInt(formData.get("teamwork")!.toString()),
        vision: parseInt(formData.get("vision")!.toString()),
        workRate: parseInt(formData.get("workRate")!.toString()),
        acceleration: parseInt(formData.get("acceleration")!.toString()),
        agility: parseInt(formData.get("agility")!.toString()),
        balance: parseInt(formData.get("balance")!.toString()),
        jumpingReach: parseInt(formData.get("jumpingReach")!.toString()),
        naturalFitness: parseInt(formData.get("naturalFitness")!.toString()),
        pace: parseInt(formData.get("pace")!.toString()),
        stamina: parseInt(formData.get("stamina")!.toString()),
        strength: parseInt(formData.get("strength")!.toString()),
        freeKickTaking: parseInt(formData.get("freeKickTaking")!.toString()),
        penaltyTaking: parseInt(formData.get("penaltyTaking")!.toString()),
        technique: parseInt(formData.get("technique")!.toString()),
        firstTouch: parseInt(formData.get("firstTouch")!.toString()),
        passing: parseInt(formData.get("passing")!.toString()),
        aerialReach: parseInt(formData.get("aerialReach")!.toString()),
        commandOfArea: parseInt(formData.get("commandOfArea")!.toString()),
        communication: parseInt(formData.get("communication")!.toString()),
        eccentricity: parseInt(formData.get("eccentricity")!.toString()),
        handling: parseInt(formData.get("handling")!.toString()),
        kicking: parseInt(formData.get("kicking")!.toString()),
        oneOnOnes: parseInt(formData.get("oneOnOnes")!.toString()),
        punching: parseInt(formData.get("punching")!.toString()),
        reflexes: parseInt(formData.get("reflexes")!.toString()),
        rushingOut: parseInt(formData.get("rushingOut")!.toString()),
        throwing: parseInt(formData.get("throwing")!.toString())
    };

    console.info("INFO - " + (new Date()).toISOString() + " - Trying to PUT existing goalkeeper player");

    console.log("LOG - " + (new Date()).toISOString() + " - Goalkeeper player info to update: " + JSON.stringify(newGoalkeeperPlayer));

    try {

        const res = await fetch(`${SQUAD_MANAGER_URL}/v1/api/goalkeeperPlayer/${formData.get('id')!.toString()}`, {
            method: "PUT",
            body: JSON.stringify(newGoalkeeperPlayer),
            headers: {
                "Content-Type": "application/json"
            }
        })

        if (!res.ok) {
            console.warn("WARN - " + (new Date()).toISOString() + " - PUT existing goalkeeper player failed on backend");
            console.warn("WARN - " + (new Date()).toISOString() + " - Status: " + res.status);
            throw new Error((new Date()).toISOString() + " - Failed to PUT", { cause: 'server' });
        }

        console.info("INFO - " + (new Date()).toISOString() + " - PUT existing goalkeeper player with success");

        revalidatePath('/squad-manager');

    } catch (e: unknown) {
        const err = e as Error;
        if (err.cause && err.cause == 'server') {
            console.warn("WARN - " + (new Date()).toISOString() + " - " + err.message);
            console.warn("WARN - " + (new Date()).toISOString() + " - " + err.stack);
        } else {
            console.error("ERROR - " + (new Date()).toISOString() + " - " + err.message);
            console.error("ERROR - " + (new Date()).toISOString() + " - " + err.stack);
        }
    }
}

export async function removeLinePlayer(prevState: unknown, formData: FormData) {
    console.info("INFO - " + (new Date()).toISOString() + " - Trying to DELETE line player");

    const playerId = formData.get('id')!.toString();

    console.log("LOG - " + (new Date()).toISOString() + " - Line player id: " + playerId);

    try {

        const res = await fetch(`${SQUAD_MANAGER_URL}/v1/api/linePlayer/${playerId}`, {
            method: "DELETE",
            headers: {
                "Content-Type": "application/json"
            }
        })

        if (!res.ok) {
            console.warn("WARN - " + (new Date()).toISOString() + " - DELETE line player failed on backend");
            console.warn("WARN - " + (new Date()).toISOString() + " - Status: " + res.status);
            throw new Error((new Date()).toISOString() + " - Failed to DELETE", { cause: 'server' });
        }

        console.info("INFO - " + (new Date()).toISOString() + " - DELETE line player with success");

        revalidatePath('/squad-manager');

    } catch (e: unknown) {
        const err = e as Error;
        if (err.cause && err.cause == 'server') {
            console.warn("WARN - " + (new Date()).toISOString() + " - " + err.message);
            console.warn("WARN - " + (new Date()).toISOString() + " - " + err.stack);
        } else {
            console.error("ERROR - " + (new Date()).toISOString() + " - " + err.message);
            console.error("ERROR - " + (new Date()).toISOString() + " - " + err.stack);
        }
    }
}

export async function removeGoalkeeperPlayer(prevState: unknown, formData: FormData) {
    console.info("INFO - " + (new Date()).toISOString() + " - Trying to DELETE goalkeeper player");

    const playerId = formData.get('id')!.toString();

    console.log("LOG - " + (new Date()).toISOString() + " - Goalkeeper player id: " + playerId);

    try {

        const res = await fetch(`${SQUAD_MANAGER_URL}/v1/api/goalkeeperPlayer/${playerId}`, {
            method: "DELETE",
            headers: {
                "Content-Type": "application/json"
            }
        })

        if (!res.ok) {
            console.warn("WARN - " + (new Date()).toISOString() + " - DELETE goalkeeper player failed on backend");
            console.warn("WARN - " + (new Date()).toISOString() + " - Status: " + res.status);
            throw new Error((new Date()).toISOString() + " - Failed to DELETE", { cause: 'server' });
        }

        console.info("INFO - " + (new Date()).toISOString() + " - DELETE goalkeeper player with success");

        revalidatePath('/squad-manager');

    } catch (e: unknown) {
        const err = e as Error;
        if (err.cause && err.cause == 'server') {
            console.warn("WARN - " + (new Date()).toISOString() + " - " + err.message);
            console.warn("WARN - " + (new Date()).toISOString() + " - " + err.stack);
        } else {
            console.error("ERROR - " + (new Date()).toISOString() + " - " + err.message);
            console.error("ERROR - " + (new Date()).toISOString() + " - " + err.stack);
        }
    }
}

export async function calculateLinePositions(prevState: unknown, formData: FormData): Promise<string> {
    console.info("INFO - " + (new Date()).toISOString() + " - Trying to POST line positions");

    const playerId = formData.get("select-player")?.toString();

    console.log("LOG - " + (new Date()).toISOString() + " - Line player id: " + playerId);

    try {
        const res = await fetch(POSITIONS_CALCULATOR_URL + "/v1/api/calculateLinePositions/" + playerId, {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            }
        })

        if (!res.ok) {
            console.warn("WARN - " + (new Date()).toISOString() + " - POST line positions failed on backend");
            console.warn("WARN - " + (new Date()).toISOString() + " - Status: " + res.status);
            throw new Error((new Date()).toISOString() + " - Failed to POST", { cause: 'server' });
        }

        console.info("INFO - " + (new Date()).toISOString() + " - POST line positions with success");

        revalidatePath('/positions-calculator/positions-result/' + formData.get("player-type") + "/" + playerId);
        return Promise.resolve('/positions-calculator/positions-result/' + formData.get("player-type") + "/" + playerId);
    } catch (e: unknown) {
        const err = e as Error;
        if (err.cause && err.cause == 'server') {
            console.warn("WARN - " + (new Date()).toISOString() + " - " + err.message);
            console.warn("WARN - " + (new Date()).toISOString() + " - " + err.stack);
        } else {
            console.error("ERROR - " + (new Date()).toISOString() + " - " + err.message);
            console.error("ERROR - " + (new Date()).toISOString() + " - " + err.stack);
        }
    }
    return Promise.resolve("");
}

export async function calculateGoalkeeperPositions(prevState: unknown, formData: FormData): Promise<string> {
    console.info("INFO - " + (new Date()).toISOString() + " - Trying to POST goalkeeper positions");

    const playerId = formData.get("select-player")?.toString();

    console.log("LOG - " + (new Date()).toISOString() + " - Goalkeeper player id: " + playerId);

    try {

        const res = await fetch(POSITIONS_CALCULATOR_URL + "/v1/api/calculateGoalkeeperPositions/" + playerId, {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            }
        })

        if (!res.ok) {
            console.warn("WARN - " + (new Date()).toISOString() + " - POST goalkeeper positions failed on backend");
            console.warn("WARN - " + (new Date()).toISOString() + " - Status: " + res.status);
            throw new Error((new Date()).toISOString() + " - Failed to POST", { cause: 'server' });
        }

        console.info("INFO - " + (new Date()).toISOString() + " - POST goalkeeper positions with success");

        revalidatePath('/positions-calculator/positions-result/' + formData.get("player-type") + "/" + playerId);
        return Promise.resolve('/positions-calculator/positions-result/' + formData.get("player-type") + "/" + playerId);
    } catch (e: unknown) {
        const err = e as Error;
        if (err.cause && err.cause == 'server') {
            console.warn("WARN - " + (new Date()).toISOString() + " - " + err.message);
            console.warn("WARN - " + (new Date()).toISOString() + " - " + err.stack);
        } else {
            console.error("ERROR - " + (new Date()).toISOString() + " - " + err.message);
            console.error("ERROR - " + (new Date()).toISOString() + " - " + err.stack);
        }
    }
    return Promise.resolve("");
}

export async function calculateFormations(prevState: unknown, formData: FormData) {
    console.info("INFO - " + (new Date()).toISOString() + " - Trying to POST calculate formations");

    const calculateFormationsRequest: CalculateFormationsRequest = {
        linePlayersIds: [],
        goalkeeperPlayersIds: []
    };

    formData.keys().filter((k) => k.includes("line")).forEach(
        (v, index) => {
            const playerId = formData.get(v)!.toString();
            console.log("LOG - " + (new Date()).toISOString() + " - Line player id [" + index + "]: " + playerId);
            calculateFormationsRequest.linePlayersIds.push(playerId);
        });
    formData.keys().filter((k) => k.includes("goalkeeper")).forEach(
        (v, index) => {
            const playerId = formData.get(v)!.toString();
            console.log("LOG - " + (new Date()).toISOString() + " - Goalkeeper player id [" + index + "]: " + playerId);
            calculateFormationsRequest.goalkeeperPlayersIds.push(playerId);
        });

    try {
        const res = await fetch(FORMATION_CALCULATOR_URL + "/v1/api/calculateFormation", {
            method: "POST",
            body: JSON.stringify(calculateFormationsRequest),
            headers: {
                "Content-Type": "application/json"
            }
        })

        if (!res.ok) {
            console.warn("WARN - " + (new Date()).toISOString() + " - POST calculate formations");
            console.warn("WARN - " + (new Date()).toISOString() + " - Status: " + res.status);
            throw new Error((new Date()).toISOString() + " - Failed to POST", { cause: 'server' });
        }

        const id = await res.json();

        console.info("INFO - " + (new Date()).toISOString() + " - POST calculate formations with success");

        revalidatePath('/formations-calculator/formations-result/' + id);
        return Promise.resolve('/formations-calculator/formations-result/' + id);
    } catch (e: unknown) {
        const err = e as Error;
        if (err.cause && err.cause == 'server') {
            console.warn("WARN - " + (new Date()).toISOString() + " - " + err.message);
            console.warn("WARN - " + (new Date()).toISOString() + " - " + err.stack);
        } else {
            console.error("ERROR - " + (new Date()).toISOString() + " - " + err.message);
            console.error("ERROR - " + (new Date()).toISOString() + " - " + err.stack);
        }
    }
    return Promise.resolve("");

}