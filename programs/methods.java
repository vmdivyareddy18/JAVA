class Methods {
    public static void main(String[] args) {
        final int firstNumber = 7;
        final int secondNumber = 5;

        System.out.println("Product: " + multiply(firstNumber, secondNumber));
        System.out.println("Square: " + multiply(firstNumber));
    }

    private static int multiply(int number) {
        return multiply(number, number);
    }

    private static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}