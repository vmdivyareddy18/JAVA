class Loops {
    public static void main(String[] args) {
        int total = 0;

        for (int number = 1; number <= 5; number++) {
            total += number;
        }

        System.out.println("Sum from 1 to 5: " + total);

        int countdown = 3;
        while (countdown > 0) {
            System.out.println("Countdown: " + countdown);
            countdown--;
        }
    }
}