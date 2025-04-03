import { faFutbol } from "@fortawesome/free-solid-svg-icons";
import { faClipboard } from "@fortawesome/free-solid-svg-icons/faClipboard";
import { faLocationDot } from "@fortawesome/free-solid-svg-icons/faLocationDot";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import Link from "next/link";
import { Card, CardBody, Col, Container, Row } from "react-bootstrap";

export default function Home() {

  // Usar esse código se algo no bootstrap não funcionar
  // useEffect(() => {
  //   require("bootstrap/dist/js/bootstrap.bundle.min.js");
  // }, []);

  return (
    <Container style={{ width: "100vw", height: "94vh" }}>

      <header className="py-4">
        <Container className="px-lg-4 p-3 p-lg-4 bg-light rounded-3 text-center m-3 m-lg-4">
          <h1 className="display-5 fw-bold">FMTools</h1>
          <p className="fs-4">Tools to help with Football Manager game</p>
        </Container>
      </header>
      <section className="pt-3">
        <Container className="px-lg-4">
          <Row className="gx-lg-4">
            <Col lg={4} xxl={3} className="mb-3">
              <Link href={"/squad-manager"} style={{ textDecoration: "none" }}>
                <Card bg="light" border="0" className="h-100">
                  <CardBody className="text-center p-3 p-lg-4 pt-0 pt-lg-0">
                    <div className="feature bg-primary bg-gradient text-white rounded-3 mb-3 mt-n3">
                      <FontAwesomeIcon size="3x" icon={faClipboard} className="bi bi-collection" />
                    </div>
                    <h2 className="fs-4 fw-bold">Squad Manager</h2>
                    <p className="mb-0">Add, edit or remove players from your squad</p>
                  </CardBody>
                </Card>
              </Link>
            </Col>
            <Col lg={4} xxl={3} className="mb-4">
              <Link href={"/positions-calculator"} style={{ textDecoration: "none" }}>
                <Card bg="light" border="0" className="h-100">
                  <CardBody className="text-center p-3 p-lg-4 pt-0 pt-lg-0">
                    <div className="feature bg-primary bg-gradient text-white rounded-3 mb-3 mt-n3">
                      <FontAwesomeIcon size="3x" icon={faLocationDot} className="bi bi-collection" />
                    </div>
                    <h2 className="fs-4 fw-bold">Positions Calculator</h2>
                    <p className="mb-0">Calculate your players{"\'"} adaptation percentage in each position on the field</p>
                  </CardBody>
                </Card>
              </Link>
            </Col>
            <Col lg={4} xxl={3} className="mb-4">
              <Link href={"/formations-calculator"} style={{ textDecoration: "none" }}>
                <Card bg="light" border="0" className="h-100">
                  <CardBody className="text-center p-3 p-lg-4 pt-0 pt-lg-0">
                    <div className="feature bg-primary bg-gradient text-white rounded-3 mb-3 mt-n3">
                      <FontAwesomeIcon size="3x" icon={faFutbol} className="bi bi-collection" />
                    </div>
                    <h2 className="fs-4 fw-bold">Formations Calculator</h2>
                    <p className="mb-0">Calculate the best formations for your squad</p>
                  </CardBody>
                </Card>
              </Link>
            </Col>
          </Row>
        </Container>
      </section>
    </Container>
  );
}
