'use client'
import { calculateGoalkeeperPositions, calculateLinePositions } from "@/app/lib/actions"
import { GoalkeeperPlayer, LinePlayer } from "@/app/lib/definitions"
import { ChangeEvent, useState } from "react"
import { Button, Col, Container, Form, Row } from "react-bootstrap"

interface CalculatePositionsProps {
    linePlayers: LinePlayer[],
    goalkeeperPlayers: GoalkeeperPlayer[]
}
export default function CalculatePositions(props: CalculatePositionsProps) {

    const [selectedType, setSelectedType] = useState("line");

    function handlePlayerTypeSelection(e: ChangeEvent<HTMLInputElement>) {
        setSelectedType(e.currentTarget.value);
    }

    return (
        <Container>
            <Row>
                <Col>
                    <Form action={selectedType === "line" ? calculateLinePositions : calculateGoalkeeperPositions}>
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
                        <Button type="submit">Calculate</Button>
                    </Form>
                </Col>
            </Row>
        </Container>
    )
}