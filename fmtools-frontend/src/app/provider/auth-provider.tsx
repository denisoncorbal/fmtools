"use client";

import { createContext, useCallback, useContext, useState } from "react";

interface User {
  fullName: string;
  email: string;
  roles: string[];
}

interface AuthContextData {
  user: User | null;
  loading: boolean;
  isAuthenticated: boolean;
  authenticate: () => Promise<void>;
  logout: () => void;
  login: () => void;
}

const AuthContext = createContext<AuthContextData | null>(null);

export function AuthProvider({
  children,
}: Readonly<{ children: React.ReactNode }>) {
  const [user, setUser] = useState<User | null>(null);
  const [loading, setLoading] = useState(false);
  const [isAuthenticated, setIsAuthenticated] = useState(false);

  const logout = useCallback(() => {
    setUser(null);
    setLoading(false);
    setIsAuthenticated(false);

    window.location.href = `${process.env.NEXT_PUBLIC_BACKEND_COMPLETE_BASE_URL}${process.env.NEXT_PUBLIC_BACKEND_API_AUTH_LOGOUT_PATH}`;
  }, []);

  const login = useCallback(() => {
    setUser(null);
    setLoading(false);
    setIsAuthenticated(false);

    window.location.href = `${process.env.NEXT_PUBLIC_BACKEND_COMPLETE_BASE_URL}${process.env.NEXT_PUBLIC_BACKEND_API_AUTH_LOGIN_PATH}`;
  }, []);

  const authenticate = useCallback(async () => {
    setLoading(true);
    setIsAuthenticated(false);
    try {
      const res = await fetch(
        `/proxy/backend?url=${process.env.NEXT_PUBLIC_BACKEND_COMPLETE_BASE_URL}${process.env.NEXT_PUBLIC_BACKEND_API_AUTH_ME_PATH}`,
        {
          cache: "no-store",
          credentials: "include",
        },
      );

      if (!res.ok) {
        setUser(null);
        setIsAuthenticated(false);
      }

      setUser((await res.json()) as User);
      setIsAuthenticated(true);
    } catch (error) {
      console.error("Error fetching current user:", error);
      setUser(null);
      setIsAuthenticated(false);
    } finally {
      setLoading(false);
    }
  }, []);

  return (
    <AuthContext.Provider
      value={{
        user,
        loading,
        isAuthenticated,
        authenticate,
        logout,
        login,
      }}
    >
      {children}
    </AuthContext.Provider>
  );
}

export function useAuth() {
  const context = useContext(AuthContext);

  if (!context) {
    throw new Error("useAuth must be used inside AuthProvider");
  }

  return context;
}
