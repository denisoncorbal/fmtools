import { getToken } from "next-auth/jwt";
import { NextRequest } from "next/server";

export async function GET(req: NextRequest) {
  return Response.json({ status: 405 });
}

export async function POST(
  req: NextRequest,
  //res: NextApiResponse,
) {
  const token = await getToken({
    req,
    secret: process.env.NEXTAUTH_SECRET,
  });

  const idToken = token?.idToken as string | undefined;

  console.log("IdToken");
  console.log(idToken);

  const issuer = process.env.KEYCLOAK_ISSUER!;
  const callbackUrl = `${process.env.NEXTAUTH_URL}/`;

  const endSessionUrl = new URL(`${issuer}/protocol/openid-connect/logout`);

  if (idToken) {
    endSessionUrl.searchParams.set("id_token_hint", idToken);
  }

  endSessionUrl.searchParams.set("post_logout_redirect_uri", callbackUrl);

  // Se não houver id_token, evite assumir que o logout SSO
  // será concluído sem confirmação.
  return Response.json({
    status: 200,
    url: endSessionUrl.toString(),
  });
}
