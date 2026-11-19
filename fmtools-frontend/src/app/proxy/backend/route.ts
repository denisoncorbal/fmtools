"use server";
import { NextRequest } from "next/server";

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
    resp = await backendFetch(body.url!, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(body.data),
    });
  }
  if (contentType.includes("multipart/form-data")) {
    const body = await req.formData();
    const url = body.get("url")!.toString();
    body.delete("url");
    resp = await backendFetch(url, {
      method: "POST",
      body: body,
    });
  }

  const data = await resp!.json();
  return Response.json(data, { status: resp!.status });
}

async function backendFetch(url: string, options: RequestInit = {}) {
  console.log("Backend fetch on url: " + url);
  return await fetch(url, {
    ...options,
    credentials: "include",
    redirect: "error",
  });
}
