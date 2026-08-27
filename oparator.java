public class oparator {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + divide(a, b));
        System.out.println("Remainder: " + (a % b));

    }

    private static double divide(int a, int b) {
        return (double) a / b;
    }
}
