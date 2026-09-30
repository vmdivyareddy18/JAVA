class Casting {
    public static void main(String[] args) {
        final int wholeNumber = 12;
        final double widenedValue = wholeNumber;
        final double decimalValue = 9.75;
        final int wholeValue = (int) decimalValue;

        System.out.println("Widened integer: " + widenedValue);
        System.out.println("Decimal value: " + decimalValue);
        System.out.println("Whole value: " + wholeValue);
    }
}