import { fetchAllGoalkeeperPlayers, fetchAllLinePlayers } from "@/app/lib/data";
import CalculateFormations from "./calculate-formations";

export default async function SelectPlayersAndCalculateFormations() {

    const allLinePlayers = await fetchAllLinePlayers();
    const allGoalkeeperPlayers = await fetchAllGoalkeeperPlayers();

    return (
        <CalculateFormations linePlayers={allLinePlayers} goalkeeperPlayers={allGoalkeeperPlayers} />
    )
}