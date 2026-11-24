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
import ModalCreateTacticalStyle from "./modal-create-tactical-style";
import styles from "./specific-tactic.module.css";

const tacticalStyleApiPath =
  process.env.NEXT_PUBLIC_BACKEND_COMPLETE_BASE_URL! +
  process.env.NEXT_PUBLIC_BACKEND_API_TACTICAL_STYLE_PATH!;

export default async function SpecificTactic({
  params,
}: {
  params: Promise<{ tacticId: string }>;
}) {
  const { tacticId } = await params;
  const resTacticalStyles = await fetch(
    `${tacticalStyleApiPath}?tacticId=${tacticId}`,
    {
      credentials: "include",
    },
  );
  const jsonResTacticalStyles = await resTacticalStyles.json();
  return (
    <>
      <Box component="section" className={styles.background}>
        <Typography variant="h2">
          Tactical Styles <ModalCreateTacticalStyle tacticId={tacticId} />
        </Typography>
        <TableContainer component={Paper}>
          <Table>
            <TableHead>
              <TableRow>
                <TableCell>Name</TableCell>
              </TableRow>
            </TableHead>
            <TableBody>
              {jsonResTacticalStyles.map(
                (item: { id: string; name: string }) => (
                  <TableRow key={item.id}>
                    <TableCell>
                      <Link href={`/tacticalStyle/${item.id}`}>
                        {item.name}
                      </Link>
                    </TableCell>
                  </TableRow>
                ),
              )}
            </TableBody>
          </Table>
        </TableContainer>
      </Box>
    </>
  );
}
