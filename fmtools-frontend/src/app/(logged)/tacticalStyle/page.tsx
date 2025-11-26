import { Box, Paper, Table, TableBody, TableCell, TableContainer, TableHead, TableRow, Typography } from "@mui/material";
import { cookies, headers } from "next/headers";
import Link from "next/link";
import ModalCreateTacticalStyle from "./modal-create-tactical-style";
import styles from './tactical-style.module.css';

const tacticalStyleApiPath = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_TACTICAL_STYLE_PATH!;
const tacticApiPath = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_TACTIC_PATH!;

export default async function TacticalStylePage() {
    const h = await headers();
    const host = h.get('host');
    const ck = await cookies();
    const tacticalStyleRes = await fetch(`http://${host}/proxy/backend?url=${tacticalStyleApiPath}`, {
        headers: {
            cookie: ck.toString()
        }
    })
    const tacticalStyleJsonRes = await tacticalStyleRes.json();
    const tacticRes = await fetch(`http://${host}/proxy/backend?url=${tacticApiPath}`, {
        headers: {
            cookie: ck.toString()
        }
    })
    const tacticJsonRes = await tacticRes.json();

    return (
        <>
            <Box component='section' className={styles.background}>
                <Typography variant="h2">Tactical Styles <ModalCreateTacticalStyle tactics={tacticJsonRes} /></Typography>
                <TableContainer component={Paper}>
                    <Table>
                        <TableHead>
                            <TableRow>
                                <TableCell>Name</TableCell>
                            </TableRow>
                        </TableHead>
                        <TableBody>
                            {tacticalStyleJsonRes.map((item: { id: string; name: string }) => (
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