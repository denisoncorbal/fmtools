'use client'

import { GoalkeeperPlayer, isSuitablePositionArray, LinePlayer, SuitablePosition } from "@/app/lib/definitions";
import { Card, CardBody, CardTitle, Col, Container, Row } from "react-bootstrap";
import styles from "./position-results-list.module.css";

interface PositionsResultsListProps {
    positionsResults: SuitablePosition[],
    playerData: LinePlayer | GoalkeeperPlayer
}
export default function PositionsResultsList(props: PositionsResultsListProps) {
    return (
        <Container>
            <Row>
                <Col>
                    <Card className="m-1 p-1">
                        <CardTitle>
                            {props.playerData.name}
                        </CardTitle>
                        <CardBody className="d-flex flex-row flex-wrap align-items-center justify-content-start">
                            {Object.entries(props.playerData).map(([key, value], index) =>
                                key != "name" && <p className="m-1" key={index}>{key}: {value}</p>
                            )}
                        </CardBody>
                    </Card>

                </Col>
                <Col className={styles.card_results} >
                    {
                        isSuitablePositionArray(props.positionsResults) && props.positionsResults.sort(sortPositionResults).map((position, index) =>
                            <Card key={index} className={"m-1 p-1 " + (index%2!=0 ? styles.odd_card_results : "")}>
                                <Card.Title className="p-1">{position.name} - {parseFloat(position.percentage.toFixed(2))}%</Card.Title>
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