"use client";

import { Button } from "@mui/material";

const logoutApiPath =
  process.env.NEXT_PUBLIC_BACKEND_COMPLETE_BASE_URL! +
  process.env.NEXT_PUBLIC_BACKEND_API_AUTH_LOGOUT_PATH!;

export function LogoutButton() {
  function handleLogout() {
    window.location.href = `${logoutApiPath}`;
  }

  return (
    <Button variant="contained" color="secondary" onClick={handleLogout}>
      Log out
    </Button>
  );
}
