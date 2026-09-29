public class Main{
    public static void main(String[] args){
        Employee employee1 = new Employee("Georgi", 2500);
        Employee employee2 = new Employee("Stanislav", 1875);
        Department department1 = new Department("Electronics", "Sofia");
        Department department2 = new Department("Business", "Papaya");

        employee1.displayEmployee();
        department1.printDepartment();
        employee2.displayEmployee();
        department2.printDepartment();
    }
}
