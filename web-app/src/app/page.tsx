import { Button, Col, Container, Row } from "react-bootstrap";

export default function Home() {

  // Usar esse código se algo no bootstrap não funcionar
  // useEffect(() => {
  //   require("bootstrap/dist/js/bootstrap.bundle.min.js");
  // }, []);

  return (
    <Container>
      <Row>
        <Col>
          Input your code here
          <Button>Teste</Button>
        </Col>
      </Row>
    </Container>
  );
}
