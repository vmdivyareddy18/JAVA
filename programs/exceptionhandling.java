class ExceptionHandling {
    public static void main(String[] args) {
        final String text = args.length > 0 ? args[0] : "not-a-number";

        try {
            final int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid whole number: " + text);
        }
    }
}
