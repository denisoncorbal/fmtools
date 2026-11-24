export const dynamic = "force-dynamic";
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
import ModalCreateTactic from "./modal-create-tactic";
import styles from "./tactic.module.css";

const teamApiPath =
  process.env.NEXT_PUBLIC_BACKEND_COMPLETE_BASE_URL! +
  process.env.NEXT_PUBLIC_BACKEND_API_TEAM_PATH!;
const tacticApiPath =
  process.env.NEXT_PUBLIC_BACKEND_COMPLETE_BASE_URL! +
  process.env.NEXT_PUBLIC_BACKEND_API_TACTIC_PATH!;

export default async function TacticPage() {
  const teamRes = await fetch(`${teamApiPath}`, {
    credentials: "include",
  });
  const teamJsonRes = await teamRes.json();
  const tacticRes = await fetch(`${tacticApiPath}`, {
    credentials: "include",
  });
  const tacticJsonRes = await tacticRes.json();
  return (
    <>
      <Box component="section" className={styles.background}>
        <Typography variant="h2">
          Tactics <ModalCreateTactic teams={teamJsonRes} />
        </Typography>
        <TableContainer component={Paper}>
          <Table>
            <TableHead>
              <TableRow>
                <TableCell>Name</TableCell>
              </TableRow>
            </TableHead>
            <TableBody>
              {tacticJsonRes.map((item: { id: string; name: string }) => (
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
