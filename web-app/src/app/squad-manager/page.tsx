import { Suspense } from "react";
import { Col, Container, Row } from "react-bootstrap";
import GoalkeeperPlayersList from "./components/goalkeeper-players-list";
import LinePlayersList from "./components/line-players-list";

export const dynamic = "force-dynamic";

export default async function Page() {

    return (
        <Container>
            <Row>
                <Col>
                    <Suspense fallback={<></>}>
                        <LinePlayersList />
                    </Suspense>
                </Col>
                <Col>
                    <Suspense fallback={<></>}>
                        <GoalkeeperPlayersList />
                    </Suspense>
                </Col>
            </Row>
        </Container>
    )
}