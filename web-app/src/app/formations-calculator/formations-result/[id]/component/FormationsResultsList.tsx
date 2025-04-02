'use client'

import { isSuitableTacticalStyleArray, TacticalStyle } from "@/app/lib/definitions";
import { Card, Col, Container, Row } from "react-bootstrap";

interface FormationsResultsListProps {
    formationsResults: TacticalStyle[],
}
export default function FormationsResultsList(props: FormationsResultsListProps) {
    console.log(props.formationsResults);
    return (
        <Container>
            <Row>
                <Col>
                    {
                        isSuitableTacticalStyleArray(props.formationsResults) && props.formationsResults.sort(sortFormationResults).map((formation, index) =>
                            <Card key={"tacticalStyle-" + index}>
                                <Card.Title>{formation.name}</Card.Title>
                                <Card.Body>
                                    <p>Mentality: {formation.mentality}</p>
                                    {formation.preferableFormations.map((pf, pfIndex) =>
                                        <Card key={"formation-" + index + "-" + pfIndex}>
                                            <Card.Title>{pf.name}: {pf.averagePercentage}</Card.Title>
                                            <Card.Body>
                                                <p>{pf.goalkeeperPosition.name}: {pf.goalkeeperPosition.playerName}</p>
                                                {pf.linePositions.map((lp, lpIndex) =>
                                                    <p key={"player-" + index + "-" + pfIndex + "-" + lpIndex}>{lp.name}: {lp.playerName}</p>
                                                )}
                                            </Card.Body>
                                        </Card>
                                    )}
                                </Card.Body>
                            </Card>
                        )
                    }
                </Col>
            </Row>
        </Container>
    )
}

function sortFormationResults(a: TacticalStyle, b: TacticalStyle): number {
    return (b.preferableFormations.reduce((prev, formation) => prev += formation.averagePercentage, 0) / b.preferableFormations.length) - (a.preferableFormations.reduce((prev, formation) => prev += formation.averagePercentage, 0) / a.preferableFormations.length);
}