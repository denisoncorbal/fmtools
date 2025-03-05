import Link from "next/link";
import { Col, Container, Row } from "react-bootstrap";

export default function Home() {

  // Usar esse código se algo no bootstrap não funcionar
  // useEffect(() => {
  //   require("bootstrap/dist/js/bootstrap.bundle.min.js");
  // }, []);

  return (
    <Container>
      <Row>
        <Col>
          <Link href={"/squad-manager"}>Squad Manager</Link>
        </Col>
        <Col>
          <Link href={"#"}>Position Calculator</Link>
        </Col>
        <Col>
          <Link href={"#"}>Formation Calculator</Link>
        </Col>
      </Row>
    </Container>
  );
}
