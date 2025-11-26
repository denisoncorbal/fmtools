'use server'

import { parseSetCookie } from 'next/dist/compiled/@edge-runtime/cookies';
import { cookies, headers } from 'next/headers';
import { redirect } from "next/navigation";

export async function login(prevState: unknown, formData: FormData) {
    const h = await headers();
    const host = h.get('host');

    const res = await fetch(`http://${host}/proxy/login`, {
        method: "POST",
        body: JSON.stringify({ username: formData.get('username'), password: formData.get('password') }),
        headers: {
            'Content-Type': 'application/json'
        }
    });

    if (res.status == 500) {
        return { message: 'Server is not functioning. Try again later' };
    }

    if (res.status != 200) {
        return { message: 'Username or password are wrong' };
    }

    const ck = await cookies();
    const setCookieHeaders = res.headers.getSetCookie();

    for (const cookieString of setCookieHeaders) {
        const parsedCookie = parseSetCookie(cookieString);
        ck.set(parsedCookie!);
    }

    redirect('/team');
}