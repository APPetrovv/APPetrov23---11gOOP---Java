public class Department {
    String name;
    String location;

    Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    void  printDepartment() {
        System.out.println("He works in the " + name + " department, which is located in " + location);
    }

}
