'use client'

import { GoalkeeperPlayer, isSuitablePositionArray, LinePlayer, SuitablePosition } from "@/app/lib/definitions";
import { Card, CardBody, CardTitle, Col, Container, Row } from "react-bootstrap";

interface PositionsResultsListProps {
    positionsResults: SuitablePosition[],
    playerData: LinePlayer | GoalkeeperPlayer
}
export default function PositionsResultsList(props: PositionsResultsListProps) {
    console.log(props.positionsResults);
    console.log(typeof (props.positionsResults));
    return (
        <Container>
            <Row>
                <Col>
                    <Card>
                        <CardTitle>
                            {props.playerData.name}
                        </CardTitle>
                        <CardBody>
                            {Object.entries(props.playerData).map(([key, value], index) =>
                                key != "name" && <p key={index}>{key}: {value}</p>
                            )}
                        </CardBody>
                    </Card>

                </Col>
                <Col>
                    {
                        isSuitablePositionArray(props.positionsResults) && props.positionsResults.sort(sortPositionResults).map((position, index) =>
                            <Card key={index}>
                                <Card.Title>{position.name}</Card.Title>
                                <Card.Body>
                                    <p>Adaptation: {position.percentage}</p>
                                </Card.Body>
                            </Card>
                        )
                    }
                </Col>
            </Row>
        </Container>
    )
}

function sortPositionResults(a: SuitablePosition, b: SuitablePosition): number {
    if (a.percentage != b.percentage)
        return b.percentage - a.percentage;
    if (a.quantityKeyAttributes != b.quantityKeyAttributes)
        return b.quantityKeyAttributes - a.quantityKeyAttributes;
    return b.quantityPreferableAttributes - a.quantityPreferableAttributes
}