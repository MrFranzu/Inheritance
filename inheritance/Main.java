public class Main {
    public static void main(String[] args) {
        System.out.println("************************************");
        Shape shape = new Shape("Gray", "Smooth");
        System.out.println("The color of the shape: " + shape.getColor());
        System.out.println("The texture of the shape: " + shape.getTexture ());
        System.out.println("************************************");
   
        Circle circle = new Circle("Purple", "Rough", 5.0);
        System.out.println("The area of the circle: " + circle.getArea());
        System.out.println("The color of the circle: " + circle.getColor());
        System.out.println("The texture of the circle: " + circle.getTexture ());
        System.out.println("************************************");
       
        Cylinder cylinder = new Cylinder("Red", "Shiny", 5.0, 5.0);
        System.out.println("The volume of the cylinder: " + cylinder.getVolume());
        System.out.println("The color of the cylinder: " + cylinder.getColor());
        System.out.println("The texture of the cylinder: " + cylinder.getTexture ());
        System.out.println("************************************");
       
        Rectangle rectangle = new Rectangle("White", "Matte", 5.0, 5.0);
        System.out.println("The area of the rectangle: " + rectangle.getArea());
        System.out.println("The color of the rectangle: " + rectangle.getColor());
        System.out.println("The texture of the rectangle: " + rectangle.getTexture ());
        System.out.println("************************************");
    
        Box box = new Box("Green", "Glossy", 5.0, 5.0, 5.0);
        System.out.println("The volume of the box: " + box.getVolume());
        System.out.println("The color of the box: " + box.getColor());
        System.out.println("The texture of the box: " + box.getTexture ());
        System.out.println("************************************");
        
        Triangle triangle = new Triangle("Blue", "Polished", 5.0, 5.0);
        System.out.println("The area of the triangle: " + triangle.getArea());
        System.out.println("The color of the triangle: " + triangle.getColor());
        System.out.println("The texture of the triangle: " + triangle.getTexture ());
        System.out.println("***********************************");
        
        Pyramid pyramid = new Pyramid("Purple", "Wavy", 5.0, 5.0, 5.0);
        System.out.println("The volume of the pyramid: " + pyramid.getVolume());
        System.out.println("The color of the pyramid: " + pyramid.getColor());
        System.out.println("The texture of the pyramid : " + pyramid.getTexture ());
        System.out.println("***********************************");

        Square square = new Square("Black", "Striped", 5.0);
        System.out.println("The area of the square: " + square.getArea());
        System.out.println("The color of the square: " + square.getColor());
        System.out.println("The texture of the square: " + square.getTexture ());
        System.out.println("***********************************");
        
        Cube cube = new Cube("Yellow", "Grainy", 5.0);
        System.out.println("The volume of the cube : " + cube.getVolume());
        System.out.println("The color of the cube : " + cube.getColor());
        System.out.println("The texture of the cube: " + cube.getTexture ());
        System.out.println("***********************************");
        
    }
}