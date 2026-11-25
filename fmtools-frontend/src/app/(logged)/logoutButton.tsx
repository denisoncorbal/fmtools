"use client";

import { Button } from "@mui/material";

export function LogoutButton() {
  function handleLogout() {
    window.location.href =
      "https://fmtools.denison.corbal.nom.br/gateway/api/v1/auth/logout";
  }

  return (
    <Button variant="contained" color="secondary" onClick={handleLogout}>
      Log out
    </Button>
  );
}
