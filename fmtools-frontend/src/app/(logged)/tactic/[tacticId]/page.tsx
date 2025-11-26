import { Box, Paper, Table, TableBody, TableCell, TableContainer, TableHead, TableRow, Typography } from "@mui/material";
import { cookies, headers } from "next/headers";
import Link from "next/link";
import ModalCreateTacticalStyle from "./modal-create-tactical-style";
import styles from './specific-tactic.module.css';

const tacticalStyleApiPath = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_TACTICAL_STYLE_PATH!;

export default async function SpecificTactic({ params }: { params: Promise<{ tacticId: string }> }) {
    const h = await headers();
    const host = h.get('host');
    const { tacticId } = await params;
    const ck = await cookies();
    const resTacticalStyles = await fetch(`http://${host}/proxy/backend?url=${tacticalStyleApiPath}?tacticId=${tacticId}`, {
        headers: {
            cookie: ck.toString()
        }
    })
    const jsonResTacticalStyles = await resTacticalStyles.json();
    return (
        <>
            <Box component='section' className={styles.background}>
                <Typography variant="h2">Tactical Styles <ModalCreateTacticalStyle tacticId={tacticId} /></Typography>
                <TableContainer component={Paper}>
                    <Table>
                        <TableHead>
                            <TableRow>
                                <TableCell>Name</TableCell>
                            </TableRow>
                        </TableHead>
                        <TableBody>
                            {jsonResTacticalStyles.map((item: { id: string; name: string }) => (
                                <TableRow key={item.id}>
                                    <TableCell><Link href={`/tacticalStyle/${item.id}`}>{item.name}</Link></TableCell>
                                </TableRow>
                            ))}
                        </TableBody>
                    </Table>
                </TableContainer>
            </Box>
        </>
    )
}