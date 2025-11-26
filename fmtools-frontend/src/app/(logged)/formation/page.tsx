import { Box, Paper, Table, TableBody, TableCell, TableContainer, TableHead, TableRow, Typography } from "@mui/material";
import { cookies, headers } from "next/headers";
import Link from "next/link";
import styles from './formation.module.css';
import ModalCreateFormation from "./modal-create-formation";

const tacticalStyleApiPath = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_TACTICAL_STYLE_PATH!;
const formationApiPath = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_FORMATION_PATH!;

export default async function FormationPage() {
    const h = await headers();
    const host = h.get('host');
    const ck = await cookies();
    const tacticalStylesRes = await fetch(`http://${host}/proxy/backend?url=${tacticalStyleApiPath}`, {
        headers: {
            cookie: ck.toString()
        }
    })

    const tacticalStylesJsonRes = await tacticalStylesRes.json();

    const formationRes = await fetch(`http://${host}/proxy/backend?url=${formationApiPath}`, {
        headers: {
            cookie: ck.toString()
        }
    });

    const formationJsonRes = await formationRes.json();
    return (
        <>
            <Box component='section' className={styles.background}>
                <Typography variant="h2">Formations <ModalCreateFormation tacticalStyles={tacticalStylesJsonRes} /></Typography>
                <TableContainer component={Paper}>
                    <Table>
                        <TableHead>
                            <TableRow>
                                <TableCell>Name</TableCell>
                            </TableRow>
                        </TableHead>
                        <TableBody>
                            {formationJsonRes.map((item: { id: string; name: string }) => (
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