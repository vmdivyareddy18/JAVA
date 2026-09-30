import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            final String name = scanner.nextLine();
            System.out.println("Hello, " + name + "!");
        }
    }
}