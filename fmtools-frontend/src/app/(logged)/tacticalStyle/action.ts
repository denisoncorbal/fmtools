'use server'

import { cookies, headers } from "next/headers";
import { redirect } from "next/navigation";

const tactialStyleApiPath = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_TACTICAL_STYLE_PATH!;

export default async function createTacticalStyle(data: FormData) {
    const h = await headers();
    const host = h.get('host');
    const ck = await cookies();
    const res = await fetch(`http://${host}/proxy/backend`, {
        method: 'POST',
        body: JSON.stringify({ url: tactialStyleApiPath, data: { name: data.get('name')?.toString(), tacticId: data.get('tactic') } }),
        headers: {
            cookie: ck.toString(),
            'Content-Type': 'application/json'
        }
    })

    if (res.status == 200) {
        redirect('/tacticalStyle');
    }
}