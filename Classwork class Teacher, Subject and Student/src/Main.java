public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mrs. Mihaylova", 10);
        Subject subject = new Subject("Object Oriented Programming", 10);
        Student student = new Student("Aleksandar", 17);

        student.ShowStudent();
        subject.showSubject();
        teacher.ShowTeacher();
    }
}