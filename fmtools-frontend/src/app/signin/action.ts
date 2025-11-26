'use server'

import { redirect } from "next/navigation";

const signInApiPath = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_SIGNIN_PATH!;

export async function signIn(prevState: unknown, formData: FormData) {
    const res = await fetch(signInApiPath, {
        method: "POST",
        body: JSON.stringify({ username: formData.get('username'), password: formData.get('password') }),
        headers: {
            'Content-Type': 'application/json'
        }
    })

    if (res.status == 500) {
        return { message: 'Server is not functioning. Try again later' };
    }

    if (res.status != 200) {
        return { message: 'Invalid username or password' };
    }

    const jsonRes = await res.json() as { id: string };
    if (jsonRes.id == null) {
        return { message: 'Invalid username or password' };
    }
    redirect('/login');
}