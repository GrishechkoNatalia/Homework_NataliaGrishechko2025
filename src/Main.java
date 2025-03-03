public class Main {
    public static void main(String[] args) {
        // #1
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
        printStudents(students, 4);

        // #2
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Иванов", "+7-900-123-45-67");
        phoneDirectory.add("Петров", "+7-901-234-56-78");
        phoneDirectory.add("Иванов", "+7-911-111-22-33");

        System.out.println("Телефоны Иванова: " + phoneDirectory.get("Иванов"));
        phoneDirectory.printDirectory();
    }

    static void printStudents(StudentSet students, int course) {
        students.stream()
                .filter(student -> student.getCourse() == course)
                .map(Student::getName)
                .forEach(System.out::println);
    }
}
