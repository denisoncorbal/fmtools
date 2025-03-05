'use client'

import { removeLinePlayer } from "@/app/lib/actions";
import { LinePlayer } from "@/app/lib/definitions";
import { Dispatch, SetStateAction } from "react";
import { Button, Col, Form, Modal, Row } from "react-bootstrap";

interface ModalAddLinePlayerProps {
    show: boolean,
    setShow: Dispatch<SetStateAction<boolean>>,
    player: LinePlayer | undefined
}

export default function ModalRemoveLinePlayer(props: ModalAddLinePlayerProps) {

    return (
        props.player &&
        <Modal
            show={props.show}
        >
            <Modal.Header>
                <Modal.Title>
                    Remove Line Player
                </Modal.Title>
            </Modal.Header>
            <Form action={removeLinePlayer}>
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
                    <Button type="submit" onClick={() => props.setShow(false)}>Remove</Button>
                    <Button onClick={() => props.setShow(false)}>Close</Button>
                </Modal.Footer>
            </Form>
        </Modal>
    )
}