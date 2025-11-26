'use server'

import { cookies, headers } from "next/headers";
import { redirect } from "next/navigation";

const tacticalStyleApiPath = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_TACTICAL_STYLE_PATH!;
const squadApiPath = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_SQUAD_PATH!;

export async function createTacticalStyle(data: FormData) {
    const h = await headers();
    const host = h.get('host');
    const ck = await cookies();
    const res = await fetch(`http://${host}/proxy/backend`, {
        method: 'POST',
        body: JSON.stringify({ url: tacticalStyleApiPath, data: { name: data.get("name"), tacticId: data.get('tacticId') } }),
        headers: {
            cookie: ck.toString(),
            'Content-Type': 'application/json'
        }
    })
    if (res.status == 200) {
        redirect(`/tactic/${data.get('tacticId')}`);
    }
}

export async function createSquad(data: FormData) {
    const h = await headers();
    const host = h.get('host');
    const ck = await cookies();
    const res = await fetch(`http://${host}/proxy/backend`, {
        method: 'POST',
        body: JSON.stringify({ url: squadApiPath, data: { name: data.get("name"), teamId: data.get('teamId') } }),
        headers: {
            cookie: ck.toString(),
            'Content-Type': 'application/json'
        }
    })
    if (res.status == 200) {
        redirect(`/team/${data.get('teamId')}`);
    }
}