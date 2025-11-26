import { Lock } from '@mui/icons-material';
import { Avatar, Box, Icon } from '@mui/material';
import { lightBlue } from '@mui/material/colors';
import LoginForm from './loginForm';
import styles from './page.module.css';

export default async function Login() {
    return (
        <>
            <Box component='section' className={styles.background}>
                <Avatar sx={{ bgcolor: lightBlue[600] }} className={styles.iconWrapper}>
                    <Icon component={Lock}></Icon>
                </Avatar>
                <LoginForm />
            </Box>
        </>
    )
}