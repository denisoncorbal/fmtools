import { Suspense } from "react";
import SelectPlayersAndCalculateFormations from "./components/select-players-and-calculate-formations";

export default function FormationsCalculator() {
    return (
        <Suspense fallback={<></>}>
            <SelectPlayersAndCalculateFormations />
        </Suspense>
    )
}