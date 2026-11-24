"use server";

import { redirect } from "next/navigation";

const squadApiPath =
  process.env.NEXT_PUBLIC_BACKEND_COMPLETE_BASE_URL! + process.env.NEXT_PUBLIC_BACKEND_API_SQUAD_PATH!;

export default async function createSquad(data: FormData) {
  const res = await fetch(`${squadApiPath}`, {
    method: "POST",
    body: JSON.stringify({
      name: data.get("name")?.toString(),
      teamId: data.get("team")?.toString(),
    }),
    credentials: "include",
  });

  if (res.status == 200) {
    redirect("/squad");
  }
}
