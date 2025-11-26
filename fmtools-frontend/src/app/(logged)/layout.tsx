import Menu from "./menu";

export default function LoggedLayout({
    children,
}: Readonly<{
    children: React.ReactNode;
}>) {
    return (
        <>
            <Menu />
            {children}
        </>
    );
}