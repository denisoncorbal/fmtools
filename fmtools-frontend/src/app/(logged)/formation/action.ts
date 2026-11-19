"use server";

import { headers } from "next/headers";
import { redirect } from "next/navigation";

const apiSquadPath =
  process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_SQUAD_PATH!;

export default async function createFormation(data: FormData) {
  const h = await headers();
  const host = h.get("host");
  const res = await fetch(`http://${host}/proxy/backend`, {
    method: "POST",
    body: JSON.stringify({
      url: apiSquadPath,
      data: {
        name: data.get("name")?.toString(),
        teamId: data.get("team")?.toString(),
      },
    }),
    headers: {
      "Content-Type": "application/json",
    },
  });

  if (res.status == 200) {
    redirect("/squad");
  }
}
