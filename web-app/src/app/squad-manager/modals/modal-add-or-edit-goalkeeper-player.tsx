'use client'

import { createGoalkeeperPlayer, editGoalkeeperPlayer } from "@/app/lib/actions";
import { GoalkeeperPlayer } from "@/app/lib/definitions";
import { Dispatch, SetStateAction, useActionState } from "react";
import { Button, Col, Form, Modal, Row, Spinner } from "react-bootstrap";

interface ModalAddOrEditGoalkeeperPlayerProps {
    show: boolean,
    setShow: Dispatch<SetStateAction<boolean>>,
    player?: GoalkeeperPlayer
}

export default function ModalAddOrEditGoalkeeperPlayer(props: ModalAddOrEditGoalkeeperPlayerProps) {

    const [createResult, createFormAction, createIsPending] = useActionState(createGoalkeeperPlayer, null);
    const [editResult, editFormAction, editIsPending] = useActionState(editGoalkeeperPlayer, null);

    // TODO (use Results)
    console.log(createResult);
    console.log(editResult);

    return (
        <Modal
            show={props.show}
        >
            <Modal.Header>
                <Modal.Title>
                    {props.player ? "Edit" : "Add"} Goalkeeper Player
                </Modal.Title>
            </Modal.Header>
            <Form action={props.player ? editFormAction : createFormAction}>
                <Modal.Body>
                    <Row>
                        {props.player &&
                            <Col>
                                <Form.Group>
                                    <Form.Label>Id</Form.Label>
                                    <Form.Control value={props.player.id} type="text" name="id" readOnly></Form.Control>
                                </Form.Group>
                            </Col>
                        }
                    </Row>
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
                                <Form.Label>Aerial Reach</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.aerialReach : undefined} name="aerialReach" type="number" min={1} max={20}></Form.Control>
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
                        <Col>
                            <Form.Group>
                                <Form.Label>Free Kick Taking</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.freeKickTaking : undefined} name="freeKickTaking" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                    </Row>
                    <Row>
                        <Col>
                            <Form.Group>
                                <Form.Label>Command Of Area</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.commandOfArea : undefined} name="commandOfArea" type="number" min={1} max={20}></Form.Control>
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
                        <Col>
                            <Form.Group>
                                <Form.Label>Penalty Taking</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.penaltyTaking : undefined} name="penaltyTaking" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                    </Row>
                    <Row>
                        <Col>
                            <Form.Group>
                                <Form.Label>Communication</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.communication : undefined} name="communication" type="number" min={1} max={20}></Form.Control>
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
                        <Col>
                            <Form.Group>
                                <Form.Label>Technique</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.technique : undefined} name="technique" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                    </Row>
                    <Row>
                        <Col>
                            <Form.Group>
                                <Form.Label>Eccentricity</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.eccentricity : undefined} name="eccentricity" type="number" min={1} max={20}></Form.Control>
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
                                <Form.Label>Handling</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.handling : undefined} name="handling" type="number" min={1} max={20}></Form.Control>
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
                                <Form.Label>Kicking</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.kicking : undefined} name="kicking" type="number" min={1} max={20}></Form.Control>
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
                                <Form.Label>One On Ones</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.oneOnOnes : undefined} name="oneOnOnes" type="number" min={1} max={20}></Form.Control>
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
                                <Form.Label>Passing</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.passing : undefined} name="passing" type="number" min={1} max={20}></Form.Control>
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
                                <Form.Label>Punching</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.punching : undefined} name="punching" type="number" min={1} max={20}></Form.Control>
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
                                <Form.Label>Reflexes</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.reflexes : undefined} name="reflexes" type="number" min={1} max={20}></Form.Control>
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
                                <Form.Label>Rushing Out</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.rushingOut : undefined} name="rushingOut" type="number" min={1} max={20}></Form.Control>
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
                                <Form.Label>Throwing</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.throwing : undefined} name="throwing" type="number" min={1} max={20}></Form.Control>
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
                                <Form.Label>Work Rate</Form.Label>
                                <Form.Control defaultValue={props.player ? props.player.workRate : undefined} name="workRate" type="number" min={1} max={20}></Form.Control>
                            </Form.Group>
                        </Col>
                    </Row>

                </Modal.Body>
                <Modal.Footer>
                    <Button type="submit" disabled={(createIsPending || editIsPending)}>
                        {(createIsPending || editIsPending) ? <Spinner
                            as="span"
                            animation="border"
                            size="sm"
                            role="status"
                            aria-hidden={true}
                        /> : null}
                        {props.player ? "Save" : "Add"}</Button>
                    <Button onClick={() => props.setShow(false)} disabled={(createIsPending || editIsPending)}>Close</Button>
                </Modal.Footer>
            </Form>
        </Modal>
    )
}