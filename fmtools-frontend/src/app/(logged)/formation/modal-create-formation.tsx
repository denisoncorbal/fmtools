'use client'

import { Box, Button, FormControl, InputLabel, MenuItem, Modal, Select, SelectChangeEvent, TextField, Typography, useTheme } from "@mui/material";
import { useState } from "react";
import createFormation from "./action";
import styles from './modal-create-formation.module.css';

export default function ModalCreateFormation({ tacticalStyles }: { tacticalStyles: [{ id: string, name: string }] }) {
    const theme = useTheme();

    const [open, setOpen] = useState(false);
    const [team, setTeam] = useState('');

    const handleOpen = () => { setOpen(true) };
    const handleClose = () => { setOpen(false) };
    const handleChange = (e: SelectChangeEvent) => { setTeam(e.target.value as string) };

    return (
        <>
            <Button onClick={handleOpen} variant="contained">Add Formation</Button>
            <Modal open={open} onClose={handleClose}>
                <Box bgcolor={theme.palette.background.paper} className={styles.modal_container}>
                    <form action={createFormation} className={styles.form_container}>
                        <Typography className={styles.modal_title} variant="h6" component='h3'>Create Formation</Typography>
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
                                {tacticalStyles.map((t => (
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