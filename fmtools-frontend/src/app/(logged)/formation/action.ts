"use server";

import { redirect } from "next/navigation";

const apiSquadPath =
  process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_SQUAD_PATH!;

export default async function createFormation(data: FormData) {
  const res = await fetch(`${apiSquadPath}`, {
    method: "POST",
    body: JSON.stringify({
      name: data.get("name")?.toString(),
      teamId: data.get("team")?.toString(),
    }),
    headers: {
      "Content-Type": "application/json",
    },
    credentials: "include",
  });

  if (res.status == 200) {
    redirect("/squad");
  }
}
