"use client";

import { useRouter } from "next/navigation";
import { useEffect, useRef } from "react";
import { useAuth } from "../provider/auth-provider";

interface ProtectedRouteProps {
  children: React.ReactNode;
}

export function ProtectedRoute({ children }: ProtectedRouteProps) {
  const { isAuthenticated, loading, authenticate } = useAuth();
  const router = useRouter();
  const hasRedirect = useRef(false);
  const hasAuthenticate = useRef(false);

  useEffect(() => {
    async function tryAuthenticate() {
      if (
        !hasRedirect.current &&
        !hasAuthenticate.current &&
        !loading &&
        !isAuthenticated
      ) {
        hasAuthenticate.current = true;
        await authenticate();
        if (!isAuthenticated && !loading) {
          hasRedirect.current = true;
          router.replace("/login");
        }
      }
    }
    void tryAuthenticate();
  }, [loading, isAuthenticated]);

  if (loading) {
    return <div>Loading...</div>;
  }

  if (!loading && !isAuthenticated) {
    return <div>Redirecting...</div>;
  }

  return <>{children}</>;
}
