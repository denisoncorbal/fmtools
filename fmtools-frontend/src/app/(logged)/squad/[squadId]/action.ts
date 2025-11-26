'use server'

import { cookies, headers } from "next/headers";
import { redirect } from "next/navigation";

const textPlayerApiPath = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_TEXT_PLAYER_PATH!;
const htmlPlayerApiPath = process.env.BACKEND_COMPLETE_BASE_URL! + process.env.BACKEND_API_HTML_PLAYER_PATH!;

export async function createPlayer(data: FormData) {
    const h = await headers();
    const host = h.get('host');
    const ck = await cookies();
    const textFile = data.get('textFile') as File;
    if (textFile && (textFile instanceof Blob) && textFile.type == 'application/msword' && textFile.name.endsWith('.rtf')) {
        const uploadForm = new FormData();
        uploadForm.set('name', data.get('name')!.toString());
        uploadForm.set('squadId', data.get('squadId')!.toString());
        uploadForm.set('playerData', textFile);
        uploadForm.set('url', textPlayerApiPath);
        const res = await fetch(`http://${host}/proxy/backend`, {
            method: 'POST',
            body: uploadForm,
            headers: {
                cookie: ck.toString()
            }
        })
        if (res.status == 200) {
            redirect(`/squad/${data.get('squadId')}`);
        }
    } else {
        const htmlFile = data.get('htmlFile') as File;
        if (htmlFile && (htmlFile instanceof Blob) && htmlFile.type == 'text/html' && htmlFile.name.endsWith('.html')) {
            const uploadForm = new FormData();
            uploadForm.set('name', data.get('name')!.toString());
            uploadForm.set('squadId', data.get('squadId')!.toString());
            uploadForm.set('playerData', htmlFile);
            uploadForm.set('url', htmlPlayerApiPath);
            const res = await fetch(`http://${host}/proxy/backend`, {
                method: 'POST',
                body: uploadForm,
                headers: {
                    cookie: ck.toString()
                }
            })

            if (res.status == 200) {
                redirect(`/squad/${data.get('squadId')}`);
            }
        }
    }

}