'use client'

import { Box, Button, Modal, TextField, Typography, useTheme } from "@mui/material";
import { useState } from "react";
import { createTacticalStyle } from "./action";
import styles from './modal-create-tactical-style.module.css';

export default function ModalCreateTacticalStyle({ tacticId }: { tacticId: string }) {
    const theme = useTheme();

    const [open, setOpen] = useState(false);

    const handleOpen = () => { setOpen(true) };
    const handleClose = () => { setOpen(false) };

    return (
        <>
            <Button onClick={handleOpen} variant="contained">Add Tactical Style</Button>
            <Modal open={open} onClose={handleClose}>
                <Box bgcolor={theme.palette.background.paper} className={styles.modal_container}>
                    <form action={createTacticalStyle}>
                        <Typography className={styles.modal_title} variant="h6" component='h3'>Create Tactical Style</Typography>
                        <div><TextField className={styles.field_name} id="name" name="name" type="text" label="Name"></TextField></div>
                        <input type="hidden" name="tacticId" value={tacticId} />
                        <Button className={styles.modal_buttons} type="submit" color="primary" variant="contained">Create</Button><Button className={styles.modal_buttons} variant="contained" color="secondary" onClick={handleClose}>Cancel</Button>
                    </form>
                </Box>
            </Modal>
        </>
    )
}