'use client'
import { faArrowLeft } from "@fortawesome/free-solid-svg-icons/faArrowLeft";
import { faArrowRight } from "@fortawesome/free-solid-svg-icons/faArrowRight";
import { faHome } from "@fortawesome/free-solid-svg-icons/faHome";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { useRouter } from "next/navigation";
import Container from "react-bootstrap/esm/Container";
import Nav from "react-bootstrap/esm/Nav";
import Navbar from "react-bootstrap/esm/Navbar";
import NavbarBrand from "react-bootstrap/esm/NavbarBrand";
import NavbarCollapse from "react-bootstrap/esm/NavbarCollapse";
import NavbarToggle from "react-bootstrap/esm/NavbarToggle";
import NavItem from "react-bootstrap/esm/NavItem";
import NavLink from "react-bootstrap/esm/NavLink";

export default function GeneralNavbar() {
    const router = useRouter();
    return (
        <Navbar expand="lg" bg="dark" data-bs-theme="dark" style={{ height: "6vh" }}>
            <Container className="px-lg-5">
                <NavbarBrand href="/">
                    FMTools
                </NavbarBrand>
                <NavbarToggle type="button" data-bs-toogle="collapse" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span className="navbar-toggler-icon"></span>
                </NavbarToggle>
                <NavbarCollapse id="navbarSupportedContent">
                    <Nav className="ms-auto mb-2 mb-lg-0">
                        <NavItem>
                            <NavLink type="button" active aria-current="page" onClick={() => router.back()}><FontAwesomeIcon icon={faArrowLeft} /></NavLink>
                        </NavItem>
                        <NavItem>
                            <NavLink active aria-current="page" href="/"><FontAwesomeIcon icon={faHome} /></NavLink>
                        </NavItem>
                        <NavItem>
                            <NavLink type="button" active aria-current="page" onClick={() => router.forward()}><FontAwesomeIcon icon={faArrowRight} /></NavLink>
                        </NavItem>
                    </Nav>
                </NavbarCollapse>
            </Container>
        </Navbar>
    )
}