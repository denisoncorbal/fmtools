'use client'

import { CloudUpload } from "@mui/icons-material";
import { Box, Button, Divider, Modal, TextField, Typography, useTheme } from "@mui/material";
import { useState } from "react";
import { createPlayer } from "./action";
import styles from './modal-create-player.module.css';

export default function ModalCreatePlayer({ squadId }: { squadId: string }) {
    const theme = useTheme();

    const [open, setOpen] = useState(false);

    const handleOpen = () => { setOpen(true) };
    const handleClose = () => { setOpen(false) };

    return (
        <>
            <Button onClick={handleOpen} variant="contained">Add Player</Button>
            <Modal open={open} onClose={handleClose}>
                <Box bgcolor={theme.palette.background.paper} className={styles.modal_container}>
                    <form className={styles.form_container} action={createPlayer}>
                        <Typography className={styles.modal_title} variant="h6" component='h3'>Create Player</Typography>
                        <TextField className={styles.field_name} id="name" name="name" type="text" label="Name"></TextField>
                        <Divider>AND</Divider>
                        <Button
                            component="label"
                            role={undefined}
                            variant="contained"
                            tabIndex={-1}
                            startIcon={<CloudUpload />}
                        >
                            Upload .rtf
                            <input
                                name="textFile"
                                hidden
                                type="file"
                                accept=".rtf"
                                multiple={false}
                            />
                        </Button>
                        <Divider>OR</Divider>
                        <Button
                            component="label"
                            role={undefined}
                            variant="contained"
                            tabIndex={-1}
                            startIcon={<CloudUpload />}
                        >
                            Upload .html
                            <input
                                name="htmlFile"
                                hidden
                                type="file"
                                accept=".html"
                                multiple={false}
                            />
                        </Button>
                        <input type="hidden" name="squadId" value={squadId} />
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