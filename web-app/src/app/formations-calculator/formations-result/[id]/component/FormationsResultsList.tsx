'use client'

import { isSuitableTacticalStyleArray, TacticalStyle } from "@/app/lib/definitions";
import { Accordion, AccordionBody, AccordionHeader, AccordionItem, Col, Container, Row } from "react-bootstrap";

interface FormationsResultsListProps {
    formationsResults: TacticalStyle[],
}
export default function FormationsResultsList(props: FormationsResultsListProps) {
    return (
        <Container>
            <Row>
                <Col>
                    {
                        isSuitableTacticalStyleArray(props.formationsResults) && props.formationsResults.sort(sortFormationResults).map((formation, index) =>
                            <Accordion key={"tacticalStyle-" + index} defaultActiveKey="0">
                                <Accordion.Item eventKey={index.toString()}>
                                    <AccordionHeader>{formation.name} {parseFloat((formation.preferableFormations.reduce((prev, formation) => prev += formation.averagePercentage, 0) / formation.preferableFormations.length).toFixed(2))}%</AccordionHeader>
                                    <AccordionBody>
                                        <p>Mentality: {formation.mentality}</p>
                                        {formation.preferableFormations.map((pf, pfIndex) =>
                                            <Accordion key={"formation-" + index + "-" + pfIndex} defaultActiveKey="0-0">
                                                <AccordionItem eventKey={index.toString() + "-" + pfIndex.toString()}>
                                                    <AccordionHeader>{pf.name}: {parseFloat(pf.averagePercentage.toFixed(2))}%</AccordionHeader>
                                                    <AccordionBody>
                                                        <p>{pf.goalkeeperPosition.name}: {pf.goalkeeperPosition.playerName} {"(" + parseFloat(pf.goalkeeperPosition.percentage.toFixed(2)) + "%)"}</p>
                                                        {pf.linePositions.map((lp, lpIndex) =>
                                                            <p key={"player-" + index + "-" + pfIndex + "-" + lpIndex}>{lp.name}: {lp.playerName} {"(" + parseFloat(lp.percentage.toFixed(2)) + "%)"}</p>
                                                        )}
                                                    </AccordionBody>
                                                </AccordionItem>
                                            </Accordion>
                                        )}
                                    </AccordionBody>
                                </Accordion.Item>
                            </Accordion>
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