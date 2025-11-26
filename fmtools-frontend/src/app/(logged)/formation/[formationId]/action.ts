'use server'

import { cookies, headers } from "next/headers";
import { redirect } from "next/navigation";

const bestFormationApiPath = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_BEST_FORMATION_PATH!;

export default async function calculatePositions(data: FormData) {
    const h = await headers();
    const host = h.get('host');
    const ck = await cookies();
    const tacticalPositions = data.get('tacticalPositions')?.toString().split(',');
    const squadId = data.get('squad')?.toString();

    const res = await fetch(`http://${host}/proxy/backend`, {
        method: 'POST',
        body: JSON.stringify({ url: bestFormationApiPath, data: { tacticalPositions: tacticalPositions, squadId: squadId } }),
        headers: {
            'Content-Type': 'application/json',
            cookie: ck.toString()
        }
    })

    if (res.status == 200) {
        redirect(`/formation/${data.get('formationId')?.toString()}`);
    }
}