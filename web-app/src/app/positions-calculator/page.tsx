import { Suspense } from "react";
import SelectPlayerAndCalculatePositions from "./components/select-player-and-calculate-positions";

export default function PositionsCalculator() {
    return (
        <Suspense fallback={<></>}>
            <SelectPlayerAndCalculatePositions />
        </Suspense>
    )
}