# Jangman-Project

This repository contains the **Jangman Project**, a class project where the classic Hangman game is implemented using **Java** and **Sockets**. Developed by **Eduardo Torres Álamo**, **Ricardo Almodóvar Rodríguez**, and **Angel Velez Morales**, this project showcases proficiency in network programming and object-oriented design.

---

## Table of Contents

- [About](#about)
- [Technologies Used](#technologies-used)
- [Features](#features)
- [How to Run](#how-to-run)
- [Project Structure](#project-structure)
- [Contributing](#contributing)

---

## About

The **Jangman Project** is a multiplayer Hangman game designed as a class project, completed on **12/10/2020**. The game uses **Hamachi** for VPN-based connectivity and is built using **Java Sockets** for communication between a client and server.

- **Server Side**:
  - Handles the logic for choosing the word.
  - Processes input and output exchanged through sockets via the VPN.

- **Client Side**:
  - Captures user input.
  - Displays the Hangman interface for user interaction.

---

## Technologies Used

### Programming Language
- **Java**: Used for both client and server implementations.

### Networking
- **Java Sockets**: Facilitates communication between the client and server.
- **Hamachi**: Enables VPN-based connectivity for the application.

---

## Features

- **Multiplayer Capability**: Server manages connections to multiple clients.
- **Server Logic**: Handles word selection and game logic.
- **Client Interaction**: Provides a user-friendly interface for input and displays.
- **VPN Integration**: Utilizes Hamachi for secure and reliable connections.

---

## How to Run

To run this project locally:

1. **Set up Hamachi**:
   - Download and install Hamachi.
   - Create or join a VPN network for client-server communication.

2. **Run the Server**:
   - Compile and execute the server code:
     ```bash
     javac Server.java
     java Server
     ```

3. **Run the Client**:
   - Compile and execute the client code:
     ```bash
     javac Client.java
     java Client
     ```

4. **Connect to the Server**:
   - Ensure both client and server are connected through the Hamachi network.

---

## Project Structure

```
Jangman-Project/
|
├── src/                # Java source files for client and server
├── docs/               # Documentation and resources
├── README.md           # This file
└── LICENSE             # License information (if applicable)
```

---

## Contributing

Contributions are welcome! If you'd like to contribute:

1. Fork the repository.
2. Create a new feature branch:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add feature description"
   ```
4. Push to your forked repository:
   ```bash
   git push origin feature-name
   ```
5. Open a Pull Request.

---

## Authors

- **Eduardo Torres Álamo**
- **Ricardo Almodóvar Rodríguez**
- **Angel Velez Morales**

---

## Acknowledgments

This project was developed as part of a class assignment to demonstrate proficiency in Java and socket programming. Special thanks to our instructor for guiding us through the learning process.

