
class HelloWorld {
    private static final String GREETING = "Hello, World!";
    private static final String CLOSING = "Have a nice day!";

    public static void main(String[] args) {
        printMessage(GREETING);
        printMessage(" ");
        printMessage(CLOSING);
    }

    private static void printMessage(final String message) {
        System.out.println(message);
    }
}