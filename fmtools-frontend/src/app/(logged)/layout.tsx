import { UserProvider } from "@/components/providers/user-provider";
import { getLoggedUser } from "@/services/user-service";
import { redirect } from "next/navigation";
import Menu from "./menu";

export default async function LoggedLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  const user = await getLoggedUser();

  if (!user) {
    redirect("/login");
  }

  return (
    <UserProvider user={user}>
      <Menu />
      {children}
    </UserProvider>
  );
}
