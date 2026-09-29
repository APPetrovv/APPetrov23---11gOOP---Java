class Student {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void Introduction() {
        System.out.println("I am " + age + " years old. My name is " + name + " and my grade is " + grade);
    }

    public static void main(String[] args)
    {
        Student s1 = new Student("Ahmed", 17, 5.5);
        Student s2 = new Student("Abdulla", 16, 6);

        s1.Introduction();
        s2.Introduction();
    }
}