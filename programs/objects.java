class Objects {
    private final String name;

    Objects(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        final Objects example = new Objects("Java");
        System.out.println("Object name: " + example.getName());
    }
}