import java.util.HashSet;

class StudentSet extends HashSet<Student> {
    public void removeLowPerformers() {
        this.removeIf(student -> student.getAverageGrade() < 3);
    }

    public void promoteStudents() {
        this.forEach(Student::promote);
    }
}
