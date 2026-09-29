public class Subject {
    String name;
    int hours;

    Subject(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    void showSubject() {
        System.out.println("Subject Name: " + name);
        System.out.println("Classes per week: " + hours);
    }
}
