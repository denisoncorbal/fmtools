"use server";

import { redirect } from "next/navigation";

const tacticalStyleApiPath =
  process.env.NEXT_PUBLIC_BACKEND_COMPLETE_BASE_URL! +
  process.env.NEXT_PUBLIC_BACKEND_API_TACTICAL_STYLE_PATH!;
const squadApiPath =
  process.env.NEXT_PUBLIC_BACKEND_COMPLETE_BASE_URL! + process.env.NEXT_PUBLIC_BACKEND_API_SQUAD_PATH!;

export async function createTacticalStyle(data: FormData) {
  const res = await fetch(`${tacticalStyleApiPath}`, {
    method: "POST",
    body: JSON.stringify({
      name: data.get("name"),
      tacticId: data.get("tacticId"),
    }),
    headers: {
      "Content-Type": "application/json",
    },
    credentials: "include",
  });
  if (res.status == 200) {
    redirect(`/tactic/${data.get("tacticId")}`);
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
