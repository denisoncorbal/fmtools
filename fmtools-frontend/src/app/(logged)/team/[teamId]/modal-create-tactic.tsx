'use client'

import { Box, Button, Modal, TextField, Typography, useTheme } from "@mui/material";
import { useState } from "react";
import { createTactic } from "./action";
import styles from './modal-create-tactic.module.css';

export default function ModalCreateTactic({ teamId }: { teamId: string }) {
    const theme = useTheme();

    const [open, setOpen] = useState(false);

    const handleOpen = () => { setOpen(true) };
    const handleClose = () => { setOpen(false) };

    return (
        <>
            <Button onClick={handleOpen} variant="contained">Add Tactic</Button>
            <Modal open={open} onClose={handleClose}>
                <Box bgcolor={theme.palette.background.paper} className={styles.modal_container}>
                    <form action={createTactic} className={styles.form_container}>
                        <Typography className={styles.modal_title} variant="h6" component='h3'>Create Tactic</Typography>
                        <div><TextField className={styles.field_name} id="name" name="name" type="text" label="Name"></TextField></div>
                        <input type="hidden" name="teamId" value={teamId} />
                        <div className={styles.buttons_container}>
                            <Button className={styles.modal_buttons} type="submit" color="primary" variant="contained">Create</Button>
                            <Button className={styles.modal_buttons} variant="contained" color="secondary" onClick={handleClose}>Cancel</Button>
                        </div>

                    </form>
                </Box>
            </Modal>
        </>
    )
}