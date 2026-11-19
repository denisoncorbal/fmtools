"use client";

import { useRouter } from "next/navigation";
import { useEffect } from "react";
import { useAuth } from "../provider/auth-provider";

export function ProtectedRoute({
  children,
}: Readonly<{ children: React.ReactNode }>) {
  const { loading, isAuthenticated } = useAuth();

  const router = useRouter();

  useEffect(() => {
    if (!loading && !isAuthenticated) {
      router.replace("/login");
    }
  }, [loading, isAuthenticated]);

  if (loading) {
    return <p>Loading...</p>;
  }

  return children;
}
