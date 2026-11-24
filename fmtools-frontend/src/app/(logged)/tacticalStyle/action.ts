"use server";

import { redirect } from "next/navigation";

const tactialStyleApiPath =
  process.env.BACKEND_COMPLETE_BASE_URL! +
  process.env.BACKEND_API_TACTICAL_STYLE_PATH!;

export default async function createTacticalStyle(data: FormData) {
  const res = await fetch(`${tactialStyleApiPath}`, {
    method: "POST",
    body: JSON.stringify({
      name: data.get("name")?.toString(),
      tacticId: data.get("tactic"),
    }),
    headers: {
      "Content-Type": "application/json",
    },
    credentials: "include",
  });

  if (res.status == 200) {
    redirect("/tacticalStyle");
  }
}
