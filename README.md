# Java Practice

Small Java examples for learning syntax, variables, operators, and output.

The examples are intentionally small so each concept can be compiled and run independently.

## Examples

- `hello.java` prints a basic greeting.
- `HelloWorld.java` prints a world greeting.
- `helloo.java` prints a multi-line greeting.
- `Operators.java` demonstrates arithmetic operators.
- `programs/student.java` demonstrates common variable types.
- `programs/conditionals.java` demonstrates branching.
- `programs/loops.java` demonstrates `for`, `while`, and `do-while` loops.
- `programs/arrays.java` demonstrates arrays.
- `programs/methods.java` demonstrates methods.
- `programs/strings.java` demonstrates string operations.
- `programs/switches.java` demonstrates `switch` statements.
- `programs/booleans.java` demonstrates boolean logic.
- `programs/casting.java` demonstrates numeric casting.
- `programs/userinput.java` demonstrates standard input.
- `programs/objects.java` demonstrates a class and object.
- `programs/numberinput.java` demonstrates validated integer input.
- `programs/exceptionhandling.java` demonstrates handling invalid number text.

The source filename does not need to match a package-private class name, but it
must match a `public` class name. The input examples use try-with-resources,
so use JDK 7 or newer.

## Compile

```sh
javac -d out hello.java
java -cp out BasicHello
javac -d out HelloWorld.java
java -cp out WorldGreeting
javac -d out Operators.java
java -cp out Operators
javac -d out programs/student.java
java -cp out Student
```


These examples can be compiled with JDK 7 or newer.

## Run

Compile each source file into the `out` directory before running its class.

To remove compiled output, delete the `out` directory and compile again.

For interactive examples, run the program and enter the requested value:

```sh
javac -d out programs/userinput.java
java -cp out UserInput
javac -d out programs/numberinput.java
java -cp out NumberInput
```

For the command-line argument example, pass a whole number after the class name:

```sh
javac -d out programs/exceptionhandling.java
java -cp out ExceptionHandling 42
```

To compile every example at once:

```sh
	javac -d out hello.java HelloWorld.java helloo.java Operators.java programs/*.java
```
