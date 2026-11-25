"use client";
import { Login as LoginIcon, Security } from "@mui/icons-material";
import {
  Box,
  Button,
  CircularProgress,
  Container,
  Divider,
  Icon,
  Paper,
  Typography,
} from "@mui/material";
import { useState } from "react";
import styles from "./page.module.css";

const loginApiPath =
  process.env.NEXT_PUBLIC_BACKEND_COMPLETE_BASE_URL! +
  process.env.NEXT_PUBLIC_BACKEND_API_AUTH_LOGIN_PATH!;

export default function Login() {
  const [loading, setLoading] = useState(false);

  function handleLogin() {
    setLoading(true);

    window.location.href = `${loginApiPath}`;
  }

  return (
    <Box component="section" className={styles.background}>
      <Container maxWidth="xs">
        <Paper
          elevation={4}
          sx={{
            p: { xs: 3, sm: 5 },
            borderRadius: 3,
            textAlign: "center",
          }}
        >
          <Box
            sx={{
              width: 64,
              height: 64,
              borderRadius: "50%",
              bgcolor: "primary.light",
              color: "primary.dark",
              display: "flex",
              alignItems: "center",
              justifyContent: "center",
              mx: "auto",
              mb: 2,
            }}
          >
            <Icon component={Security} sx={{ fontSize: 34 }} />
          </Box>

          <Typography variant="h5" gutterBottom>
            Welcome!
          </Typography>

          <Typography color="text.secondary" sx={{ mb: 3 }}>
            Log in with your account.
          </Typography>

          <Divider sx={{ mb: 3 }}>
            <Typography variant="body2" color="text.secondary">
              Safe access
            </Typography>
          </Divider>

          <Button
            fullWidth
            variant="contained"
            size="large"
            onClick={handleLogin}
            disabled={loading}
            startIcon={
              loading ? (
                <CircularProgress size={20} color="inherit" />
              ) : (
                <Icon component={LoginIcon} />
              )
            }
            sx={{
              py: 1.5,
              borderRadius: 2,
              textTransform: "none",
              fontSize: "1rem",
              fontWeight: 600,
            }}
          >
            {loading ? "Redirecting..." : "Log in with Keycloak"}
          </Button>

          <Typography variant="caption" color="text.secondary" sx={{ mt: 3 }}>
            Protected authentication.
          </Typography>
        </Paper>
      </Container>
    </Box>
  );
}
