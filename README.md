# Java Practice

Small Java examples for learning syntax, variables, operators, and output.

The examples are intentionally small so each concept can be compiled and run independently.

## Examples

- `hello.java` prints a basic greeting.
- `HelloWorld.java` prints a world greeting.
- `helloo.java` demonstrates formatted output.
- `oparator.java` demonstrates arithmetic operators.
- `programs/student.java` demonstrates common variable types.

## Compile

```sh
javac -d out hello.java
java -cp out BasicHello
javac -d out HelloWorld.java
java -cp out WorldGreeting
javac -d out oparator.java
java -cp out oparator
javac -d out programs/student.java
java -cp out Student
```


These examples can be compiled with any modern JDK.

## Run

Compile each source file into the `out` directory before running its class.

To remove compiled output, delete the `out` directory and compile again.
