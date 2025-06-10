'use client'
import { calculateFormations } from "@/app/lib/actions"
import { GoalkeeperPlayer, LinePlayer } from "@/app/lib/definitions"
import { useRouter } from "next/navigation"
import { useActionState } from "react"
import { Button, Col, Container, Form, FormCheck, Row } from "react-bootstrap"

interface CalculateFormationsProps {
    linePlayers: LinePlayer[],
    goalkeeperPlayers: GoalkeeperPlayer[]
}
export default function CalculateFormations(props: CalculateFormationsProps) {

    const router = useRouter();

    const [calculateFormationResults, calculateFormationAction, calculateFormationIsPending] = useActionState(calculateFormations, null);

    return (
        <Container>
            <Row>
                <Col>
                    <Form action={calculateFormationAction} className="text-center">
                        <Row className="my-2">
                            <Col className="bg-light mx-1">
                                <h2>Line Players</h2>
                                <div className="d-flex flex-row justify-content-center align-items-center flex-wrap align-content-center">
                                    {
                                        props.linePlayers.map((player, index) =>
                                            <FormCheck
                                                key={player.id}
                                                name={"line-" + index}
                                                value={player.id}
                                                label={player.name}
                                                className="m-1"
                                                defaultChecked
                                            />
                                        )}
                                </div>
                            </Col>
                            <Col className="bg-light mx-1">
                                <h2>Goalkeeper Players</h2>
                                <div className="d-flex flex-row justify-content-center align-items-center flex-wrap align-content-center">
                                    {
                                        props.goalkeeperPlayers.map((player, index) =>
                                            <FormCheck
                                                key={player.id}
                                                name={"goalkeeper-" + index}
                                                value={player.id}
                                                label={player.name}
                                                className="m-1"
                                                defaultChecked
                                            />
                                        )}
                                </div>
                            </Col>
                        </Row>
                        <Button type="submit" disabled={calculateFormationIsPending}>Calculate</Button>
                        {
                            (calculateFormationResults != null && calculateFormationResults.length > 0) ? <>{router.push(calculateFormationResults)}</> : null
                        }
                    </Form>
                </Col>
            </Row>
        </Container >
    )
}