# Certification Authority (CA)
This folder represents an emulation of a Certification Authority providing self signed certs used on project to simulate a real HTTPS environment.

It's based on this [tutorial](https://openssl-ca.readthedocs.io/en/latest/).

## Codes to server cert generation
Server Key Generation
```shell
openssl genrsa -out PATH-TO-PLACE-KEY/KEY-NAME.pem 2048
```

Server CSR Generation
```shell
openssl req -config INTERMEDIATE-CONFIGURATION-FILE -key KEY-GENERATED-BEFORE -new -sha256 -out PATH-TO-PLACE-CSR/CSR-NAME.pem -addext "subjectAltName = DNS:DNS-ALT-NAME,DNS:DNS-ALT-NAME-2"
```

Server Cert Generation
```shell
openssl ca -config INTERMEDIATE-CONFIGURATION-FILE -extensions server_cert -days 375 -notext -md sha256 -in CSR-GENERATED-BEFORE -out PATH-TO-CERT/CERT-NAME.pem
```

### Codes to client cert generation
Client Key Generation
```shell
openssl genrsa -out PATH-TO-PLACE-KEY/KEY-NAME.pem 2048
```

Client CSR Generation
```shell
openssl req -config INTERMEDIATE-CONFIGURATION-FILE -key KEY-GENERATED-BEFORE -new -sha256 -out PATH-TO-PLACE-CSR/CSR-NAME.pem -addext "subjectAltName = DNS:DNS-ALT-NAME,DNS:DNS-ALT-NAME-2"
```

Client Cert Generation
```shell
openssl ca -config INTERMEDIATE-CONFIGURATION-FILE -extensions usr_cert -days 375 -notext -md sha256 -in CSR-GENERATED-BEFORE -out PATH-TO-CERT/CERT-NAME.pem
```

Client PKCS12 Generation
```shell
openssl pkcs12 -export -in CERT-GENERATED-BEFORE -inkey KEY-GENERATED-BEFORE -out PATH-TO-PLACE-PKCS12/PKCS12-NAME.p12 -name user -CAfile CA-CERT -caname CN-NAME -passout pass:PASSWORD
```