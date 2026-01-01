# DungeonMasters — Java Expense Calculator

DungeonMasters is a Java-based expense calculator and personal finance helper that lets you record expenses, categorize spending, set budgets, and generate simple reports. This repository contains the code and resources for the project.

## Features

- Add, edit, and remove expense entries
- Categorize expenses (e.g., Food, Transport, Rent, Entertainment)
- Track budgets and warn when a category exceeds budget
- Generate monthly/weekly summary reports
- CSV import/export for easy data interchange

## Getting started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java 11 or later
- Git
- Optional: Maven or Gradle (if the project uses a build tool)

### Build (examples)

If the project uses Maven:

```bash
# from repository root
mvn clean package
# run the generated JAR (replace artifact-name.jar with actual file)
java -jar target/artifact-name.jar
```

If the project uses Gradle:

```bash
# with Gradle wrapper
./gradlew build
java -jar build/libs/artifact-name.jar
```

If there is no build tool, compile and run directly:

```bash
# compile all main sources in src/ and place class files in out/
javac -d out $(find src -name "*.java")
# run main class (replace com.example.Main with your project's main class)
java -cp out com.example.Main
```

## Usage

- Launch the application and follow CLI or GUI prompts (depending on implementation).
- Use the import/export functions to move data between instances.
- Create budgets per category and check reports to monitor spending.

## Project structure (suggested)

- src/ - Java source code
- data/ - sample data or database files
- docs/ - design and user docs
- build/ - build artifacts

Adjust these to match the repository's actual layout.

## Contributing

Contributions are welcome. Please open issues for bugs or feature requests and create pull requests for proposed changes. Include tests and documentation for significant changes.

## License

This project does not yet include a license. If you want to make it open source, consider adding a license such as MIT, Apache-2.0, or GPL-3.0. Add a LICENSE file to the repository.

## Contact

 Developer: Ashtu11

 Documenter: lyrck3r
