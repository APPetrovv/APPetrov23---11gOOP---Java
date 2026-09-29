public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void ShowInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alex", 19 );
        Person person2 = new Person("Maria", 18);
        person1.ShowInfo();
        person2.ShowInfo();
    }
}
