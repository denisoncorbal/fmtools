'use server';

import { revalidatePath } from "next/cache";
import { redirect } from "next/navigation";
import { Agent, fetch as ft } from "undici";
import { CalculateFormationsRequest, GoalkeeperPlayer, LinePlayer } from "./definitions";

export async function createLinePlayer(formData: FormData) {
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

    await fetch("http://localhost:8081/v1/api/linePlayer", {
        method: "POST",
        body: JSON.stringify(newLinePlayer),
        headers: {
            "Content-Type": "application/json"
        }
    })

    revalidatePath('/squad-manager');
}

export async function editLinePlayer(formData: FormData) {
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

    await fetch(`http://localhost:8081/v1/api/linePlayer/${formData.get("id")!.toString()}`, {
        method: "PUT",
        body: JSON.stringify(newLinePlayer),
        headers: {
            "Content-Type": "application/json"
        }
    })

    revalidatePath('/squad-manager');
}

export async function createGoalkeeperPlayer(formData: FormData) {
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

    await fetch("http://localhost:8081/v1/api/goalkeeperPlayer", {
        method: "POST",
        body: JSON.stringify(newGoalkeeperPlayer),
        headers: {
            "Content-Type": "application/json"
        }
    })

    revalidatePath('/squad-manager');
}

export async function editGoalkeeperPlayer(formData: FormData) {
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

    await fetch(`http://localhost:8081/v1/api/goalkeeperPlayer/${formData.get('id')!.toString()}`, {
        method: "PUT",
        body: JSON.stringify(newGoalkeeperPlayer),
        headers: {
            "Content-Type": "application/json"
        }
    })

    revalidatePath('/squad-manager');
}

export async function removeLinePlayer(formData: FormData) {
    await fetch(`http://localhost:8081/v1/api/linePlayer/${formData.get('id')!.toString()}`, {
        method: "DELETE",
        headers: {
            "Content-Type": "application/json"
        }
    })

    revalidatePath('/squad-manager');
}

export async function removeGoalkeeperPlayer(formData: FormData) {
    await fetch(`http://localhost:8081/v1/api/goalkeeperPlayer/${formData.get('id')!.toString()}`, {
        method: "DELETE",
        headers: {
            "Content-Type": "application/json"
        }
    })

    revalidatePath('/squad-manager');
}

export async function calculateLinePositions(formData: FormData) {
    console.log(formData.get("select-player")?.toString());
    await fetch("http://localhost:8082/v1/api/calculateLinePositions/" + formData.get("select-player")?.toString(), {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        }
    })

    revalidatePath('/positions-calculator/positions-result/' + formData.get("player-type") + "/" + formData.get("select-player")?.toString());
    redirect('/positions-calculator/positions-result/' + formData.get("player-type") + "/" + formData.get("select-player")?.toString());
}

export async function calculateGoalkeeperPositions(formData: FormData) {
    await fetch("http://localhost:8082/v1/api/calculateGoalkeeperPositions/" + formData.get("select-player")?.toString(), {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        }
    })

    revalidatePath('/positions-calculator/positions-result/' + formData.get("player-type") + "/" + formData.get("select-player")?.toString());
    redirect('/positions-calculator/positions-result/' + formData.get("player-type") + "/" + formData.get("select-player")?.toString());
}

export async function calculateFormations(formData: FormData) {
    const calculateFormationsRequest: CalculateFormationsRequest = {
        linePlayersIds: [],
        goalkeeperPlayersIds: []
    };
    formData.keys().filter((k) => k.includes("line")).forEach((v) => calculateFormationsRequest.linePlayersIds.push(formData.get(v)!.toString()));
    formData.keys().filter((k) => k.includes("goalkeeper")).forEach((v) => calculateFormationsRequest.goalkeeperPlayersIds.push(formData.get(v)!.toString()));

    const res = await ft("http://localhost:8083/v1/api/calculateFormation", {
        method: "POST",
        body: JSON.stringify(calculateFormationsRequest),
        headers: {
            "Content-Type": "application/json"
        },
        dispatcher: new Agent({ headersTimeout: (60000 * 25) })
    })

    const id = await res.json();

    revalidatePath('/formations-calculator/formations-result/' + id);
    redirect('/formations-calculator/formations-result/' + id);
}