# PortaOne Puzzle Solver

## Description
This project implements a solution to the **single-line digital puzzle** problem. The goal is to construct the longest sequence from given numeric fragments, where elements connect based on their first or last two digits. The program reads input from a text file, processes the fragments, and outputs the longest possible sequence.

## Technologies Used
- **Java 17**: Core programming language for the solution.
- **JUnit 5**: Used for testing the sequence-building logic.
- **Maven**: Manages project dependencies and builds.
- **Docker**: Ensures easy deployment and execution of the program.

## Project Structure
```plaintext
portaone-bad-2025/
├── src/main/java/
│   ├── ua/com/alicecompany/
│   │   ├── PuzzleSolver.java         # Main entry point
│   │   ├── NumberChainBuilder.java   # Logic for sequence construction
│   │   ├── FileReaderUtil.java       # Reads numeric fragments from a file
│   ├── Dockerfile                    # Docker container configuration
├── src/test/java/
│   ├── ua/com/alicecompany/
│   │   ├── NumberChainBuilderTest.java # Unit tests
├── PortaOne.txt                      # Sample test file with numeric fragments
├── pom.xml                            # Maven project configuration
```

## How to Run with Docker
To ensure anyone can use this program without additional setup, follow these steps:

1. **Build the Docker image**
```sh
docker build -t portaone-bad-2025 .
```

2. **Run the program in a container**
```sh
docker run --rm -v "$(pwd)/PortaOne.txt:/app/PortaOne.txt" portaone-bad-2025
```

This command mounts the local `PortaOne.txt` file into the container, ensuring that different input datasets can be used easily.

## Acknowledgment
This solution was developed with the assistance of **ChatGPT**, ensuring no proprietary or illegally obtained software was used.
