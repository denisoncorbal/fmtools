import "bootstrap/dist/css/bootstrap.min.css";
import type { Metadata } from "next";
import "./globals.css";
import '@fortawesome/fontawesome-svg-core/styles.css'
import GeneralNavbar from "./component/general-navbar";

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
        <GeneralNavbar />
        {children}
      </body>
    </html>
  );
}
