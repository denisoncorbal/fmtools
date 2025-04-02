import Link from "next/link";
import { Col, Container, Row } from "react-bootstrap";

export default function Home() {

  // Usar esse código se algo no bootstrap não funcionar
  // useEffect(() => {
  //   require("bootstrap/dist/js/bootstrap.bundle.min.js");
  // }, []);

  return (
    <Container style={{ width: "100vw", height: "100vh" }}>
      <Row style={{ width: "100%", height: "20%", paddingTop: "8px" }}>
        <h1>FMTools</h1>
        <p>Tools to help with Football Manager game</p>
      </Row>
      <Row style={{ width: "100%", height: "80%", alignContent: "center" }}>
        <Col>
          <Link href={"/squad-manager"}>Squad Manager</Link>
        </Col>
        <Col>
          <Link href={"/positions-calculator"}>Positions Calculator</Link>
        </Col>
        <Col>
          <Link href={"/formations-calculator"}>Formation Calculator</Link>
        </Col>
      </Row>
    </Container>
  );
}
