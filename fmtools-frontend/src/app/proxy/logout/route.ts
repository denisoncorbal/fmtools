'use server'

import { cookies, headers } from "next/headers";
import { NextResponse } from "next/server";

const accessTokenName = process.env.ACCESS_TOKEN_NAME!;
const refreshTokenName = process.env.REFRESH_TOKEN_NAME!;

export async function GET() {
    const h = await headers();
    const host = h.get('host');
    const cookieStore = await cookies();

    cookieStore.set(accessTokenName, '', {
        httpOnly: true,
        secure: true,
        sameSite: "strict",
        path: "/",
        maxAge: 0
    });

    cookieStore.set(refreshTokenName, '', {
        httpOnly: true,
        secure: true,
        sameSite: "strict",
        path: "/",
        maxAge: 0
    });

    return NextResponse.redirect(`http://${host}/login`);
}