'use server'

import { cookies, headers } from "next/headers";
import { redirect } from "next/navigation";

const formationApiPath = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_FORMATION_PATH!;

export async function createFormation(data: FormData) {
    const h = await headers();
    const host = h.get('host');
    const ck = await cookies();

    const tacticalPositions = [
        data.get('GK'),
        data.get('DL'),
        data.get('DCL'),
        data.get('DC'),
        data.get('DCR'),
        data.get('DR'),
        data.get('WBL'),
        data.get('DMCL'),
        data.get('DM'),
        data.get('DMCR'),
        data.get('WBR'),
        data.get('ML'),
        data.get('MCL'),
        data.get('MC'),
        data.get('MCR'),
        data.get('MR'),
        data.get('AML'),
        data.get('AMCL'),
        data.get('AMC'),
        data.get('AMCR'),
        data.get('AMR'),
        data.get('STCL'),
        data.get('STC'),
        data.get('STCR')
    ].filter((v) => { return (v && v.toString().length > 0) }).map((v) => {
        return ({
            fieldPosition: v?.toString().split(',')[0],
            role: v?.toString().split(',')[1],
            duty: v?.toString().split(',')[2]
        })
    });

    const res = await fetch(`http://${host}/proxy/backend`, {
        method: "POST",
        body: JSON.stringify({
            url: formationApiPath, data: {
                name: data.get('name')?.toString(),
                tacticalPositions: tacticalPositions,
                tacticalStyleId: data.get('tacticalStyleId')?.toString()
            }
        }),
        headers: {
            cookie: ck.toString(),
            'Content-Type': 'application/json',
        }
    })

    if (res.status == 200) {
        redirect(`/tacticalStyle/${data.get('tacticalStyleId')}`);
    }
}