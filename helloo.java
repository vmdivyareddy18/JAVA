
class HelloWorld {
    private static final String GREETING = "Hello, Java!";
    private static final String CLOSING = "Have a nice day!";
    private static final String SEPARATOR = "---";
    private static final String WELCOME = "Welcome to Java.";
    private static final String TITLE = "Simple Java Program";
    private static final String VERSION = "Version 1.0";
    private static final String AUTHOR = "By Divya";
    private static final String LINE = "==========";
    private static final String END_LINE = "----------";
    private static final String FOOTER = "End of Java program";
    private static final String SPACE = " ";
    private static final String PUNCTUATION = "!!";

    public static void main(String[] args) {
        printMessage(TITLE);
        printMessage(LINE);
        printMessage(VERSION);
        printMessage(AUTHOR);
        printMessage(GREETING);
        printMessage(SEPARATOR);
        printMessage(WELCOME.toUpperCase());
        printMessage(CLOSING + SPACE + "Thanks" + PUNCTUATION);
        printMessage(END_LINE);
        printMessage(FOOTER + PUNCTUATION);
    }

    private static void printMessage(final String message) {
        System.out.println(message);
    }
}