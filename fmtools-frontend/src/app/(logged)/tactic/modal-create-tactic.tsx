'use client'

import { Box, Button, FormControl, InputLabel, MenuItem, Modal, Select, SelectChangeEvent, TextField, Typography, useTheme } from "@mui/material";
import { useState } from "react";
import createTactic from "./action";
import styles from './modal-create-tactic.module.css';

export default function ModalCreateTactic({ teams }: { teams: [{ id: string, name: string }] }) {
    const theme = useTheme();

    const [open, setOpen] = useState(false);
    const [team, setTeam] = useState('');

    const handleOpen = () => { setOpen(true) };
    const handleClose = () => { setOpen(false) };
    const handleChange = (e: SelectChangeEvent) => { setTeam(e.target.value as string) };

    return (
        <>
            <Button onClick={handleOpen} variant="contained">Add Tactic</Button>
            <Modal open={open} onClose={handleClose}>
                <Box bgcolor={theme.palette.background.paper} className={styles.modal_container}>
                    <form action={createTactic} className={styles.form_container}>
                        <Typography className={styles.modal_title} variant="h6" component='h3'>Create Tactic</Typography>
                        <FormControl fullWidth required>
                            <InputLabel id="team-select-label">Team</InputLabel>
                            <Select
                                name="team"
                                labelId="team-select-label"
                                id="team-select"
                                className={styles.team_select}
                                value={team}
                                label="Team"
                                onChange={handleChange}
                            >
                                {teams.map((t => (
                                    <MenuItem key={t.id} value={t.id}>{t.name}</MenuItem>
                                )))}
                            </Select>
                        </FormControl>
                        <TextField className={styles.field_name} id="name" name="name" type="text" label="Name"></TextField>
                        <div className={styles.buttons_container}>
                            <Button type="submit" color="primary" variant="contained">Create</Button>
                            <Button variant="contained" color="secondary" onClick={handleClose}>Cancel</Button>
                        </div>

                    </form>
                </Box>
            </Modal>
        </>
    )
}