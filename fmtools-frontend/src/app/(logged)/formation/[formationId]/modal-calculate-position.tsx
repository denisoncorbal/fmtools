'use client'

import { Box, Button, FormControl, InputLabel, MenuItem, Modal, Select, Typography, useTheme } from "@mui/material";
import { useState } from "react";
import calculatePositions from "./action";
import styles from './modal-calculate-position.module.css';

export default function ModalCalculatePosition({ tacticalPositions, squads, formationId }: { tacticalPositions: string, squads: { id: string, name: string }[], formationId: string }) {
    const theme = useTheme();

    const [open, setOpen] = useState(false);
    const [squad, setSquad] = useState('');

    const handleOpen = () => { setOpen(true) };
    const handleClose = () => { setOpen(false) };

    return (
        <>
            <Button onClick={handleOpen} variant="contained">Calculate Positions</Button>
            <Modal open={open} onClose={handleClose}>
                <Box bgcolor={theme.palette.background.paper} className={styles.modal_container}>
                    <form className={styles.form_container} action={calculatePositions}>
                        <Typography className={styles.modal_title} variant="h6" component='h3'>Calculate Positions</Typography>
                        <FormControl fullWidth>
                            <InputLabel id="squad-select-label">Squad</InputLabel>
                            <Select
                                name="squad"
                                labelId="squad-select-label"
                                id="squad-select"
                                className={styles.squad_select}
                                value={squad}
                                label="Squad"
                                onChange={(e) => { setSquad(e.target.value as string) }}
                            >
                                {squads.map((s) => (
                                    <MenuItem key={s.id} value={s.id}>{s.name}</MenuItem>
                                ))}
                            </Select>
                        </FormControl>
                        <input type="hidden" name="tacticalPositions" value={tacticalPositions} />
                        <input type="hidden" name="formationId" value={formationId} />
                        <div className={styles.buttons_container}>
                            <Button className={styles.modal_buttons} type="submit" color="primary" variant="contained">Calculate</Button>
                            <Button className={styles.modal_buttons} variant="contained" color="secondary" onClick={handleClose}>Cancel</Button>
                        </div>
                    </form>
                </Box>
            </Modal>
        </>
    )
}