class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    void getArea() {
        System.out.println("Area: " + width * height);
    }
    void getPerimeter() {
        System.out.println("Area: " + 2 * (width + height));
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 15);
        rectangle.getArea();
        rectangle.getPerimeter();
    }
}