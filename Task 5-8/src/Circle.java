public class Circle {
    private double radius;
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }
}
