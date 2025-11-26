'use client'

import { Button, TextField, Typography } from "@mui/material";
import Link from "next/link";
import { useActionState } from "react";
import { signIn } from "./action";
import styles from './page.module.css';

export default function SignInForm() {

    const [state, formAction, pending] = useActionState(signIn, { message: '' });

    return (
        <>
            <form action={formAction} className={styles.form}>
                <TextField id='username' name='username' label='Username' variant='outlined' type='text' autoComplete='username' required></TextField>
                <TextField id='password' name='password' label='Password' variant='outlined' type='password' autoComplete='current-password' required></TextField>
                <Button variant='contained' type='submit' disabled={pending}>Sign In</Button>
                <Link href={'/login'}><Typography color='primary' variant='body2'>Already have an account? Log In!</Typography></Link>
                {state.message && <p>{state.message}</p>}
            </form>
        </>
    )
}