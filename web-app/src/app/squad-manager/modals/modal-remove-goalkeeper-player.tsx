'use client'

import { removeGoalkeeperPlayer } from "@/app/lib/actions";
import { GoalkeeperPlayer } from "@/app/lib/definitions";
import { Dispatch, SetStateAction, useActionState } from "react";
import { Button, Col, Form, Modal, Row, Spinner } from "react-bootstrap";

interface ModalAddLinePlayerProps {
    show: boolean,
    setShow: Dispatch<SetStateAction<boolean>>,
    player: GoalkeeperPlayer | undefined
}

export default function ModalRemoveLinePlayer(props: ModalAddLinePlayerProps) {

    const [removeResult, removeFormAction, removeIsPending] = useActionState(removeGoalkeeperPlayer, null);

    // TODO (use result)
    console.log(removeResult);

    return (
        props.player &&
        <Modal
            show={props.show}
        >
            <Modal.Header>
                <Modal.Title>
                    Remove Goalkeeper Player
                </Modal.Title>
            </Modal.Header>
            <Form action={removeFormAction}>
                <Modal.Body>
                    <Row>
                        <Col>
                            <p>Are you sure that you want to remove the {props.player.name} player?</p>
                            <p>This action is irreversible!</p>
                            <Form.Group hidden>
                                <Form.Label>Id</Form.Label>
                                <Form.Control value={props.player.id} type="text" name="id" hidden readOnly></Form.Control>
                            </Form.Group>
                        </Col>
                    </Row>
                </Modal.Body>
                <Modal.Footer>
                    <Button type="submit" onClick={() => props.setShow(false)} disabled={removeIsPending}>
                        {removeIsPending ? <Spinner
                            as="span"
                            animation="border"
                            size="sm"
                            role="status"
                            aria-hidden={true}
                        /> : null}
                        Remove</Button>
                    <Button onClick={() => props.setShow(false)} disabled={removeIsPending}>Close</Button>
                </Modal.Footer>
            </Form>
        </Modal>
    )
}