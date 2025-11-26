'use server'
import { cookies } from "next/headers";
import { NextRequest } from 'next/server';

const refreshApiPath = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_REFRESH_PATH!;
const accessTokenName = process.env.ACCESS_TOKEN_NAME!;
const refreshTokenName = process.env.REFRESH_TOKEN_NAME!;

export async function GET(req: NextRequest) {
    const searchParams = req.nextUrl.searchParams;
    const url = searchParams.get('url')
    const resp = await backendFetch(url!);
    const data = await resp.json();
    return Response.json(data, { status: resp.status });
}

export async function POST(req: NextRequest) {
    const contentType = req.headers.get("content-type") || "";
    let resp = null;
    if (contentType.includes('application/json')) {
        const body = await req.json();
        resp = await backendFetch(body.url!, {
            method: 'POST',
            headers:
                { 'Content-Type': 'application/json' },
            body: JSON.stringify(body.data)
        });
    }
    if (contentType.includes('multipart/form-data')) {
        const body = await req.formData();
        const url = body.get('url')!.toString();
        body.delete('url');
        resp = await backendFetch(url, {
            method: 'POST',
            body: body
        });
    }

    const data = await resp!.json();
    return Response.json(data, { status: resp!.status });
}

async function getTokens() {
    const cookieStore = await cookies();
    return {
        access: cookieStore.get(accessTokenName)?.value,
        refresh: cookieStore.get(refreshTokenName)?.value,
    };
}


async function backendFetch(url: string, options: RequestInit = {}) {
    let { access, refresh } = await getTokens();
    async function doRequest() {
        return await fetch(url, {
            ...options,
            headers: {
                ...(options.headers || {}),
                Authorization: `Bearer ${access}`,
            },
            credentials: "include",
        });
    }

    let res = await doRequest();

    if (res.status === 401 || res.status === 403) {
        // tentar refresh
        const refreshResp = await fetch(refreshApiPath, {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify({ accessToken: access, refreshToken: refresh }),
        });

        if (!refreshResp.ok) return res;

        const { accessToken: newAccess, refreshToken: newRefresh } =
            await refreshResp.json();

        // atualizar cookies
        const cookieStore = await cookies();
        cookieStore.set(accessTokenName, newAccess, {
            httpOnly: true,
            secure: true,
            sameSite: "strict",
            path: "/",
            maxAge: 60 * 15,
        });
        cookieStore.set(refreshTokenName, newRefresh, {
            httpOnly: true,
            secure: true,
            sameSite: "strict",
            path: "/",
            maxAge: 60 * 60 * 24 * 30,
        });

        // atualizar variáveis locais
        access = newAccess;
        refresh = newRefresh;

        // refazer requisição original
        res = await doRequest();
    }

    return res;
}