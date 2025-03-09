import { Suspense } from "react";
import PositionResultsFetch from "./component/position-results-fetch";

export default async function PositionResults({ params }: { params: Promise<{ type: string, id: string }> }) {
    const { type, id } = await params;
    return (
        <Suspense fallback={<></>}>
            <PositionResultsFetch id={id} type={type} />
        </Suspense>
    )
}