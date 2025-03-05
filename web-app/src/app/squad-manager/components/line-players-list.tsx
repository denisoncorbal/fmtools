import { fetchAllLinePlayers } from "@/app/lib/data";
import PlayersList from "./players-list";

export default async function LinePlayersList() {
    const allLinePlayers = await fetchAllLinePlayers();

    return (
        <PlayersList players={allLinePlayers} default="line" />
    )
}