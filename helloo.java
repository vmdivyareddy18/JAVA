
class HelloWorld {
    private static final String GREETING = "Hello, World!";
    private static final String CLOSING = "Have a nice day!";
    private static final String SEPARATOR = "---";

    public static void main(String[] args) {
        printMessage(GREETING);
        printMessage(SEPARATOR);
        printMessage(CLOSING);
    }

    private static void printMessage(final String message) {
        System.out.println(message);
    }
}