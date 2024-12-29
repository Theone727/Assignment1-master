class Person {
    private String name;
    private String surname;
    private int age;
    private boolean gender;

    public Person(String name, String surname, int age, boolean gender) {
        this.name = (name != null && !name.isEmpty()) ? name : "Unknown";
        this.surname = (surname != null && !surname.isEmpty()) ? surname : "Unknown";
        this.age = Math.max(0, age); // Ensure age is non-negative
        this.gender = gender;
    }

    @Override
    public String toString() {
        String genderStr = gender ? "Male" : "Female";
        return String.format(
                "Hi, I am %s %s, a %d-year-old %s.",
                name, surname, age, genderStr
        );
    }
}
