'use client'
import { calculateGoalkeeperPositions, calculateLinePositions } from "@/app/lib/actions"
import { GoalkeeperPlayer, LinePlayer } from "@/app/lib/definitions"
import { useRouter } from "next/navigation"
import { ChangeEvent, useActionState, useState } from "react"
import { Button, Col, Container, Form, Row } from "react-bootstrap"

interface CalculatePositionsProps {
    linePlayers: LinePlayer[],
    goalkeeperPlayers: GoalkeeperPlayer[]
}
export default function CalculatePositions(props: CalculatePositionsProps) {

    const router = useRouter();

    const [calculateGoalkeeperResults, calculateGoalkeeperAction, calculateGoalkeeperIsPending] = useActionState(calculateGoalkeeperPositions, null);
    const [calculateLineResults, calculateLineAction, calculateLineIsPending] = useActionState(calculateLinePositions, null);
    
    const [selectedType, setSelectedType] = useState("line");

    function handlePlayerTypeSelection(e: ChangeEvent<HTMLInputElement>) {
        setSelectedType(e.currentTarget.value);
    }

    return (
        <Container>
            <Row>
                <Col>
                    <Form action={selectedType === "line" ? calculateLineAction : calculateGoalkeeperAction}>
                        <Form.Check
                            type="radio"
                            name="player-type"
                            id="line"
                            label="Line Player"
                            inline
                            onChange={(e) => handlePlayerTypeSelection(e)}
                            value="line"
                            defaultChecked
                        />
                        <Form.Check
                            type="radio"
                            name="player-type"
                            id="goalkeeper"
                            label="Goalkeeper Player"
                            inline
                            onChange={(e) => handlePlayerTypeSelection(e)}
                            value="goalkeeper"
                        />

                        <Form.Select id="select-player" name="select-player"
                        >
                            <option>Choose the player</option>
                            {
                                selectedType === "line" ?
                                    props.linePlayers.map((player) => <option key={player.id} value={player.id}>{player.name}</option>)
                                    :
                                    props.goalkeeperPlayers.map((player) => <option key={player.id} value={player.id}>{player.name}</option>)
                            }
                        </Form.Select>
                        <Button type="submit" disabled={calculateGoalkeeperIsPending || calculateLineIsPending}>Calculate</Button>
                        {
                            (calculateGoalkeeperResults != null && calculateGoalkeeperResults.length > 0) ? <>{router.push(calculateGoalkeeperResults)}</> : null
                        }
                        {
                            (calculateLineResults != null && calculateLineResults.length > 0) ? <>{router.push(calculateLineResults)}</> : null
                        }
                    </Form>
                </Col>
            </Row>
        </Container>
    )
}