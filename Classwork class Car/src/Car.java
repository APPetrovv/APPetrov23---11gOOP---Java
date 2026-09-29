import java.util.Scanner;

class Car {
    String brand;
    String color;
    int year;
    Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }
    void drive() {
        System.out.println("I drive a " + color + " " + brand + " from the year " + year);
    }
    void show() {
        System.out.println("I am " + color + " " + brand + " from the year " + year);
    }
    public static void main(String[] args) {
        Car car =  new Car("BMW", "Blue", 1990);
        Car car2 =  new Car("Mercedes", "Black", 1990);
        Car car3 =  new Car("Dodge", "Red", 1990);

        car.drive();
        car.show();
        car2.drive();
        car2.show();
        car3.drive();
        car3.show();
    }
}