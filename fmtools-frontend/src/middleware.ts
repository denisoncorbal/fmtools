'use server'
import { cookies } from 'next/headers';
import { NextRequest, NextResponse } from 'next/server';

const accessTokenName = process.env.ACCESS_TOKEN_NAME!;
const refreshTokenName = process.env.REFRESH_TOKEN_NAME!;
const refreshApiAddress = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_REFRESH_PATH!;

export async function middleware(request: NextRequest) {
    const ck = await cookies();
    const [isAuthenticated, token] = await authenticate(request);

    // If the user is authenticated, continue as normal
    if (isAuthenticated) {
        if (token.length > 0) {
            ck.set(accessTokenName, token, {
                httpOnly: true,
                secure: false,
                sameSite: 'strict',
                path: '/',
                maxAge: 60 * 15
            })
        }
        return NextResponse.next();
    }

    // Redirect to login page if not authenticated
    const res = NextResponse.redirect(new URL('/login', request.url))
    res.cookies.set(accessTokenName, "", {
        maxAge: 0
    });
    res.cookies.set(refreshTokenName, "", {
        maxAge: 0
    });
    return res;
}

async function authenticate(request: NextRequest): Promise<[boolean, string]> {
    const ck = await cookies();

    if (ck.has(accessTokenName) && ck.has(refreshTokenName))
        return [true, ''];

    if (!ck.has(refreshTokenName))
        return [false, ''];

    const refreshToken = request.cookies.get(refreshTokenName)!;

    const res = await fetch(refreshApiAddress, {
        method: "POST",
        body: JSON.stringify({ refreshToken: refreshToken.value }),
        headers: {
            'Content-Type': 'application/json'
        }
    });

    if (res.status != 200) {
        return [false, ''];
    }

    const jsonRes = await res.json();
    const newAccessToken = jsonRes.accessToken;

    return [true, newAccessToken];
}

export const config = {
    matcher: ['/team/:path*', '/squad/:path*', '/formation/:path*', '/tactic:path*', '/tacticalStyle:path*']
}
