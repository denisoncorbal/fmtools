import { fetchFormations } from "@/app/lib/data";
import FormationsResultsList from "./FormationsResultsList";

interface PositionsResultFetchProps {
    id: string
}
export default async function FormationsResultsFetch(props: PositionsResultFetchProps) {
    const formationsResults = await fetchFormations(props.id);
    return (
        <FormationsResultsList formationsResults={formationsResults} />
    )
}