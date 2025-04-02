import { Suspense } from "react";
import FormationsResultsFetch from "./component/formations-results-fetch";

export default async function FormationsResults({ params }: { params: Promise<{ id: string }> }) {
    const { id } = await params;
    return (
        <Suspense fallback={<></>}>
            <FormationsResultsFetch id={id} />
        </Suspense>
    )
}