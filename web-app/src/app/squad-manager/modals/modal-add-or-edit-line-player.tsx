'use client'

import { createLinePlayer, editLinePlayer } from "@/app/lib/actions";
import { LinePlayer } from "@/app/lib/definitions";
import { Dispatch, SetStateAction } from "react";
import { Button, Col, Form, Modal, Row } from "react-bootstrap";

interface ModalAddOrEditLinePlayerProps {
    show: boolean,
    setShow: Dispatch<SetStateAction<boolean>>,
    player?: LinePlayer
}

export default function ModalAddOrEditLinePlayer(props: ModalAddOrEditLinePlayerProps) {

    return (
        <Modal
            show={props.show}
        >
            <Modal.Header>
                <Modal.Title>
                    {props.player ? "Edit" : "Add"} Line Player
                </Modal.Title>
            </Modal.Header>
            <Form action={props.player ? editLinePlayer : createLinePlayer}>
                <Modal.Body>
                    {props.player &&
                        <Row>
                            <Col>
                                <Form.Group>
                                    <Form.Label>Id</Form.Label>
                                    <Form.Control value={props.player.id} type="text" name="id" readOnly></Form.Control>
                                </Form.Group>
                            </Col>
                        </Row>
                    }
                    <Row>
                        <Col>
                            <Form.Group>
                                <Form.Label>Name</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.name : undefined} type="text" name="name"></Form.Control>
                            </Form.Group>
                        </Col>
                    </Row>
                    <Row>
                        <Col>
                            <Form.Group>
                                <Form.Label>Corners</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.corners : undefined} name="corners" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col>
                            <Form.Group>
                                <Form.Label>Aggression</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.aggression : undefined} name="aggression" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col>
                            <Form.Group>
                                <Form.Label>Acceleration</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.acceleration : undefined} name="acceleration" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                    </Row>
                    <Row>
                        <Col>
                            <Form.Group>
                                <Form.Label>Crossing</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.crossing : undefined} name="crossing" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col>
                            <Form.Group>
                                <Form.Label>Anticipation</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.anticipation : undefined} name="anticipation" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col>
                            <Form.Group>
                                <Form.Label>Agility</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.agility : undefined} name="agility" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                    </Row>
                    <Row>
                        <Col>
                            <Form.Group>
                                <Form.Label>Dribbling</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.dribbling : undefined} name="dribbling" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col>
                            <Form.Group>
                                <Form.Label>Bravery</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.bravery : undefined} name="bravery" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col>
                            <Form.Group>
                                <Form.Label>Balance</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.balance : undefined} name="balance" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                    </Row>
                    <Row>
                        <Col>
                            <Form.Group>
                                <Form.Label>Finishing</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.finishing : undefined} name="finishing" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col>
                            <Form.Group>
                                <Form.Label>Composure</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.composure : undefined} name="composure" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col>
                            <Form.Group>
                                <Form.Label>Jumping Reach</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.jumpingReach : undefined} name="jumpingReach" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                    </Row>
                    <Row>
                        <Col>
                            <Form.Group>
                                <Form.Label>First Touch</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.firstTouch : undefined} name="firstTouch" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col>
                            <Form.Group>
                                <Form.Label>Concentration</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.concentration : undefined} name="concentration" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col>
                            <Form.Group>
                                <Form.Label>Natural Fitness</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.naturalFitness : undefined} name="naturalFitness" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                    </Row>
                    <Row>
                        <Col>
                            <Form.Group>
                                <Form.Label>Free Kick Taking</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.freeKickTaking : undefined} name="freeKickTaking" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col>
                            <Form.Group>
                                <Form.Label>Decisions</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.decisions : undefined} name="decisions" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col>
                            <Form.Group>
                                <Form.Label>Pace</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.pace : undefined} name="pace" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                    </Row>
                    <Row>
                        <Col>
                            <Form.Group>
                                <Form.Label>Heading</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.heading : undefined} name="heading" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col>
                            <Form.Group>
                                <Form.Label>Determination</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.determination : undefined} name="determination" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col>
                            <Form.Group>
                                <Form.Label>Stamina</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.stamina : undefined} name="stamina" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                    </Row>
                    <Row>
                        <Col>
                            <Form.Group>
                                <Form.Label>Long Shots</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.longShots : undefined} name="longShots" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col>
                            <Form.Group>
                                <Form.Label>Flair</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.flair : undefined} name="flair" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col>
                            <Form.Group>
                                <Form.Label>Strength</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.strength : undefined} name="strength" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                    </Row>
                    <Row>
                        <Col>
                            <Form.Group>
                                <Form.Label>Long Throws</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.longThrows : undefined} name="longThrows" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col>
                            <Form.Group>
                                <Form.Label>Leadership</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.leadership : undefined} name="leadership" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                    </Row>
                    <Row>
                        <Col>
                            <Form.Group>
                                <Form.Label>Marking</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.marking : undefined} name="marking" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col>
                            <Form.Group>
                                <Form.Label>Off The Ball</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.offTheBall : undefined} name="offTheBall" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                    </Row>
                    <Row>
                        <Col>
                            <Form.Group>
                                <Form.Label>Passing</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.passing : undefined} name="passing" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col>
                            <Form.Group>
                                <Form.Label>Positioning</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.positioning : undefined} name="positioning" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                    </Row>
                    <Row>
                        <Col>
                            <Form.Group>
                                <Form.Label>Penalty Taking</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.penaltyTaking : undefined} name="penaltyTaking" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col>
                            <Form.Group>
                                <Form.Label>Teamwork</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.teamwork : undefined} name="teamwork" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                    </Row>
                    <Row>
                        <Col>
                            <Form.Group>
                                <Form.Label>Tackling</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.tackling : undefined} name="tackling" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col>
                            <Form.Group>
                                <Form.Label>Vision</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.vision : undefined} name="vision" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                    </Row>
                    <Row>
                        <Col>
                            <Form.Group>
                                <Form.Label>Technique</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.technique : undefined} name="technique" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col>
                            <Form.Group>
                                <Form.Label>Work Rate</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.workRate : undefined} name="workRate" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                    </Row>

                </Modal.Body>
                <Modal.Footer>
                    <Button type="submit">{props.player ? "Save" : "Add"}</Button>
                    <Button onClick={() => props.setShow(false)}>Close</Button>
                </Modal.Footer>
            </Form>
        </Modal>
    )
}