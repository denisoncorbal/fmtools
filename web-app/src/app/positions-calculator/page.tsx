import { Suspense } from "react";
import SelectPlayerAndCalculatePositions from "./components/select-player-and-calculate-positions";

export const dynamic = "force-dynamic";

export default async function Page() {
    return (
        <Suspense fallback={<></>}>
            <SelectPlayerAndCalculatePositions />
        </Suspense>
    )
}