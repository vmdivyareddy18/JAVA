public class oparator {
    private static final int FIRST_NUMBER = 10;
    private static final int SECOND_NUMBER = 3;

    public static void main(String[] args) {

        final int a = FIRST_NUMBER;
        final int b = SECOND_NUMBER;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Whole-number division: " + (a / b));
        System.out.println("Division: " + divide(a, b));
        System.out.println("Remainder: " + (a % b));
        System.out.println("All arithmetic operations completed.");

    }

    private static double divide(int a, int b) {
        return (double) a / b;
    }
}
