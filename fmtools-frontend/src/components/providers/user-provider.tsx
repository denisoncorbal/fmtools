"use client";

import { createContext, ReactNode, useContext } from "react";

import { User } from "@/types/user";

interface UserContextData {
  user: User | null;
  isAuthenticated: boolean;
}

const UserContext = createContext<UserContextData | undefined>(undefined);

interface UserProviderProps {
  user: User | null;
  children: ReactNode;
}

export function UserProvider({ user, children }: UserProviderProps) {
  return (
    <UserContext.Provider
      value={{
        user,
        isAuthenticated: !!user,
      }}
    >
      {children}
    </UserContext.Provider>
  );
}

export function useUser() {
  const context = useContext(UserContext);

  if (!context) {
    throw new Error("useUser deve ser utilizado dentro de UserProvider");
  }

  return context;
}
