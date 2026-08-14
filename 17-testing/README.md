# 17 - Testing

Introduces unit testing in Java using JUnit 5.

## What this covers

- **Unit tests** — verifying individual methods behave correctly
- **Assertions** — `assertEquals`, `assertThrows`
- **Test structure** — one test method per behavior

## How to run

This requires the JUnit 5 standalone console jar. Download it, then:

```bash
javac -cp junit-platform-console-standalone.jar Calculator.java CalculatorTest.java
java -jar junit-platform-console-standalone.jar -cp . --select-class CalculatorTest
```

See: https://junit.org/junit5/docs/current/user-guide/#running-tests-console-launcher
