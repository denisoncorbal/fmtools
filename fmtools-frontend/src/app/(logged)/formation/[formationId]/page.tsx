import { Box, Paper, Typography } from "@mui/material";
import { cookies, headers } from "next/headers";
import ModalCalculatePosition from "./modal-calculate-position";
import styles from './specific-formation.module.css';

const playerApiPath = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_PLAYER_PATH!;
const tacticalPositionApiPath = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_TACTICAL_POSITION_PATH!;
const squadApiPath = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_SQUAD_PATH!;

async function getPlayer(playerId: string): Promise<{ id: string, name: string, attributes: object }> {
    const h = await headers();
    const host = h.get('host');
    const ck = await cookies();
    const resPlayer = await fetch(`http://${host}/proxy/backend?url=${playerApiPath}/${playerId}`, {
        headers: {
            cookie: ck.toString()
        }
    })

    return await resPlayer.json();
}

export default async function SpecificFormation({ params }: { params: Promise<{ formationId: string }> }) {
    const h = await headers();
    const host = h.get('host');
    const { formationId } = await params;
    const ck = await cookies();
    const resTacticalPositions = await fetch(`http://${host}/proxy/backend?url=${tacticalPositionApiPath}?formationId=${formationId}`, {
        headers: {
            cookie: ck.toString()
        }
    })

    const jsonResTacticalPositions = await resTacticalPositions.json();

    const resSquads = await fetch(`http://${host}/proxy/backend?url=${squadApiPath}`, {
        headers: {
            cookie: ck.toString()
        }
    })

    const jsonResSquads = await resSquads.json();

    const tacticalPositionsIds = jsonResTacticalPositions.map((tp: { id: string }) => tp.id).join(',');
    const playersPromises = jsonResTacticalPositions.filter((tp: { id: string, fieldPosition: string, role: string, duty: string, playerId: string, suitability: number }) => { return tp.playerId != null }).map(
        (tp: { playerId: string }) => getPlayer(tp.playerId));
    const jsonResPlayers = await Promise.all(playersPromises);

    return (
        <>
            <Box component='section' className={styles.background}>
                <Typography variant="h2">Tactical Positions <ModalCalculatePosition formationId={formationId} tacticalPositions={tacticalPositionsIds} squads={jsonResSquads} /></Typography>
                <div className={styles.positions_container}>
                    {jsonResTacticalPositions.filter((i: { id: string, fieldPosition: string, role: string, duty: string, suitability: number }) => { return (i.fieldPosition === 'STCL' || i.fieldPosition === 'STC' || i.fieldPosition === 'STCR') }).map((item: { id: string, fieldPosition: string, role: string, duty: string, playerId: string, suitability: number }) => (
                        <Paper className={styles.position} key={item.id}>
                            <Typography variant='body1'>{item.fieldPosition} - {item.role.toLowerCase().split('_').map(word => word.charAt(0).toUpperCase() + word.slice(1)).join(' ')} - {item.duty.charAt(0) + item.duty.slice(1).toLowerCase()}</Typography>
                            {jsonResPlayers.filter((pl) => pl.id === item.playerId).map((pl) => (
                                <div key={pl.id} className={styles.player_data_container}>
                                    <Typography className={styles.player_name} variant="body2">{pl.name}</Typography>
                                    <Typography className={styles.player_suitability} variant="body2">({item.suitability.toFixed(2)}%)</Typography>
                                </div>

                            ))}
                        </Paper>
                    ))}
                </div>

                <div className={styles.positions_container}>
                    {jsonResTacticalPositions.filter((i: { id: string, fieldPosition: string, role: string, duty: string, suitability: number }) => { return (i.fieldPosition === 'AML' || i.fieldPosition === 'AMCL' || i.fieldPosition === 'AMC' || i.fieldPosition === 'AMCR' || i.fieldPosition === 'AMR') }).map((item: { id: string, fieldPosition: string, role: string, duty: string, playerId: string, suitability: number }) => (
                        <Paper className={styles.position} key={item.id}><Typography variant='body1'>{item.fieldPosition} - {item.role.toLowerCase().split('_').map(word => word.charAt(0).toUpperCase() + word.slice(1)).join(' ')} - {item.duty.charAt(0) + item.duty.slice(1).toLowerCase()}</Typography>
                            {jsonResPlayers.filter((pl) => pl.id === item.playerId).map((pl) => (
                                <div key={pl.id} className={styles.player_data_container}>
                                    <Typography className={styles.player_name} variant="body2">{pl.name}</Typography>
                                    <Typography className={styles.player_suitability} variant="body2">({item.suitability.toFixed(2)}%)</Typography>
                                </div>

                            ))}
                        </Paper>
                    ))}
                </div>

                <div className={styles.positions_container}>
                    {jsonResTacticalPositions.filter((i: { id: string, fieldPosition: string, role: string, duty: string, suitability: number }) => { return (i.fieldPosition === 'ML' || i.fieldPosition === 'MCL' || i.fieldPosition === 'MC' || i.fieldPosition === 'MCR' || i.fieldPosition === 'MR') }).map((item: { id: string, fieldPosition: string, role: string, duty: string, playerId: string, suitability: number }) => (
                        <Paper className={styles.position} key={item.id}><Typography variant='body1'>{item.fieldPosition} - {item.role.toLowerCase().split('_').map(word => word.charAt(0).toUpperCase() + word.slice(1)).join(' ')} - {item.duty.charAt(0) + item.duty.slice(1).toLowerCase()}</Typography>
                            {jsonResPlayers.filter((pl) => pl.id === item.playerId).map((pl) => (
                                <div key={pl.id} className={styles.player_data_container}>
                                    <Typography className={styles.player_name} variant="body2">{pl.name}</Typography>
                                    <Typography className={styles.player_suitability} variant="body2">({item.suitability.toFixed(2)}%)</Typography>
                                </div>

                            ))}
                        </Paper>
                    ))}
                </div>

                <div className={styles.positions_container}>
                    {jsonResTacticalPositions.filter((i: { id: string, fieldPosition: string, role: string, duty: string, suitability: number }) => { return (i.fieldPosition === 'WBL' || i.fieldPosition === 'DMCL' || i.fieldPosition === 'DM' || i.fieldPosition === 'DMCR' || i.fieldPosition === 'WBR') }).map((item: { id: string, fieldPosition: string, role: string, duty: string, playerId: string, suitability: number }) => (
                        <Paper className={styles.position} key={item.id}><Typography variant='body1'>{item.fieldPosition} - {item.role.toLowerCase().split('_').map(word => word.charAt(0).toUpperCase() + word.slice(1)).join(' ')} - {item.duty.charAt(0) + item.duty.slice(1).toLowerCase()}</Typography>
                            {jsonResPlayers.filter((pl) => pl.id === item.playerId).map((pl) => (
                                <div key={pl.id} className={styles.player_data_container}>
                                    <Typography className={styles.player_name} variant="body2">{pl.name}</Typography>
                                    <Typography className={styles.player_suitability} variant="body2">({item.suitability.toFixed(2)}%)</Typography>
                                </div>

                            ))}
                        </Paper>
                    ))}
                </div>

                <div className={styles.positions_container}>
                    {jsonResTacticalPositions.filter((i: { id: string, fieldPosition: string, role: string, duty: string, suitability: number }) => { return (i.fieldPosition === 'DL' || i.fieldPosition === 'DCL' || i.fieldPosition === 'DC' || i.fieldPosition === 'DCR' || i.fieldPosition === 'DR') }).map((item: { id: string, fieldPosition: string, role: string, duty: string, playerId: string, suitability: number }) => (
                        <Paper className={styles.position} key={item.id}><Typography variant='body1'>{item.fieldPosition} - {item.role.toLowerCase().split('_').map(word => word.charAt(0).toUpperCase() + word.slice(1)).join(' ')} - {item.duty.charAt(0) + item.duty.slice(1).toLowerCase()}</Typography>
                            {jsonResPlayers.filter((pl) => pl.id === item.playerId).map((pl) => (
                                <div key={pl.id} className={styles.player_data_container}>
                                    <Typography className={styles.player_name} variant="body2">{pl.name}</Typography>
                                    <Typography className={styles.player_suitability} variant="body2">({item.suitability.toFixed(2)}%)</Typography>
                                </div>

                            ))}
                        </Paper>
                    ))}
                </div>

                <div className={styles.positions_container}>
                    {jsonResTacticalPositions.filter((i: { id: string, fieldPosition: string, role: string, duty: string, suitability: number }) => { return (i.fieldPosition === 'GK') }).map((item: { id: string, fieldPosition: string, role: string, duty: string, playerId: string, suitability: number }) => (
                        <Paper className={styles.position} key={item.id}><Typography variant='body1'>{item.fieldPosition} - {item.role.toLowerCase().split('_').map(word => word.charAt(0).toUpperCase() + word.slice(1)).join(' ')} - {item.duty.charAt(0) + item.duty.slice(1).toLowerCase()}</Typography>
                            {jsonResPlayers.filter((pl) => pl.id === item.playerId).map((pl) => (
                                <div key={pl.id} className={styles.player_data_container}>
                                    <Typography className={styles.player_name} variant="body2">{pl.name}</Typography>
                                    <Typography className={styles.player_suitability} variant="body2">({item.suitability.toFixed(2)}%)</Typography>
                                </div>

                            ))}
                        </Paper>
                    ))}
                </div>

            </Box>
        </>
    )
}