import { Box, Paper, Table, TableBody, TableCell, TableContainer, TableHead, TableRow, Typography } from "@mui/material";
import { cookies, headers } from "next/headers";
import Link from "next/link";
import ModalCreateFormation from "./modal-create-formation";
import styles from './specific-tactical-style.module.css';

const formationApiPath = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_FORMATION_PATH!;

export default async function SpecificTacticalStyle({ params }: { params: Promise<{ tacticalStyleId: string }> }) {
    const h = await headers();
    const host = h.get('host');
    const { tacticalStyleId } = await params;
    const ck = await cookies();
    const resFormations = await fetch(`http://${host}/proxy/backend?url=${formationApiPath}?tacticalStyleId=${tacticalStyleId}`, {
        headers: {
            cookie: ck.toString()
        }
    })
    const jsonResFormations = await resFormations.json();

    return (
        <>
            <Box component='section' className={styles.background}>
                <Typography variant="h2">Formations <ModalCreateFormation tacticalStyleId={tacticalStyleId} /></Typography>
                <TableContainer component={Paper}>
                    <Table>
                        <TableHead>
                            <TableRow>
                                <TableCell>Name</TableCell>
                            </TableRow>
                        </TableHead>
                        <TableBody>
                            {jsonResFormations.map((item: { id: string; name: string }) => (
                                <TableRow key={item.id}>
                                    <TableCell><Link href={`/formation/${item.id}`}>{item.name}</Link></TableCell>
                                </TableRow>
                            ))}
                        </TableBody>
                    </Table>
                </TableContainer>
            </Box>
        </>
    )
}