import java.util.*;

class Student extends Person {
    private static int idCounter = 1;
    private final int studentID;
    private final List<Integer> grades;

    public Student(String name, String surname, int age, boolean gender, List<Integer> grades) {
        super(name, surname, age, gender);
        this.studentID = idCounter++;
        this.grades = grades != null ? new ArrayList<>(grades) : new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        }
    }

    public double calculateGPA() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        double totalPoints = grades.stream()
                .mapToDouble(grade -> {
                    if (grade >= 90) return 4.0;
                    else if (grade >= 80) return 3.0;
                    else if (grade >= 70) return 2.0;
                    else if (grade >= 60) return 1.0;
                    else return 0.0;
                })
                .sum();

        return totalPoints / grades.size();
    }

    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + ". GPA: " + String.format("%.2f", calculateGPA());
    }
}
