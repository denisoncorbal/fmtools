'use client'
import { createTheme, responsiveFontSizes } from "@mui/material/styles";

let theme = createTheme({
    colorSchemes: {
        dark: {
            palette: {
                contrastThreshold: 4.5,
                primary: {
                    main: '#601ba6',
                },
                secondary: {
                    main: '#05c7f2',
                },
                error: {
                    main: '#ba1a1a',
                }
            }
        },
        light: {
            palette: {
                contrastThreshold: 4.5,
                primary: {
                    main: '#601ba6',
                },
                secondary: {
                    main: '#05c7f2',
                },
                error: {
                    main: '#ba1a1a',
                }
            }
        }
    }
});

theme = responsiveFontSizes(theme);

export default theme;