class ArraysExample {
    public static void main(String[] args) {
        final int[] scores = { 85, 90, 78 };
        int total = 0;
        int minimum = scores[0];
        int maximum = scores[0];

        for (int score : scores) {
            total += score;
            minimum = Math.min(minimum, score);
            maximum = Math.max(maximum, score);
        }

        System.out.println("Number of scores: " + scores.length);
        System.out.println("Average score: " + (double) total / scores.length);
        System.out.println("Lowest score: " + minimum);
        System.out.println("Highest score: " + maximum);
    }
}