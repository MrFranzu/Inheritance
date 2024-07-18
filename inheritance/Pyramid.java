public class Pyramid extends Triangle {
    private double width;

    public Pyramid(String color, String texture, double base, double height, double width) {
        super(color, texture, base, height);
        this.width = width;
    }

    public double getVolume() {
        return (getArea() * width) / 3;
    }
}
