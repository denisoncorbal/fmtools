"use client";

const meApiPath =
  process.env.NEXT_PUBLIC_BACKEND_COMPLETE_BASE_URL! +
  process.env.NEXT_PUBLIC_BACKEND_API_AUTH_ME_PATH!;

export interface User {
  id: string;
  name: string;
  email: string;
  roles: string[];
  permissions: string[];
}

export async function getMe(): Promise<User | null> {
  const response = await fetch(meApiPath, {
    method: "GET",
    credentials: "include",
    headers: {
      "Content-Type": "application/json",
    },
    cache: "no-store",
    redirect: "error",
  });

  if (response.status === 401) {
    return null;
  }

  if (!response.ok) {
    throw new Error("Fail to get user info");
  }

  return response.json();
}
