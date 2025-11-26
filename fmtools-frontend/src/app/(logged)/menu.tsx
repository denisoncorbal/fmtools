'use client'
import { MenuRounded } from "@mui/icons-material";
import { AppBar, Button, MenuItem, Menu as MenuParent, Toolbar, Typography } from "@mui/material";
import Link from "next/link";
import { useRouter } from "next/navigation";
import { useState } from "react";
import styles from './menu.module.css';

export default function Menu() {
    const router = useRouter();
    const [anchorEl, setAnchorEl] = useState<null | HTMLElement>(null);
    const open = Boolean(anchorEl);
    const handleClick = (event: React.MouseEvent<HTMLButtonElement>) => {
        setAnchorEl(event.currentTarget);
    };
    const handleClose = (e: React.MouseEvent<HTMLLIElement>) => {
        setAnchorEl(null);
        router.push(`/${e.currentTarget.id}`);
    };
    return (
        <>
            <AppBar color="primary" position="static">
                <Toolbar>
                    <Button
                        id="basic-button"
                        aria-controls={open ? 'basic-menu' : undefined}
                        aria-haspopup="true"
                        aria-expanded={open ? 'true' : undefined}
                        onClick={handleClick}
                        color="secondary"
                        variant="contained"
                    >
                        <MenuRounded />
                    </Button>
                    <MenuParent
                        id="basic-menu"
                        anchorEl={anchorEl}
                        open={open}
                        onClose={handleClose}
                        slotProps={{
                            list: {
                                'aria-labelledby': 'basic-button',
                            },
                        }}
                    >
                        <MenuItem id="team" onClick={(e) => handleClose(e)}>Team</MenuItem>
                        <MenuItem id="squad" onClick={(e) => handleClose(e)}>Squad</MenuItem>
                        <MenuItem id="tactic" onClick={(e) => handleClose(e)}>Tactic</MenuItem>
                        <MenuItem id="tacticalStyle" onClick={(e) => handleClose(e)}>Tactical Style</MenuItem>
                        <MenuItem id="formation" onClick={(e) => handleClose(e)}>Formation</MenuItem>
                        <MenuItem id="player" onClick={(e) => handleClose(e)}>Player</MenuItem>
                    </MenuParent>
                    <Typography variant="h6" component="div" className={styles.logo_name} sx={{ flexGrow: 1 }}>
                        FMTools
                    </Typography>
                    <Link href="/logout" prefetch={false}><Button variant="contained" color="secondary">Log out</Button></Link>
                </Toolbar>
            </AppBar>
        </>
    );
}