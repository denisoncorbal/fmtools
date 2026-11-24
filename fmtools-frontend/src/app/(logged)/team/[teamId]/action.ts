"use server";

import { redirect } from "next/navigation";

const tacticApiPath =
  process.env.NEXT_PUBLIC_BACKEND_COMPLETE_BASE_URL! + process.env.NEXT_PUBLIC_BACKEND_API_TACTIC_PATH!;
const squadApiPath =
  process.env.NEXT_PUBLIC_BACKEND_COMPLETE_BASE_URL! + process.env.NEXT_PUBLIC_BACKEND_API_SQUAD_PATH!;

export async function createTactic(data: FormData) {
  const res = await fetch(`${tacticApiPath}`, {
    method: "POST",
    body: JSON.stringify({
      name: data.get("name"),
      teamId: data.get("teamId"),
    }),
    headers: {
      "Content-Type": "application/json",
    },
    credentials: "include",
  });
  if (res.status == 200) {
    redirect(`/team/${data.get("teamId")}`);
  }
}

export async function createSquad(data: FormData) {
  const res = await fetch(`${squadApiPath}`, {
    method: "POST",
    body: JSON.stringify({
      name: data.get("name"),
      teamId: data.get("teamId"),
    }),
    headers: {
      "Content-Type": "application/json",
    },
    credentials: "include",
  });
  if (res.status == 200) {
    redirect(`/team/${data.get("teamId")}`);
  }
}
