public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, String texture, double length, double width) {
        super(color, texture);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}
