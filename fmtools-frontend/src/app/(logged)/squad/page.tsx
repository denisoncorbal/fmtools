import { Box, Paper, Table, TableBody, TableCell, TableContainer, TableHead, TableRow, Typography } from "@mui/material";
import { cookies, headers } from "next/headers";
import Link from "next/link";
import ModalCreateSquad from "./modal-create-squad";
import styles from './squad.module.css';

const teamApiPath = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_TEAM_PATH!;
const squadApiPath = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_SQUAD_PATH!;

export default async function SquadPage() {
    const h = await headers();
    const host = h.get('host');
    const ck = await cookies();
    const teamRes = await fetch(`http://${host}/proxy/backend?url=${teamApiPath}`, {
        headers: {
            cookie: ck.toString()
        }
    })
    const teamJsonRes = await teamRes.json();
    const squadRes = await fetch(`http://${host}/proxy/backend?url=${squadApiPath}`, {
        headers: {
            cookie: ck.toString()
        }
    })
    const squadJsonRes = await squadRes.json();
    return (
        <>
            <Box component='section' className={styles.background}>
                <Typography variant="h2">Squads <ModalCreateSquad teams={teamJsonRes} /></Typography>
                <TableContainer component={Paper}>
                    <Table>
                        <TableHead>
                            <TableRow>
                                <TableCell>Name</TableCell>
                            </TableRow>
                        </TableHead>
                        <TableBody>
                            {squadJsonRes.map((item: { id: string; name: string }) => (
                                <TableRow key={item.id}>
                                    <TableCell><Link href={`/squad/${item.id}`}>{item.name}</Link></TableCell>
                                </TableRow>
                            ))}
                        </TableBody>
                    </Table>
                </TableContainer>
            </Box>
        </>
    )
}