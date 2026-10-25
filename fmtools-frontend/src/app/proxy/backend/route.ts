"use server";
import { getToken } from "next-auth/jwt";
import { NextRequest } from "next/server";

const refreshApiPath =
  process.env.BACKEND_COMPLETE_BASE_URL! +
  process.env.BACKEND_API_REFRESH_PATH!;
const accessTokenName = process.env.ACCESS_TOKEN_NAME!;
const refreshTokenName = process.env.REFRESH_TOKEN_NAME!;

export async function GET(req: NextRequest) {
  const searchParams = req.nextUrl.searchParams;
  const url = searchParams.get("url");
  const resp = await backendFetch(url!, req);
  const data = await resp.json();
  return Response.json(data, { status: resp.status });
}

export async function POST(req: NextRequest) {
  const contentType = req.headers.get("content-type") || "";
  let resp = null;
  if (contentType.includes("application/json")) {
    const body = await req.json();
    resp = await backendFetch(body.url!, req, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(body.data),
    });
  }
  if (contentType.includes("multipart/form-data")) {
    const body = await req.formData();
    const url = body.get("url")!.toString();
    body.delete("url");
    resp = await backendFetch(url, req, {
      method: "POST",
      body: body,
    });
  }

  const data = await resp!.json();
  return Response.json(data, { status: resp!.status });
}

async function getTokens(req: NextRequest) {
  const token = await getToken({
    req: req,
    secret: process.env.NEXTAUTH_SECRET,
  });
  return {
    access: token?.accessToken,
    refresh: token?.refreshToken,
  };
}

async function backendFetch(
  url: string,
  req: NextRequest,
  options: RequestInit = {},
) {
  let { access, refresh } = await getTokens(req);
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

  return res;
}
