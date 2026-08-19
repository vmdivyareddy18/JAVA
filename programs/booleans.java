class Booleans {
    public static void main(String[] args) {
        final boolean hasPassed = true;
        final boolean hasCertificate = false;

        System.out.println("Passed: " + hasPassed);
        System.out.println("Ready for certification: " + (hasPassed && !hasCertificate));
    }
}