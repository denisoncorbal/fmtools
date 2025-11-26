import { ArrowDropDown } from "@mui/icons-material";
import { Accordion, AccordionDetails, AccordionSummary, Box, Paper, Typography } from "@mui/material";
import { cookies, headers } from "next/headers";
import ModalCreatePlayer from "./modal-create-player";
import styles from './specific-team.module.css';

const playerApiPath = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_PLAYER_PATH!;

export default async function SpecificSquad({ params }: { params: Promise<{ squadId: string }> }) {
    const h = await headers();
    const host = h.get('host');
    const { squadId } = await params;
    const ck = await cookies();
    const resPlayers = await fetch(`http://${host}/proxy/backend?url=${playerApiPath}?squadId=${squadId}`, {
        headers: {
            cookie: ck.toString()
        }
    })
    const jsonResPlayers = await resPlayers.json();

    return (
        <>
            <Box component='section' className={styles.background}>
                <Typography variant="h2">Players <ModalCreatePlayer squadId={squadId} /></Typography>
                {jsonResPlayers.map((item: { id: string, name: string, attributes: object }) => (
                    <Accordion key={item.id} className={styles.accordion}>
                        <AccordionSummary expandIcon={<ArrowDropDown />}>
                            <Typography variant="h4">
                                {item.name}
                            </Typography>
                        </AccordionSummary>
                        <AccordionDetails>
                            <Box className={styles.attributes_container}>
                                {Object.entries(item.attributes).map((e) => (
                                    <Paper key={e[0]} className={styles.attribute_individual_container}>
                                        <Typography variant="body1" className={styles.attribute_title}>{
                                            e[0].toLowerCase().split('_').map((word) => word.charAt(0).toUpperCase() + word.slice(1)).join(' ')
                                        }</Typography>
                                        <Typography variant="body2" color={
                                            Number.parseInt(e[1]) <= 5 ? 'error' :
                                                Number.parseInt(e[1]) <= 10 ? 'text' :
                                                    Number.parseInt(e[1]) <= 15 ? 'warning' : 'success'
                                        } className={styles.attribute_value}>{e[1]}</Typography>
                                    </Paper>
                                ))}
                            </Box>
                        </AccordionDetails>
                    </Accordion>
                ))}
            </Box>
        </>
    )
}