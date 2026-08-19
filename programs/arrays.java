class ArraysExample {
    public static void main(String[] args) {
        final int[] scores = { 85, 90, 78 };
        int total = 0;

        for (int score : scores) {
            total += score;
        }

        System.out.println("Number of scores: " + scores.length);
        System.out.println("Average score: " + (double) total / scores.length);
    }
}