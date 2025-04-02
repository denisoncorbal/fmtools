'use client'
import { calculateFormations } from "@/app/lib/actions"
import { GoalkeeperPlayer, LinePlayer } from "@/app/lib/definitions"
import { Button, Col, Container, Form, FormCheck, InputGroup, Row } from "react-bootstrap"

interface CalculateFormationsProps {
    linePlayers: LinePlayer[],
    goalkeeperPlayers: GoalkeeperPlayer[]
}
export default function CalculateFormations(props: CalculateFormationsProps) {

    return (
        <Container>
            <Row>
                <Col>
                    <Form action={calculateFormations}>
                        <InputGroup>
                            <InputGroup.Text>Line Players</InputGroup.Text>
                            {
                                props.linePlayers.map((player, index) =>
                                    <FormCheck
                                        key={player.id}
                                        name={"line-" + index}
                                        value={player.id}
                                        label={player.name}
                                    />
                                )}
                        </InputGroup>
                        <InputGroup>
                            <InputGroup.Text>Goalkeeper Players</InputGroup.Text>
                            {
                                props.goalkeeperPlayers.map((player, index) =>
                                    <FormCheck
                                        key={player.id}
                                        name={"goalkeeper-" + index}
                                        value={player.id}
                                        label={player.name}
                                    />
                                )}
                        </InputGroup>
                        <Button type="submit">Calculate</Button>
                    </Form>
                </Col>
            </Row>
        </Container >
    )
}