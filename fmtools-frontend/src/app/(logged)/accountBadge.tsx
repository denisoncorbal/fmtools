"use client";
import Typography from "@mui/material/Typography";
import { useAuth } from "../provider/auth-provider";

export default function AccountBadge() {
  const { user, loading } = useAuth();

  if (loading) {
    return <div>Loading...</div>;
  }

  return (
    <Typography variant="body1" component="div" sx={{ flexGrow: 1 }}>
      Welcome, {user?.name}
    </Typography>
  );
}
