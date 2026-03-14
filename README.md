# Scientific Calculator

A command-line scientific calculator built in Java which executes basic arithmetic operations along with advanced mathematical functions.

### Operations
- **Addition** (+) - Add two numbers
- **Subtraction** (-) - Subtract two numbers  
- **Multiplication** (*) - Multiply two numbers
- **Division** (/) - Divide two numbers with zero-division protection

### Scientific Functions
- **Square Root** (√x) - Calculate square root of non-negative numbers
- **Factorial** (x!) - Compute factorial of non-negative integers (0-20)
- **Natural Logarithm** (ln(x)) - Calculate natural logarithm of positive numbers
- **Power** (x^b) - Raise a number to any power


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
docker exec -it calculator /bin/bash
java -jar /app/app.jar
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
Enter first number: 7
Enter second number: 3
7.0000 + 3.0000 = 10.0000
```

**Square Root:**
```
Enter a number: 25
√25.0000 = 5.0000
```

## Error Handling

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

## Future Enhancements

- [ ] Additional scientific functions (trigonometry, etc.)
- [ ] Expression parsing for complex calculations
- [ ] Web-based interface


