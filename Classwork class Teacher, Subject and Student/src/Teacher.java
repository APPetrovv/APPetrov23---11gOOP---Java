public class Teacher {
    String name;
    int experience;

    Teacher(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    void ShowTeacher() {
        System.out.println("Name: " + name);
        System.out.println("Experience: " + experience + " years");
    }
}
