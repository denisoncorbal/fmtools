import "server-only";

import { User } from "@/types/user";

export async function getLoggedUser(): Promise<User | null> {
  const res = await fetch(
    "https://fmtools.gateway.denison.corbal.nom.br/api/v1/auth/me",
    {
      credentials: "include",
    },
  );

  if (res.status != 200) {
    return null;
  }

  const user = await res.json();

  if (!user) {
    return null;
  }

  return {
    name: user.name,
    email: user.email,
    roles: user.roles,
  };
}
