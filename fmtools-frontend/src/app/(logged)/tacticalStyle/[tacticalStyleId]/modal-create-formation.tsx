'use client'

import { Box, Button, FormControl, InputLabel, MenuItem, Modal, Select, TextField, Typography, useTheme } from "@mui/material";
import { useState } from "react";
import { createFormation } from "./action";
import { VALID_AMC, VALID_AMCL, VALID_AMCR, VALID_AML, VALID_AMR, VALID_DC, VALID_DCL, VALID_DCR, VALID_DL, VALID_DM, VALID_DMCL, VALID_DMCR, VALID_DR, VALID_GK, VALID_MC, VALID_MCL, VALID_MCR, VALID_ML, VALID_MR, VALID_STC, VALID_STCL, VALID_STCR, VALID_WBL, VALID_WBR } from "./constants";
import styles from './modal-create-formation.module.css';

export default function ModalCreateFormation({ tacticalStyleId }: { tacticalStyleId: string }) {
    const theme = useTheme();

    const [open, setOpen] = useState(false);

    const [stcl, setStcl] = useState('');
    const [stc, setStc] = useState('');
    const [stcr, setStcr] = useState('');

    const [aml, setAml] = useState('');
    const [amcl, setAmcl] = useState('');
    const [amc, setAmc] = useState('');
    const [amcr, setAmcr] = useState('');
    const [amr, setAmr] = useState('');

    const [ml, setMl] = useState('');
    const [mcl, setMcl] = useState('');
    const [mc, setMc] = useState('');
    const [mcr, setMcr] = useState('');
    const [mr, setMr] = useState('');

    const [wbl, setWbl] = useState('');
    const [dmcl, setDmcl] = useState('');
    const [dm, setDm] = useState('');
    const [dmcr, setDmcr] = useState('');
    const [wbr, setWbr] = useState('');

    const [dl, setDl] = useState('');
    const [dcl, setDcl] = useState('');
    const [dc, setDc] = useState('');
    const [dcr, setDcr] = useState('');
    const [dr, setDr] = useState('');

    const [gk, setGk] = useState('');


    const handleOpen = () => { setOpen(true) };
    const handleClose = () => { setOpen(false) };

    return (
        <>
            <Button onClick={handleOpen} variant="contained">Add Formation</Button>
            <Modal open={open} onClose={handleClose}>
                <Box bgcolor={theme.palette.background.paper} className={styles.modal_container}>
                    <form className={styles.form_container} action={createFormation}>
                        <Typography className={styles.modal_title} variant="h6" component='h3'>Create Formation</Typography>
                        <TextField className={styles.field_name} id="name" name="name" type="text" label="Name"></TextField>
                        <div className={styles.row_position_container}>
                            <FormControl fullWidth>
                                <InputLabel id="stcl-select-label">STCL</InputLabel>
                                <Select
                                    name="STCL"
                                    labelId="stcl-select-label"
                                    id="stcl-select"
                                    className={styles.stcl_select}
                                    value={stcl}
                                    label="STCL"
                                    onChange={(e) => { setStcl(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_STCL.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>

                            <FormControl fullWidth>
                                <InputLabel id="stc-select-label">STC</InputLabel>
                                <Select
                                    name="STC"
                                    labelId="stc-select-label"
                                    id="stc-select"
                                    className={styles.stc_select}
                                    value={stc}
                                    label="STC"
                                    onChange={(e) => { setStc(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_STC.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>
                            <FormControl fullWidth>
                                <InputLabel id="stcr-select-label">STCR</InputLabel>
                                <Select
                                    name="STCR"
                                    labelId="stcr-select-label"
                                    id="stcr-select"
                                    className={styles.stcr_select}
                                    value={stcr}
                                    label="STCR"
                                    onChange={(e) => { setStcr(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_STCR.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>
                        </div>
                        <div className={styles.row_position_container}>
                            <FormControl fullWidth>
                                <InputLabel id="aml-select-label">AML</InputLabel>
                                <Select
                                    name="AML"
                                    labelId="aml-select-label"
                                    id="aml-select"
                                    className={styles.aml_select}
                                    value={aml}
                                    label="AML"
                                    onChange={(e) => { setAml(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_AML.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>
                            <FormControl fullWidth>
                                <InputLabel id="amcl-select-label">AMCL</InputLabel>
                                <Select
                                    name="AMCL"
                                    labelId="amcl-select-label"
                                    id="amcl-select"
                                    className={styles.amcl_select}
                                    value={amcl}
                                    label="AMCL"
                                    onChange={(e) => { setAmcl(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_AMCL.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>

                            <FormControl fullWidth>
                                <InputLabel id="amc-select-label">AMC</InputLabel>
                                <Select
                                    name="AMC"
                                    labelId="amc-select-label"
                                    id="amc-select"
                                    className={styles.amc_select}
                                    value={amc}
                                    label="AMC"
                                    onChange={(e) => { setAmc(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_AMC.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>
                            <FormControl fullWidth>
                                <InputLabel id="amcr-select-label">AMCR</InputLabel>
                                <Select
                                    name="AMCR"
                                    labelId="amcr-select-label"
                                    id="amcr-select"
                                    className={styles.amcr_select}
                                    value={amcr}
                                    label="AMCR"
                                    onChange={(e) => { setAmcr(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_AMCR.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>
                            <FormControl fullWidth>
                                <InputLabel id="amr-select-label">AMR</InputLabel>
                                <Select
                                    name="AMR"
                                    labelId="amr-select-label"
                                    id="amr-select"
                                    className={styles.amr_select}
                                    value={amr}
                                    label="AMR"
                                    onChange={(e) => { setAmr(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_AMR.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>
                        </div>
                        <div className={styles.row_position_container}>
                            <FormControl fullWidth>
                                <InputLabel id="ml-select-label">ML</InputLabel>
                                <Select
                                    name="ML"
                                    labelId="ml-select-label"
                                    id="ml-select"
                                    className={styles.ml_select}
                                    value={ml}
                                    label="ML"
                                    onChange={(e) => { setMl(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_ML.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>
                            <FormControl fullWidth>
                                <InputLabel id="mcl-select-label">MCL</InputLabel>
                                <Select
                                    name="MCL"
                                    labelId="mcl-select-label"
                                    id="mcl-select"
                                    className={styles.mcl_select}
                                    value={mcl}
                                    label="MCL"
                                    onChange={(e) => { setMcl(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_MCL.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>

                            <FormControl fullWidth>
                                <InputLabel id="mc-select-label">MC</InputLabel>
                                <Select
                                    name="MC"
                                    labelId="mc-select-label"
                                    id="mc-select"
                                    className={styles.mc_select}
                                    value={mc}
                                    label="MC"
                                    onChange={(e) => { setMc(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_MC.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>
                            <FormControl fullWidth>
                                <InputLabel id="mcr-select-label">MCR</InputLabel>
                                <Select
                                    name="MCR"
                                    labelId="mcr-select-label"
                                    id="mcr-select"
                                    className={styles.mcr_select}
                                    value={mcr}
                                    label="MCR"
                                    onChange={(e) => { setMcr(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_MCR.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>
                            <FormControl fullWidth>
                                <InputLabel id="mr-select-label">MR</InputLabel>
                                <Select
                                    name="MR"
                                    labelId="mr-select-label"
                                    id="mr-select"
                                    className={styles.mr_select}
                                    value={mr}
                                    label="MR"
                                    onChange={(e) => { setMr(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_MR.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>
                        </div>
                        <div className={styles.row_position_container}>
                            <FormControl fullWidth>
                                <InputLabel id="wbl-select-label">WBL</InputLabel>
                                <Select
                                    name="WBL"
                                    labelId="wbl-select-label"
                                    id="wbl-select"
                                    className={styles.wbl_select}
                                    value={wbl}
                                    label="WBL"
                                    onChange={(e) => { setWbl(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_WBL.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>
                            <FormControl fullWidth>
                                <InputLabel id="dmcl-select-label">DMCL</InputLabel>
                                <Select
                                    name="DMCL"
                                    labelId="dmcl-select-label"
                                    id="dmcl-select"
                                    className={styles.dmcl_select}
                                    value={dmcl}
                                    label="DMCL"
                                    onChange={(e) => { setDmcl(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_DMCL.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>

                            <FormControl fullWidth>
                                <InputLabel id="dm-select-label">DM</InputLabel>
                                <Select
                                    name="DM"
                                    labelId="dm-select-label"
                                    id="dm-select"
                                    className={styles.dm_select}
                                    value={dm}
                                    label="DM"
                                    onChange={(e) => { setDm(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_DM.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>
                            <FormControl fullWidth>
                                <InputLabel id="dmcr-select-label">DMCR</InputLabel>
                                <Select
                                    name="DMCR"
                                    labelId="dmcr-select-label"
                                    id="dmcr-select"
                                    className={styles.dmcr_select}
                                    value={dmcr}
                                    label="DMCR"
                                    onChange={(e) => { setDmcr(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_DMCR.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>
                            <FormControl fullWidth>
                                <InputLabel id="wbr-select-label">WBR</InputLabel>
                                <Select
                                    name="WBR"
                                    labelId="wbr-select-label"
                                    id="wbr-select"
                                    className={styles.wbr_select}
                                    value={wbr}
                                    label="WBR"
                                    onChange={(e) => { setWbr(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_WBR.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>
                        </div>
                        <div className={styles.row_position_container}>
                            <FormControl fullWidth>
                                <InputLabel id="dl-select-label">DL</InputLabel>
                                <Select
                                    name="DL"
                                    labelId="dl-select-label"
                                    id="dl-select"
                                    className={styles.dl_select}
                                    value={dl}
                                    label="DL"
                                    onChange={(e) => { setDl(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_DL.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>
                            <FormControl fullWidth>
                                <InputLabel id="dcl-select-label">DCL</InputLabel>
                                <Select
                                    name="DCL"
                                    labelId="dcl-select-label"
                                    id="dcl-select"
                                    className={styles.dcl_select}
                                    value={dcl}
                                    label="DCL"
                                    onChange={(e) => { setDcl(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_DCL.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>

                            <FormControl fullWidth>
                                <InputLabel id="dc-select-label">DC</InputLabel>
                                <Select
                                    name="DC"
                                    labelId="dc-select-label"
                                    id="dc-select"
                                    className={styles.dc_select}
                                    value={dc}
                                    label="DC"
                                    onChange={(e) => { setDc(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_DC.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>
                            <FormControl fullWidth>
                                <InputLabel id="dcr-select-label">DCR</InputLabel>
                                <Select
                                    name="DCR"
                                    labelId="dcr-select-label"
                                    id="dcr-select"
                                    className={styles.dcr_select}
                                    value={dcr}
                                    label="DCR"
                                    onChange={(e) => { setDcr(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_DCR.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>
                            <FormControl fullWidth>
                                <InputLabel id="dr-select-label">DR</InputLabel>
                                <Select
                                    name="DR"
                                    labelId="dr-select-label"
                                    id="dr-select"
                                    className={styles.dr_select}
                                    value={dr}
                                    label="DR"
                                    onChange={(e) => { setDr(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_DR.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>
                        </div>
                        <div className={styles.row_position_container}>
                            <FormControl fullWidth>
                                <InputLabel id="gk-select-label">GK</InputLabel>
                                <Select
                                    name="GK"
                                    labelId="gk-select-label"
                                    id="gk-select"
                                    className={styles.gk_select}
                                    value={gk}
                                    label="GK"
                                    onChange={(e) => { setGk(e.target.value as string) }}
                                >
                                    <MenuItem value=''>Selecione</MenuItem>
                                    {VALID_GK.map((v) => (
                                        <MenuItem key={v} value={v}>{v.split(',')[1].split('_').join(' ')} - {v.split(',')[2]}</MenuItem>
                                    ))}
                                </Select>
                            </FormControl>
                        </div>
                        <input type="hidden" name="tacticalStyleId" value={tacticalStyleId} />
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