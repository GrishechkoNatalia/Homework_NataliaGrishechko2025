public class Student {
    private String name;
    private String group;
    private int course;
    private int[] grades;

    public Student(String name, String group, int course, int[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }
    public String getGroup() {
        return group;
    }
    public int getCourse() {
        return course;
    }
    public double getAverageGrade() {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }

    public void promote() {
        course++;
    }

    @Override
    public String toString() {
        return name + " (Курс: " + course + ", Группа: " + group + ", Средний балл: " + getAverageGrade() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name) && group.equals(student.group);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + group.hashCode();
        return result;
    }
}
