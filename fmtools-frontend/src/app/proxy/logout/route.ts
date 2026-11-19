"use server";

import { useAuth } from "@/app/provider/auth-provider";

export async function GET() {
  const { logout } = useAuth();

  logout();
}
