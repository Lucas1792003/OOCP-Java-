package inheritanceExample;

public class TestAllSubclass {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.setColor("yellow");
        circle.setFilled(true);
        System.out.println("Circle information: ");
        System.out.println("   Radius: " + circle.getRadius());
        System.out.println("   Area: " + circle.getArea());
        System.out.println("   Diameter: " + circle.getDiameter());
        System.out.println("   Perimeter: " + circle.getPerimeter());
        System.out.println("   Color: " + circle.getColor());
        System.out.println("   Filled: " + circle.isFilled());
        System.out.println("   Date created: " + circle.getDateCreated());
        System.out.println();

        Rectangle rectangle = new Rectangle(5.0, 8.0);
        rectangle.setColor("red");
        rectangle.setFilled(true);
        System.out.println("Rectangle information: ");
        System.out.println("   Width: " + rectangle.getWidth());
        System.out.println("   Height: " + rectangle.getHeight());
        System.out.println("   Area: " + rectangle.getArea());
        System.out.println("   Perimeter: " + rectangle.getPerimeter());
        System.out.println("   Color: " + rectangle.getColor());
        System.out.println("   Filled: " + rectangle.isFilled());
        System.out.println("   Date created: " + rectangle.getDateCreated());
        System.out.println();

        Square square = new Square(6.0);
        square.setColor("green");
        square.setFilled(true);
        System.out.println("Square information: ");
        System.out.println("   Side length: " + square.getSideLength());
        System.out.println("   Area: " + square.getArea());
        System.out.println("   Perimeter: " + square.getPerimeter());
        System.out.println("   Color: " + square.getColor());
        System.out.println("   Filled: " + square.isFilled());
        System.out.println("   Date created: " + square.getDateCreated());
    }
}
