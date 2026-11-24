import {
  Box,
  Paper,
  Table,
  TableBody,
  TableCell,
  TableContainer,
  TableHead,
  TableRow,
  Typography,
} from "@mui/material";
import Link from "next/link";
import ModalCreateSquad from "./modal-create-squad";
import ModalCreateTactic from "./modal-create-tactic";
import styles from "./specific-team.module.css";

const squadApiPath =
  process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_SQUAD_PATH!;
const tacticApiPath =
  process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_TACTIC_PATH!;

export default async function SpecificTeam({
  params,
}: {
  params: Promise<{ teamId: string }>;
}) {
  const { teamId } = await params;
  const resSquads = await fetch(`${squadApiPath}?teamId=${teamId}`, {
    cache: "no-cache",
    credentials: "include",
  });
  const jsonResSquads = await resSquads.json();
  const resTactics = await fetch(`${tacticApiPath}?teamId=${teamId}`, {
    cache: "no-cache",
    credentials: "include",
  });
  const jsonResTactics = await resTactics.json();
  return (
    <>
      <Box component="section" className={styles.background}>
        <Typography variant="h2">
          Squads <ModalCreateSquad teamId={teamId} />
        </Typography>
        <TableContainer component={Paper}>
          <Table>
            <TableHead>
              <TableRow>
                <TableCell>Name</TableCell>
              </TableRow>
            </TableHead>
            <TableBody>
              {jsonResSquads.map((item: { id: string; name: string }) => (
                <TableRow key={item.id}>
                  <TableCell>
                    <Link href={`/squad/${item.id}`}>{item.name}</Link>
                  </TableCell>
                </TableRow>
              ))}
            </TableBody>
          </Table>
        </TableContainer>
        <Typography variant="h2">
          Tactics <ModalCreateTactic teamId={teamId} />
        </Typography>
        <TableContainer component={Paper}>
          <Table>
            <TableHead>
              <TableRow>
                <TableCell>Name</TableCell>
              </TableRow>
            </TableHead>
            <TableBody>
              {jsonResTactics.map((item: { id: string; name: string }) => (
                <TableRow key={item.id}>
                  <TableCell>
                    <Link href={`/tactic/${item.id}`}>{item.name}</Link>
                  </TableCell>
                </TableRow>
              ))}
            </TableBody>
          </Table>
        </TableContainer>
      </Box>
    </>
  );
}
