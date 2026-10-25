"use client";

import { Button } from "@mui/material";
import { signOut } from "next-auth/react";

export function LogoutButton() {
  async function handleLogout() {
    const response = await fetch("/logout", {
      method: "POST",
    });

    if (!response.ok) {
      throw new Error("Failed to logout");
    }

    const { url } = await response.json();

    await signOut({
      redirect: false,
      callbackUrl: "/",
    });

    window.location.assign(url);
  }

  return (
    <Button variant="contained" color="secondary" onClick={handleLogout}>
      Log out
    </Button>
  );
}
