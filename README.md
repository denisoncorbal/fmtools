# FMTools

![GitHub repo size](https://img.shields.io/github/repo-size/denisoncorbal/leetcode-solutions?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/denisoncorbal/leetcode-solutions?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/denisoncorbal/leetcode-solutions?style=for-the-badge)
![Github open issues](https://img.shields.io/github/issues/denisoncorbal/leetcode-solutions?style=for-the-badge)
![GitHub pull requests](https://img.shields.io/github/issues-pr-raw/denisoncorbal/leetcode-solutions?style=for-the-badge)
![Github repo stars](https://img.shields.io/github/stars/denisoncorbal/leetcode-solutions?style=for-the-badge)

## About

> Web App with tools to help Football Manager gameplay

### Built With

* [![Next.js](https://img.shields.io/badge/Next.js-black?logo=next.js&logoColor=white)](#)
* [![React](https://img.shields.io/badge/React-%2320232a.svg?logo=react&logoColor=%2361DAFB)](#)
* [![TypeScript](https://img.shields.io/badge/TypeScript-3178C6?logo=typescript&logoColor=fff)](#)
* [![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?logo=springboot&logoColor=fff)](#)
* [![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?logo=openjdk&logoColor=white)](#)
* [![Postgres](https://img.shields.io/badge/Postgres-%23316192.svg?logo=postgresql&logoColor=white)](#)
* [![Docker](https://img.shields.io/badge/Docker-2496ED?logo=docker&logoColor=fff)](#)

### Updates and Adjustments

The project is still under development and next updates will focus on:

- [ ] Update information like teams, squads, etc
- [ ] Delete information like teams, squads, etc
- [ ] Display logged user info
- [ ] Increment informations to be managed

## 💻 Prerequisites

- Docker and Docker Compose installed

## Accessing FMTools online

A demonstrative version, full functional, is hosted online [here](https://fmtools.denison.corbal.nom.br)

## 🚀 Running FMTools locally

Clone the repository, access the main folder and run
```
docker compose up -d --build
```

Docker will pull the database image and build the frontend and backend images, then will run all of them.

After that you will be able to access the project on http://localhost:3000.

## ☕ Using FMTools

As it happens on the game you can manage Teams, Squads, Tactics, Tactical Styles, Formations and Players.

<img src="team_page.png" alt="Page to manage Teams">

You can add players by the .html or .rtf generated on the game.

<img src="player_page.png" alt="Page to manage Players">

On formation screen you can access the functionality to calculate best formation. You just need to have one squad with at least 11 players and then choose to calculate.

<img src="calculate_position.png" alt="Formation page with calculate positions function">

After that system will display the formation with the names calculated for each position. (In order to calculate the result the system will consider ONLY the player stats and the key and preferable stats for each position on formation).

<img src="calculate_position_result.png" alt="Result of best formation calculation">

## 📝 License

This project is under [license](LICENSE.md).