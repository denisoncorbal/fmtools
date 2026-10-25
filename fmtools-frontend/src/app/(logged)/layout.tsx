import { requireAuth } from "@/lib/requireAuth";
import Menu from "./menu";

export default async function LoggedLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  await requireAuth();
  return (
    <>
      <Menu />
      {children}
    </>
  );
}
