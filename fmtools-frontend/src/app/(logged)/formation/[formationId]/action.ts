"use server";

import { redirect } from "next/navigation";

const bestFormationApiPath =
  process.env.NEXT_PUBLIC_BACKEND_COMPLETE_BASE_URL! +
  process.env.NEXT_PUBLIC_BACKEND_API_BEST_FORMATION_PATH!;

export default async function calculatePositions(data: FormData) {
  const tacticalPositions = data
    .get("tacticalPositions")
    ?.toString()
    .split(",");
  const squadId = data.get("squad")?.toString();
  const res = await fetch(`${bestFormationApiPath}`, {
    method: "POST",
    body: JSON.stringify({
      tacticalPositions: tacticalPositions,
      squadId: squadId,
    }),
    headers: {
      "Content-Type": "application/json",
    },
    credentials: "include",
  });

  if (res.status == 200) {
    redirect(`/formation/${data.get("formationId")?.toString()}`);
  }
}
