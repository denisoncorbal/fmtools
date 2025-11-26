'use server'

import { cookies } from "next/headers";
import { NextRequest, NextResponse } from "next/server";

const loginApiPath = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_LOGIN_PATH!;
const accessTokenName = process.env.ACCESS_TOKEN_NAME!;
const refreshTokenName = process.env.REFRESH_TOKEN_NAME!;

export async function POST(req: NextRequest) {
    const body = await req.json();

    const backendResp = await fetch(loginApiPath, {
        method: "POST",
        body: JSON.stringify(body),
        headers: { "Content-Type": "application/json" },
    });

    if (!backendResp.ok) {
        return new NextResponse("Invalid credentials", { status: 401 });
    }

    const { accessToken, refreshToken } = await backendResp.json();

    // criar cookies httpOnly
    const cookieStore = await cookies();

    cookieStore.set(accessTokenName, accessToken, {
        httpOnly: true,
        secure: true,
        sameSite: "strict",
        path: "/",
        maxAge: 60 * 15, // 15 min
    });

    cookieStore.set(refreshTokenName, refreshToken, {
        httpOnly: true,
        secure: true,
        sameSite: "strict",
        path: "/",
        maxAge: 60 * 60 * 24 * 30, // 30 dias
    });

    return NextResponse.json({ ok: true });
}