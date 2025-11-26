'use client'

import { Box, Button, FormControl, InputLabel, MenuItem, Modal, Select, SelectChangeEvent, TextField, Typography, useTheme } from "@mui/material";
import { useState } from "react";
import createTacticalStyle from "./action";
import styles from './modal-create-tactical-style.module.css';

export default function ModalCreateTacticalStyle({ tactics }: { tactics: [{ id: string, name: string }] }) {
    const theme = useTheme();

    const [open, setOpen] = useState(false);
    const [tactic, setTactic] = useState('');

    const handleOpen = () => { setOpen(true) };
    const handleClose = () => { setOpen(false) };
    const handleChange = (e: SelectChangeEvent) => { setTactic(e.target.value as string) };

    return (
        <>
            <Button onClick={handleOpen} variant="contained">Add Tactical Style</Button>
            <Modal open={open} onClose={handleClose}>
                <Box bgcolor={theme.palette.background.paper} className={styles.modal_container}>
                    <form action={createTacticalStyle} className={styles.form_container}>
                        <Typography className={styles.modal_title} variant="h6" component='h3'>Create Squad</Typography>
                        <FormControl fullWidth required>
                            <InputLabel id="tactic-select-label">Tactic</InputLabel>
                            <Select
                                name="tactic"
                                labelId="tactic-select-label"
                                id="tactic-select"
                                className={styles.tactic_select}
                                value={tactic}
                                label="Tactic"
                                onChange={handleChange}
                            >
                                {tactics.map((t => (
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