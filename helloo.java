
class HelloWorld {
    private static final String GREETING = "Hello, Java!";
    private static final String CLOSING = "Have a nice day!";
    private static final String SEPARATOR = "---";
    private static final String WELCOME = "Welcome to Java.";

    public static void main(String[] args) {
        printMessage(GREETING);
        printMessage(SEPARATOR);
        printMessage(WELCOME.toUpperCase());
        printMessage(CLOSING);
    }

    private static void printMessage(final String message) {
        System.out.println(message);
    }
}