public class Square extends Shape {
    private double side;

    public Square(String color, String texture, double side) {
        super(color, texture);
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}
