'use client'

import { Button, TextField, Typography } from "@mui/material";
import Link from "next/link";
import { useActionState } from "react";
import { login } from "./action";
import styles from './page.module.css';

export default function LoginForm() {

    const [state, formAction, pending] = useActionState(login, { message: '' });

    return (
        <>
            <form action={formAction} className={styles.form}>
                <TextField id='username' name='username' label='Username' variant='outlined' type='text' autoComplete='username' required></TextField>
                <TextField id='password' name='password' label='Password' variant='outlined' type='password' autoComplete='current-password' required></TextField>
                <Button variant='contained' type='submit' disabled={pending}>Login</Button>
                <Link href={'/signin'}><Typography color='primary' variant='body2'>Don&apos;t have an account? Sign In!</Typography></Link>
                {state?.message && <p>{state.message}</p>}
            </form>
        </>
    )
}