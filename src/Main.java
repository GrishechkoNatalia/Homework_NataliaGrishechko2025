import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        StudentSet students = new StudentSet();
        students.add(new Student("Алексей", "Группа 1", 2, new int[]{4, 5, 3, 2}));
        students.add(new Student("Мария", "Группа 2", 1, new int[]{2, 2, 3, 2}));
        students.add(new Student("Дмитрий", "Группа 3", 3, new int[]{5, 4, 4, 5}));

        System.out.println("Студенты до фильтрации:");
        students.forEach(System.out::println);

        students.removeLowPerformers();

        System.out.println("Студенты после отсева:");
        students.forEach(System.out::println);

        students.promoteStudents();

        System.out.println("Студенты перешли на другой курс:");
        students.forEach(System.out::println);

        System.out.println("Студенты 3 курса:");
        printStudents(students, 3);
    }

    public static void printStudents(StudentSet students, int course) {
        students.stream()
                .filter(student -> student.getCourse() == course)
                .map(Student::getName)
                .forEach(System.out::println);
    }
}

class StudentSet extends HashSet<Student> {
    public void removeLowPerformers() {
        this.removeIf(student -> student.getAverageGrade() < 3);
    }

    public void promoteStudents() {
        this.forEach(Student::promote);
    }
}
