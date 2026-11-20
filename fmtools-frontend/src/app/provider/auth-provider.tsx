"use client";

import {
  createContext,
  useCallback,
  useContext,
  useEffect,
  useState,
} from "react";

interface User {
  fullName: string;
  email: string;
  roles: string[];
}

interface AuthContextData {
  user: User | null;
  loading: boolean;
  isAuthenticated: boolean;
  refreshUser: () => Promise<void>;
  logout: () => void;
  login: () => void;
}

const AuthContext = createContext<AuthContextData | null>(null);

export function AuthProvider({
  children,
}: Readonly<{ children: React.ReactNode }>) {
  const [user, setUser] = useState<User | null>(null);
  const [loading, setLoading] = useState(true);

  const refreshUser = useCallback(async () => {
    try {
      const currentUser = await getMe();
      setUser(currentUser);
    } catch (error) {
      console.error("Error on loading user:", error);
      setUser(null);
    }
  }, []);

  const logout = useCallback(() => {
    setUser(null);

    window.location.href = `${process.env.NEXT_PUBLIC_BACKEND_COMPLETE_BASE_URL}${process.env.NEXT_PUBLIC_BACKEND_API_AUTH_LOGOUT_PATH}`;
  }, []);

  const login = useCallback(() => {
    setUser(null);

    window.location.href = `${process.env.NEXT_PUBLIC_BACKEND_COMPLETE_BASE_URL}${process.env.NEXT_PUBLIC_BACKEND_API_AUTH_LOGIN_PATH}`;
  }, []);

  const getMe = useCallback(async () => {
    try {
      const res = await fetch(
        `/proxy/backend?url=${process.env.NEXT_PUBLIC_BACKEND_COMPLETE_BASE_URL}${process.env.NEXT_PUBLIC_BACKEND_API_AUTH_ME_PATH}`,
        {
          cache: "no-store",
          credentials: "include",
        },
      );

      if (!res.ok) {
        return null;
      }

      return (await res.json()) as User;
    } catch (error) {
      console.error("Error fetching current user:", error);
      return null;
    }
  }, []);

  useEffect(() => {
    let active = true;

    async function initialize() {
      try {
        const currentUser = await getMe();

        if (active) {
          setUser(currentUser);
        }
      } catch {
        if (active) {
          setUser(null);
        }
      } finally {
        if (active) {
          setLoading(false);
        }
      }
    }

    void initialize();

    return () => {
      active = false;
    };
  }, []);

  return (
    <AuthContext.Provider
      value={{
        user,
        loading,
        isAuthenticated: !!user,
        refreshUser,
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
