'use server'

import { cookies, headers } from "next/headers";
import { redirect } from "next/navigation";

const teamApiPath = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_TEAM_PATH!;

export default async function createTeam(prevState: unknown, data: FormData) {
    const h = await headers();
    const host = h.get('host');
    const ck = await cookies();

    const res = await fetch(`http://${host}/proxy/backend`, {
        method: "POST",
        body: JSON.stringify({ url: teamApiPath, data: { name: data.get('name')?.toString() } }),
        headers: {
            cookie: ck.toString(),
            'Content-Type': 'application/json',
        }
    })

    if (res.status == 500) {
        return { message: 'Server is not working. Try again later' }
    }

    if (res.status == 200) {
        redirect('/team');
    }

    return { message: 'Could not create the Team. Try again later' }
}