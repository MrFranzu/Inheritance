public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String color, String texture, double base, double height) {
        super(color, texture);
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return (base * height) / 2;
    }
}
