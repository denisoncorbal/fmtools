"use server";

import { redirect } from "next/navigation";

const textPlayerApiPath =
  process.env.BACKEND_COMPLETE_BASE_URL! +
  process.env.BACKEND_API_TEXT_PLAYER_PATH!;
const htmlPlayerApiPath =
  process.env.BACKEND_COMPLETE_BASE_URL! +
  process.env.BACKEND_API_HTML_PLAYER_PATH!;

export async function createPlayer(data: FormData) {
  const textFile = data.get("textFile") as File;
  if (
    textFile &&
    textFile instanceof Blob &&
    textFile.type == "application/rtf" &&
    textFile.name.endsWith(".rtf")
  ) {
    const uploadForm = new FormData();
    uploadForm.set("name", data.get("name")!.toString());
    uploadForm.set("squadId", data.get("squadId")!.toString());
    uploadForm.set("playerData", textFile);
    const res = await fetch(`${textPlayerApiPath}`, {
      method: "POST",
      body: uploadForm,
      credentials: "include",
    });
    if (res.status == 200) {
      redirect(`/squad/${data.get("squadId")}`);
    }
  } else {
    const htmlFile = data.get("htmlFile") as File;
    if (
      htmlFile &&
      htmlFile instanceof Blob &&
      htmlFile.type == "text/html" &&
      htmlFile.name.endsWith(".html")
    ) {
      const uploadForm = new FormData();
      uploadForm.set("name", data.get("name")!.toString());
      uploadForm.set("squadId", data.get("squadId")!.toString());
      uploadForm.set("playerData", htmlFile);
      const res = await fetch(`${htmlPlayerApiPath}`, {
        method: "POST",
        body: uploadForm,
        credentials: "include",
      });

      if (res.status == 200) {
        redirect(`/squad/${data.get("squadId")}`);
      }
    }
  }
}
