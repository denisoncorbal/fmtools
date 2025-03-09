import { fetchAllGoalkeeperPlayers, fetchAllLinePlayers } from "@/app/lib/data";
import CalculatePositions from "./calculate-positions";

export default async function SelectPlayerAndCalculatePositions() {

    const allLinePlayers = await fetchAllLinePlayers();
    const allGoalkeeperPlayers = await fetchAllGoalkeeperPlayers();

    return (
        <CalculatePositions linePlayers={allLinePlayers} goalkeeperPlayers={allGoalkeeperPlayers} />
    )
}