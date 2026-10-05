import java.util.Scanner;

class NumberInput {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a whole number: ");
            if (!scanner.hasNext()) {
                System.out.println("No input was provided.");
                return;
            }

            if (scanner.hasNextInt()) {
                final int number = scanner.nextInt();
                System.out.println("You entered: " + number);
            } else {
                System.out.println("Please enter a valid whole number.");
            }
        }
    }
}
