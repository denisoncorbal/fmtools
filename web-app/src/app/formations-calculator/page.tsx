import { Suspense } from "react";
import SelectPlayersAndCalculateFormations from "./components/select-players-and-calculate-formations";

export const dynamic = "force-dynamic";

export default async function Page() {
    return (
        <Suspense fallback={<></>}>
            <SelectPlayersAndCalculateFormations />
        </Suspense>
    )
}