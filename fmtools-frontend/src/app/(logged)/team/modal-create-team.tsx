'use client'

import { Box, Button, Modal, TextField, Typography, useTheme } from "@mui/material";
import { useActionState, useState } from "react";
import createTeam from "./action";
import styles from './modal-create-team.module.css';

export default function ModalCreateTeam() {
    const theme = useTheme();

    const [open, setOpen] = useState(false);

    const handleOpen = () => { setOpen(true) };
    const handleClose = () => { setOpen(false) };

    const [state, formAction, pending] = useActionState(createTeam, { message: '' });

    return (
        <>
            <Button onClick={handleOpen} variant="contained">Add Team</Button>
            <Modal open={open} onClose={handleClose}>
                <Box bgcolor={theme.palette.background.paper} className={styles.modal_container}>
                    <form action={formAction} className={styles.form_container}>
                        <Typography className={styles.modal_title} variant="h6" component='h3'>Create Team</Typography>
                        <TextField className={styles.field_name} id="name" name="name" type="text" label="Name"></TextField>
                        <div className={styles.buttons_container}>
                            <Button className={styles.modal_buttons} type="submit" color="primary" variant="contained" disabled={pending}>Create</Button>
                            <Button className={styles.modal_buttons} variant="contained" color="secondary" onClick={handleClose}>Cancel</Button>
                        </div>
                        {state.message && <p>{state.message}</p>}
                    </form>
                </Box>
            </Modal>
        </>
    )
}