class Week1Project {
    public static void main(String[] args) {
        int yearBorn = 2009;
        int currentYear = 2025;
        int age = currentYear - yearBorn;
        String fname = "Marie";
        String lname = "Golub";

        String formattedString = String.format("Hello, my name is %s %s and I am %d years old", fname, lname, age);

        System.out.println(formattedString);
    }
}