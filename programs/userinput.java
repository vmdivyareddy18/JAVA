import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            final String name = scanner.nextLine();
            System.out.println("Hello, " + name + "!");
        }
    }
}