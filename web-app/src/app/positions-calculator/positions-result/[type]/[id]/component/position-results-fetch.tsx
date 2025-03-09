import { fetchAllPositions, fetchGoalkeeperPlayerById, fetchLinePlayerById } from "@/app/lib/data";
import PositionsResultsList from "./PositionsResultsList";

interface PositionsResultFetchProps {
    type: string,
    id: string
}
export default async function PositionsResultsFetch(props: PositionsResultFetchProps) {
    const positionsResults = await fetchAllPositions(props.id);
    const playerData = props.type === "line" ? await fetchLinePlayerById(props.id) : await fetchGoalkeeperPlayerById(props.id);
    return (
        <PositionsResultsList playerData={playerData} positionsResults={positionsResults} />
    )
}