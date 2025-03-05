'use client'
import { GoalkeeperPlayer, isGoalkeeperPlayerArray, isLinePlayerArray, LinePlayer } from "@/app/lib/definitions";
import { faPen } from "@fortawesome/free-solid-svg-icons/faPen";
import { faPlus } from "@fortawesome/free-solid-svg-icons/faPlus";
import { faTrash } from "@fortawesome/free-solid-svg-icons/faTrash";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { useState } from "react";
import { Accordion, Button, Col, Container, Row, Table } from "react-bootstrap";
import ModalAddOrEditGoalkeeperPlayer from "../modals/modal-add-or-edit-goalkeeper-player";
import ModalAddOrEditLinePlayer from "../modals/modal-add-or-edit-line-player";
import ModalRemoveGoalkeeperPlayer from "../modals/modal-remove-goalkeeper-player";
import ModalRemoveLinePlayer from "../modals/modal-remove-line-player";

interface PlayersListProps {
    players: LinePlayer[] | GoalkeeperPlayer[],
    default: "line" | "goalkeeper"
}

export default function PlayersList(props: PlayersListProps) {

    const [showModalAddLinePlayer, setShowModalAddLinePlayer] = useState(false);
    const [showModalAddGoalkeeperPlayer, setShowModalAddGoalkeeperPlayer] = useState(false);
    const [editableLinePlayer, setEditableLinePlayer] = useState<LinePlayer | undefined>(undefined);
    const [showModalRemoveLinePlayer, setShowModalRemoveLinePlayer] = useState(false);
    const [removableLinePlayer, setRemovableLinePlayer] = useState<LinePlayer | undefined>(undefined);

    const [editableGoalkeeperPlayer, setEditableGoalkeeperPlayer] = useState<GoalkeeperPlayer | undefined>(undefined);
    const [showModalRemoveGoalkeeperPlayer, setShowModalRemoveGoalkeeperPlayer] = useState(false);
    const [removableGoalkeeperPlayer, setRemovableGoalkeeperPlayer] = useState<GoalkeeperPlayer | undefined>(undefined);

    function handleAddLinePlayer() {
        setEditableLinePlayer(undefined);
        setShowModalAddLinePlayer(true);
    }

    function handleAddGoalkeeperPlayer() {
        setEditableGoalkeeperPlayer(undefined);
        setShowModalAddGoalkeeperPlayer(true);
    }

    function handleEditLinePlayer(linePlayer: LinePlayer) {
        setEditableLinePlayer(linePlayer);
        setShowModalAddLinePlayer(true);
    }

    function handleRemoveLinePlayer(linePlayer: LinePlayer) {
        setRemovableLinePlayer(linePlayer);
        setShowModalRemoveLinePlayer(true);
    }

    function handleEditGoalkeeperPlayer(goalkeeperPlayer: GoalkeeperPlayer) {
        setEditableGoalkeeperPlayer(goalkeeperPlayer);
        setShowModalAddGoalkeeperPlayer(true);
    }

    function handleRemoveGoalkeeperPlayer(goalkeeperPlayer: GoalkeeperPlayer) {
        setRemovableGoalkeeperPlayer(goalkeeperPlayer);
        setShowModalRemoveGoalkeeperPlayer(true);
    }

    if (isLinePlayerArray(props.players)) {
        return (
            <Container>
                <Row>
                    <Col>
                        <Table striped bordered hover>
                            <caption style={{ captionSide: "top", textAlign: "center" }}>
                                Line Players <Button variant="primary" size="sm" onClick={handleAddLinePlayer}><FontAwesomeIcon icon={faPlus} /></Button>
                            </caption>

                            <thead>
                                <tr>
                                    <th style={{ textAlign: "center" }}>Name</th>
                                    <th colSpan={2} style={{ textAlign: "center" }}>Actions</th>
                                </tr>

                            </thead>
                            <tbody>
                                {props.players.map((player, index) => (
                                    <tr key={player.id}>
                                        <td>
                                            <Accordion>
                                                <Accordion.Item eventKey={index.toString()}>
                                                    <Accordion.Header>{player.name}</Accordion.Header>
                                                    <Accordion.Body>
                                                        <Table>
                                                            <thead>
                                                                <tr>
                                                                    <th>Technical</th>
                                                                    <th>Mental</th>
                                                                    <th>Physical</th>
                                                                </tr>
                                                            </thead>
                                                            <tbody>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Corners </span><span style={{ textAlign: "end" }}>{player.corners}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Aggression </span><span style={{ textAlign: "end" }}>{player.aggression}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Acceleration </span><span style={{ textAlign: "end" }}>{player.acceleration}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Crossing </span><span style={{ textAlign: "end" }}>{player.crossing}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Anticipation </span><span style={{ textAlign: "end" }}>{player.anticipation}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Agility </span><span style={{ textAlign: "end" }}>{player.agility}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Dribbling </span><span style={{ textAlign: "end" }}>{player.dribbling}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Bravery </span><span style={{ textAlign: "end" }}>{player.bravery}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Balance </span><span style={{ textAlign: "end" }}>{player.balance}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Finishing </span><span style={{ textAlign: "end" }}>{player.finishing}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Composure </span><span style={{ textAlign: "end" }}>{player.composure}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Jumping Reach </span><span style={{ textAlign: "end" }}>{player.jumpingReach}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>First Touch </span><span style={{ textAlign: "end" }}>{player.firstTouch}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Concentration </span><span style={{ textAlign: "end" }}>{player.concentration}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Natural Fitness </span><span style={{ textAlign: "end" }}>{player.naturalFitness}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Free Kick Taking </span><span style={{ textAlign: "end" }}>{player.freeKickTaking}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Decisions </span><span style={{ textAlign: "end" }}>{player.decisions}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Pace </span><span style={{ textAlign: "end" }}>{player.pace}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Heading </span><span style={{ textAlign: "end" }}>{player.heading}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Determination </span><span style={{ textAlign: "end" }}>{player.determination}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Stamina </span><span style={{ textAlign: "end" }}>{player.stamina}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Long Shots </span><span style={{ textAlign: "end" }}>{player.longShots}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Flair </span><span style={{ textAlign: "end" }}>{player.flair}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Strength </span><span style={{ textAlign: "end" }}>{player.strength}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Long Throws </span><span style={{ textAlign: "end" }}>{player.longThrows}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Leadership </span><span style={{ textAlign: "end" }}>{player.leadership}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Marking </span><span style={{ textAlign: "end" }}>{player.marking}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Off The Ball </span><span style={{ textAlign: "end" }}>{player.offTheBall}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Passing </span><span style={{ textAlign: "end" }}>{player.passing}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Positioning </span><span style={{ textAlign: "end" }}>{player.positioning}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Penalty Taking </span><span style={{ textAlign: "end" }}>{player.penaltyTaking}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Teamwork </span><span style={{ textAlign: "end" }}>{player.teamwork}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Tackling </span><span style={{ textAlign: "end" }}>{player.tackling}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Vision </span><span style={{ textAlign: "end" }}>{player.vision}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Technique </span><span style={{ textAlign: "end" }}>{player.technique}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Work Rate </span><span style={{ textAlign: "end" }}>{player.workRate}</span></td>
                                                                </tr>
                                                            </tbody>
                                                        </Table>
                                                    </Accordion.Body>
                                                </Accordion.Item>
                                            </Accordion>
                                        </td>
                                        <td style={{ textAlign: "center", verticalAlign: "middle" }}>
                                            <Button variant="primary" size="sm" onClick={() => handleEditLinePlayer(player)}><FontAwesomeIcon icon={faPen} /></Button>
                                        </td>
                                        <td style={{ textAlign: "center", verticalAlign: "middle" }}>
                                            <Button variant="primary" size="sm" onClick={() => handleRemoveLinePlayer(player)}><FontAwesomeIcon icon={faTrash} /></Button>
                                        </td>
                                    </tr>
                                ))
                                }
                            </tbody>
                        </Table>
                    </Col>
                </Row>
                <ModalAddOrEditLinePlayer show={showModalAddLinePlayer} setShow={setShowModalAddLinePlayer} player={editableLinePlayer} />
                <ModalRemoveLinePlayer show={showModalRemoveLinePlayer} setShow={setShowModalRemoveLinePlayer} player={removableLinePlayer!} />
            </Container>
        )
    }

    if (isGoalkeeperPlayerArray(props.players)) {
        return (
            <Container>
                <Row>
                    <Col>
                        <Table striped bordered hover>
                            <caption style={{ captionSide: "top", textAlign: "center" }}>
                                Goalkeeper Players <Button variant="primary" size="sm" onClick={handleAddGoalkeeperPlayer}><FontAwesomeIcon icon={faPlus} /></Button>
                            </caption>

                            <thead>
                                <tr>
                                    <th style={{ textAlign: "center" }}>Name</th>
                                    <th colSpan={2} style={{ textAlign: "center" }}>Actions</th>
                                </tr>
                            </thead>
                            <tbody>
                                {props.players.map((player, index) => (
                                    <tr key={player.id}>
                                        <td>
                                            <Accordion>
                                                <Accordion.Item eventKey={index.toString()}>
                                                    <Accordion.Header>{player.name}</Accordion.Header>
                                                    <Accordion.Body>
                                                        <Table>
                                                            <thead>
                                                                <tr>
                                                                    <th>Goalkeeping</th>
                                                                    <th>Mental</th>
                                                                    <th>Physical</th>
                                                                    <th>Technical</th>
                                                                </tr>
                                                            </thead>
                                                            <tbody>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Aerial Reach </span><span style={{ textAlign: "end" }}>{player.aerialReach}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Aggression </span><span style={{ textAlign: "end" }}>{player.aggression}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Acceleration </span><span style={{ textAlign: "end" }}>{player.acceleration}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Free Kick Taking </span><span style={{ textAlign: "end" }}>{player.freeKickTaking}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Command Of Area </span><span style={{ textAlign: "end" }}>{player.commandOfArea}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Anticipation </span><span style={{ textAlign: "end" }}>{player.anticipation}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Agility </span><span style={{ textAlign: "end" }}>{player.agility}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Penalty Taking </span><span style={{ textAlign: "end" }}>{player.penaltyTaking}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Communication </span><span style={{ textAlign: "end" }}>{player.communication}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Bravery </span><span style={{ textAlign: "end" }}>{player.bravery}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Balance </span><span style={{ textAlign: "end" }}>{player.balance}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Technique </span><span style={{ textAlign: "end" }}>{player.technique}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Eccentricity </span><span style={{ textAlign: "end" }}>{player.eccentricity}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Composure </span><span style={{ textAlign: "end" }}>{player.composure}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Jumping Reach </span><span style={{ textAlign: "end" }}>{player.jumpingReach}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>First Touch </span><span style={{ textAlign: "end" }}>{player.firstTouch}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Concentration </span><span style={{ textAlign: "end" }}>{player.concentration}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Natural Fitness </span><span style={{ textAlign: "end" }}>{player.naturalFitness}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Handling </span><span style={{ textAlign: "end" }}>{player.handling}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Decisions </span><span style={{ textAlign: "end" }}>{player.decisions}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Pace </span><span style={{ textAlign: "end" }}>{player.pace}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Kicking </span><span style={{ textAlign: "end" }}>{player.kicking}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Determination </span><span style={{ textAlign: "end" }}>{player.determination}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Stamina </span><span style={{ textAlign: "end" }}>{player.stamina}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>One On Ones </span><span style={{ textAlign: "end" }}>{player.oneOnOnes}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Flair </span><span style={{ textAlign: "end" }}>{player.flair}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Strength </span><span style={{ textAlign: "end" }}>{player.strength}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Passing </span><span style={{ textAlign: "end" }}>{player.passing}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Leadership </span><span style={{ textAlign: "end" }}>{player.leadership}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Punching (Tendency) </span><span style={{ textAlign: "end" }}>{player.punching}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Off The Ball </span><span style={{ textAlign: "end" }}>{player.offTheBall}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Reflexes </span><span style={{ textAlign: "end" }}>{player.reflexes}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Positioning </span><span style={{ textAlign: "end" }}>{player.positioning}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Rushing Out (Tendency) </span><span style={{ textAlign: "end" }}>{player.rushingOut}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Teamwork </span><span style={{ textAlign: "end" }}>{player.teamwork}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td><span style={{ textAlign: "start" }}>Throwing </span><span style={{ textAlign: "end" }}>{player.throwing}</span></td>
                                                                    <td><span style={{ textAlign: "start" }}>Vision </span><span style={{ textAlign: "end" }}>{player.vision}</span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td></td>
                                                                    <td><span style={{ textAlign: "start" }}>Work Rate </span><span style={{ textAlign: "end" }}>{player.workRate}</span></td>
                                                                </tr>
                                                            </tbody>
                                                        </Table>
                                                    </Accordion.Body>
                                                </Accordion.Item>
                                            </Accordion>
                                        </td>
                                        <td style={{ textAlign: "center", verticalAlign: "middle" }}>
                                            <Button variant="primary" size="sm" onClick={() => handleEditGoalkeeperPlayer(player)}><FontAwesomeIcon icon={faPen} /></Button>
                                        </td>
                                        <td style={{ textAlign: "center", verticalAlign: "middle" }}>
                                            <Button variant="primary" size="sm" onClick={() => handleRemoveGoalkeeperPlayer(player)}><FontAwesomeIcon icon={faTrash} /></Button>
                                        </td>
                                    </tr>
                                ))}
                            </tbody>
                        </Table>
                    </Col>
                </Row>
                <ModalAddOrEditGoalkeeperPlayer show={showModalAddGoalkeeperPlayer} setShow={setShowModalAddGoalkeeperPlayer} player={editableGoalkeeperPlayer} />
                <ModalRemoveGoalkeeperPlayer show={showModalRemoveGoalkeeperPlayer} setShow={setShowModalRemoveGoalkeeperPlayer} player={removableGoalkeeperPlayer!} />
            </Container>
        )
    }

    if (props.default === "line") {
        return (
            <Container>
                <Row>
                    <Col>
                        <Table striped bordered hover>
                            <caption style={{ captionSide: "top", textAlign: "center" }}>
                                Line Players <Button variant="primary" size="sm" onClick={handleAddLinePlayer}><FontAwesomeIcon icon={faPlus} /></Button>
                            </caption>

                            <thead>
                                <tr>
                                    <th style={{ textAlign: "center" }}>Name</th>
                                    <th colSpan={2} style={{ textAlign: "center" }}>Actions</th>
                                </tr>

                            </thead>
                        </Table>
                    </Col>
                </Row>
                <ModalAddOrEditLinePlayer show={showModalAddLinePlayer} setShow={setShowModalAddLinePlayer} player={editableLinePlayer} />
            </Container>
        )
    }

    if (props.default === "goalkeeper") {
        return (
            <Container>
                <Row>
                    <Col>
                        <Table striped bordered hover>
                            <caption style={{ captionSide: "top", textAlign: "center" }}>
                                Goalkeeper Players <Button variant="primary" size="sm" onClick={handleAddGoalkeeperPlayer}><FontAwesomeIcon icon={faPlus} /></Button>
                            </caption>

                            <thead>
                                <tr>
                                    <th style={{ textAlign: "center" }}>Name</th>
                                    <th colSpan={2} style={{ textAlign: "center" }}>Actions</th>
                                </tr>

                            </thead>
                        </Table>
                    </Col>
                </Row>
                <ModalAddOrEditGoalkeeperPlayer show={showModalAddGoalkeeperPlayer} setShow={setShowModalAddGoalkeeperPlayer} player={editableGoalkeeperPlayer} />
            </Container>
        )
    }

    return (
        <p>Invalid players</p>
    )
}