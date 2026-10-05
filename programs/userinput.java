import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            final String name = scanner.nextLine();
            final String trimmedName = name.trim();
            if (trimmedName.isEmpty()) {
                System.out.println("Name cannot be empty.");
            } else {
                System.out.println("Hello, " + trimmedName + "!");
            }
        }
    }
}