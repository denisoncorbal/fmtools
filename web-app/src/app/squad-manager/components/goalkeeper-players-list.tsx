import { fetchAllGoalkeeperPlayers } from "@/app/lib/data";
import PlayersList from "./players-list";

export default async function GoalkeeperPlayersList() {
    const allGoalkeeperPlayers = await fetchAllGoalkeeperPlayers();

    return (
        <PlayersList players={allGoalkeeperPlayers} default="goalkeeper" />
    )
}