public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Aleksey", 17);
        Person person2 = new Person("Stilian", 16);
        Address address1 = new Address("Burgas", "Asen Zlatarov", 4);
        Address address2 = new Address("Burgas", "Ferdinandska", 7);

        person1.showInfo();
        address1.showAddress();
        person2.showInfo();
        address2.showAddress();
    }
}
