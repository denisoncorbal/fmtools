"use server";

import { headers } from "next/headers";
import { redirect } from "next/navigation";

const tacticApiPath =
  process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_TACTIC_PATH!;
const squadApiPath =
  process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_SQUAD_PATH!;

export async function createTactic(data: FormData) {
  const h = await headers();
  const host = h.get("host");
  const res = await fetch(`http://${host}/proxy/backend`, {
    method: "POST",
    body: JSON.stringify({
      url: tacticApiPath,
      data: { name: data.get("name"), teamId: data.get("teamId") },
    }),
    headers: {
      "Content-Type": "application/json",
    },
  });
  if (res.status == 200) {
    redirect(`/team/${data.get("teamId")}`);
  }
}

export async function createSquad(data: FormData) {
  const h = await headers();
  const host = h.get("host");
  const res = await fetch(`http://${host}/proxy/backend`, {
    method: "POST",
    body: JSON.stringify({
      url: squadApiPath,
      data: { name: data.get("name"), teamId: data.get("teamId") },
    }),
    headers: {
      "Content-Type": "application/json",
    },
  });
  if (res.status == 200) {
    redirect(`/team/${data.get("teamId")}`);
  }
}
