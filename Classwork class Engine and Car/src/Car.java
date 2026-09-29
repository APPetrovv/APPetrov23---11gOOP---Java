public class Car {
    String brand;
    String model;
    Car(String brand, String model, String Engine) {
        this.brand = brand;
        this.model = model;
    }

    void showCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {
        Car car = new Car("BMW","M3","Engine");
        Car car1 = new Car("Mercedes","S class","Engine");
        Engine engine = new Engine(174,115,9000);
        Engine engine1 = new Engine(200,150,10000);
        car.showCarInfo();
        engine.showEngineInfo();
        car1.showCarInfo();
        engine1.showEngineInfo();
    }
}
