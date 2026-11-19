import Menu from "./menu";
import { ProtectedRoute } from "./protected-route";

export default async function LoggedLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <>
      <Menu />
      <ProtectedRoute>{children}</ProtectedRoute>
    </>
  );
}
