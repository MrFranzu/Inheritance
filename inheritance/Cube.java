public class Cube extends Square {
    public Cube(String color, String texture, double side) {
        super(color, texture, side);
    }

    public double getVolume() {
        return getArea() * super.getArea();
    }
}
