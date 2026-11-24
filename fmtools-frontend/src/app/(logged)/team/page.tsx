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
import ModalCreateTeam from "./modal-create-team";
import styles from "./team.module.css";

const teamApiPath =
  process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_TEAM_PATH!;

export default async function TeamPage() {
  const res = await fetch(`${teamApiPath}`, {
    cache: "no-cache",
    credentials: "include",
  });

  console.log(res);

  const jsonRes = await res.json();

  return (
    <Box component="section" className={styles.background}>
      <Typography variant="h2">
        Teams <ModalCreateTeam />
      </Typography>
      <TableContainer component={Paper}>
        <Table>
          <TableHead>
            <TableRow>
              <TableCell>Name</TableCell>
            </TableRow>
          </TableHead>
          <TableBody>
            {jsonRes.map((item: { id: string; name: string }) => (
              <TableRow key={item.id}>
                <TableCell>
                  <Link href={`/team/${item.id}`}>{item.name}</Link>
                </TableCell>
              </TableRow>
            ))}
          </TableBody>
        </Table>
      </TableContainer>
    </Box>
  );
}
