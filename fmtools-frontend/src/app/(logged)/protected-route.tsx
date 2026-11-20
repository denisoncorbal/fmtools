"use client";

import { useRouter } from "next/navigation";
import { useEffect, useRef } from "react";
import { useAuth } from "../provider/auth-provider";

interface ProtectedRouteProps {
  children: React.ReactNode;
}

export function ProtectedRoute({ children }: ProtectedRouteProps) {
  const { isAuthenticated, loading } = useAuth();
  const router = useRouter();
  const hasRedirect = useRef(true);

  useEffect(() => {
    if (!loading && !isAuthenticated && !hasRedirect.current) {
      hasRedirect.current = true;
      router.replace("/login");
    }
  }, [loading, isAuthenticated, router]);

  if (loading) {
    return <div>Loading...</div>;
  }

  if (!loading && !isAuthenticated) {
    return <div>Redirecting...</div>;
  }

  return <>{children}</>;
}
