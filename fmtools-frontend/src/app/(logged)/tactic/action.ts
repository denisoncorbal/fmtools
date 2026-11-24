"use server";

import { redirect } from "next/navigation";

const tacticApiPath =
  process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_TACTIC_PATH!;

export default async function createTactic(data: FormData) {
  const res = await fetch(`${tacticApiPath}`, {
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
    redirect("/tactic");
  }
}
