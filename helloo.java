
class HelloWorld {
    private static final String GREETING = "Hello, Java!";
    private static final String CLOSING = "Have a nice day!";
    private static final String SEPARATOR = "---";
    private static final String WELCOME = "Welcome to Java.";
    private static final String TITLE = "Simple Java Program";
    private static final String VERSION = "Version 1.0";
    private static final String AUTHOR = "By Divya";

    public static void main(String[] args) {
        printMessage(TITLE);
        printMessage(VERSION);
        printMessage(GREETING);
        printMessage(SEPARATOR);
        printMessage(WELCOME.toUpperCase());
        printMessage(CLOSING + "!");
    }

    private static void printMessage(final String message) {
        System.out.println(message);
    }
}