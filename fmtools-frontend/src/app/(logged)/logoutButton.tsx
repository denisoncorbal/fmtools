"use client";

import { Button } from "@mui/material";
import { useAuth } from "../provider/auth-provider";

export function LogoutButton() {
  const { logout } = useAuth();
  return (
    <Button variant="contained" color="secondary" onClick={logout}>
      Log out
    </Button>
  );
}
