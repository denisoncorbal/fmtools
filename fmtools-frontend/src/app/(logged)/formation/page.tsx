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
import styles from "./formation.module.css";
import ModalCreateFormation from "./modal-create-formation";

const tacticalStyleApiPath =
  process.env.NEXT_PUBLIC_BACKEND_COMPLETE_BASE_URL! +
  process.env.NEXT_PUBLIC_BACKEND_API_TACTICAL_STYLE_PATH!;
const formationApiPath =
  process.env.NEXT_PUBLIC_BACKEND_COMPLETE_BASE_URL! +
  process.env.NEXT_PUBLIC_BACKEND_API_FORMATION_PATH!;

export default async function FormationPage() {
  const tacticalStylesRes = await fetch(`${tacticalStyleApiPath}`, {
    credentials: "include",
  });

  const tacticalStylesJsonRes = await tacticalStylesRes.json();

  const formationRes = await fetch(`${formationApiPath}`, {
    credentials: "include",
  });

  const formationJsonRes = await formationRes.json();
  return (
    <>
      <Box component="section" className={styles.background}>
        <Typography variant="h2">
          Formations{" "}
          <ModalCreateFormation tacticalStyles={tacticalStylesJsonRes} />
        </Typography>
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
                  <TableCell>
                    <Link href={`/formation/${item.id}`}>{item.name}</Link>
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
