# Scientific Calculator

A comprehensive command-line scientific calculator built in Java that provides basic arithmetic operations along with advanced mathematical functions.

## Features

### Basic Operations
- **Addition** (+) - Add two numbers
- **Subtraction** (-) - Subtract two numbers  
- **Multiplication** (*) - Multiply two numbers
- **Division** (/) - Divide two numbers with zero-division protection

### Scientific Functions
- **Square Root** (√x) - Calculate square root of non-negative numbers
- **Factorial** (x!) - Compute factorial of non-negative integers (0-20)
- **Natural Logarithm** (ln(x)) - Calculate natural logarithm of positive numbers
- **Power** (x^b) - Raise a number to any power

## Requirements

- Java 17 or higher
- Maven 3.6 or higher

## Installation

1. Clone the repository:
```bash
git clone https://github.com/your-username/SPE-Mini-Project.git
cd SPE-Mini-Project
```

2. Build the project:
```bash
mvn clean compile
```

3. Package the application:
```bash
mvn package
```

## Usage

### Run the Application

**From IDE:**
- Run the `Main.java` class directly

**From Command Line:**
```bash
# Using Maven
mvn exec:java -Dexec.mainClass="org.example.Main"

# Or run the packaged JAR
java -jar target/SPEMiniProject-1.0-SNAPSHOT.jar
```

### Interactive Menu

Once started, the calculator displays an interactive menu:

```
=== Scientific Calculator ===
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
5. Square Root (√x)
6. Factorial (x!)
7. Natural Logarithm (ln(x))
8. Power (x^b)
9. Exit
Enter your choice (1-9):
```

### Example Usage

**Addition:**
```
Enter first number: 5.5
Enter second number: 3.2
5.5000 + 3.2000 = 8.7000
```

**Square Root:**
```
Enter a number: 16
√16.0000 = 4.0000
```

**Factorial:**
```
Enter a non-negative integer: 5
5! = 120
```

## Error Handling

The calculator includes comprehensive error handling:

- **Invalid Input**: Non-numeric inputs are detected and the user is prompted again
- **Division by Zero**: Prevents division by zero with clear error messages
- **Negative Square Root**: Detects and prevents square root of negative numbers
- **Invalid Factorial**: Restricts factorial to non-negative integers (≤20 to prevent overflow)
- **Invalid Logarithm**: Ensures logarithm is only calculated for positive numbers

## Testing

The project includes comprehensive unit tests using JUnit 5.

### Run Tests

```bash
# Run all tests
mvn test

# Run tests with coverage
mvn test jacoco:report
```

### Test Coverage

Tests cover:
- All basic arithmetic operations
- Edge cases (zero, negative numbers, decimals)
- Error conditions (division by zero, invalid inputs)
- Scientific functions with various input ranges
- Boundary conditions and overflow scenarios

## Project Structure

```
SPE-Mini-Project/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── org/
│   │           └── example/
│   │               ├── Main.java              # Application entry point
│   │               └── ScientificCalculator.java # Core calculator logic
│   └── test/
│       └── java/
│           └── org/
│               └── example/
│                   └── ScientificCalculatorTest.java # Unit tests
├── pom.xml                                    # Maven configuration
├── Dockerfile                                 # Docker configuration
├── Jenkinsfile                                # CI/CD pipeline
└── README.md                                  # This file
```

## Technologies Used

- **Java 17** - Core programming language
- **Maven** - Build and dependency management
- **JUnit 5** - Unit testing framework
- **Docker** - Containerization support
- **Jenkins** - Continuous integration/deployment

## CI/CD Pipeline

The project includes a Jenkins pipeline (`Jenkinsfile`) that automates:
- Code checkout
- Build and compilation
- Unit testing execution
- JAR file creation
- Docker image building
- Deployment using Ansible

## Docker Support

Build and run the application using Docker:

```bash
# Build Docker image
docker build -t scientific-calculator .

# Run the container
docker run -it scientific-calculator
```

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-feature`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature/new-feature`)
5. Create a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Future Enhancements

- [ ] Graphical user interface (GUI)
- [ ] Additional scientific functions (trigonometry, etc.)
- [ ] Expression parsing for complex calculations
- [ ] Calculation history
- [ ] Configurable precision settings
- [ ] Web-based interface

## Authors

- **Your Name** - *Initial work* - [Rahul09123](https://github.com/your-username)

## Acknowledgments

- Built as a mini-project for Software Engineering Principles
- Inspired by classic scientific calculator functionality
