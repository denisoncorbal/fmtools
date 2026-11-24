"use server";

import { redirect } from "next/navigation";

const teamApiPath =
  process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_TEAM_PATH!;

export default async function createTeam(prevState: unknown, data: FormData) {
  const res = await fetch(`${teamApiPath}`, {
    method: "POST",
    body: JSON.stringify({ name: data.get("name")?.toString() }),
    headers: {
      "Content-Type": "application/json",
    },
    credentials: "include",
  });

  if (res.status == 500) {
    return { message: "Server is not working. Try again later" };
  }

  if (res.status == 200) {
    redirect("/team");
  }

  return { message: "Could not create the Team. Try again later" };
}
