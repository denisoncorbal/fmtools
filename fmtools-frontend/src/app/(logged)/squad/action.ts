"use server";

import { redirect } from "next/navigation";

const squadApiPath =
  process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_SQUAD_PATH!;

export default async function createSquad(data: FormData) {
  const res = await fetch("", {
    method: "POST",
    body: JSON.stringify({
      url: squadApiPath,
      data: {
        name: data.get("name")?.toString(),
        teamId: data.get("team")?.toString(),
      },
    }),
  });

  if (res.status == 200) {
    redirect("/squad");
  }
}
