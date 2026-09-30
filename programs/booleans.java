class Booleans {
    public static void main(String[] args) {
        final int score = 87;
        final boolean hasPassed = score >= 60;
        final boolean hasCertificate = false;

        System.out.println("Score: " + score);
        System.out.println("Passed: " + hasPassed);
        System.out.println("Ready for certification: " + (hasPassed && !hasCertificate));
    }
}