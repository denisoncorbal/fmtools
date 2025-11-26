import { Lock } from '@mui/icons-material';
import { Avatar, Box, Icon } from '@mui/material';
import { lightBlue } from '@mui/material/colors';
import styles from './page.module.css';
import SignInForm from './signInForm';

export default async function Signin() {
    return (
        <>
            <Box component='section' className={styles.background}>
                <Avatar sx={{ bgcolor: lightBlue[600] }} className={styles.iconWrapper}>
                    <Icon component={Lock}></Icon>
                </Avatar>
                <SignInForm />
            </Box>
        </>
    )
}