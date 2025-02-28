import "bootstrap/dist/css/bootstrap.min.css";
import type { Metadata } from "next";
import "./globals.css";

export const metadata: Metadata = {
  title: "FMTools",
  description: "Tools to help with Football Manager",
};

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="en">
      <body>
        {children}
      </body>
    </html>
  );
}
