package inheritanceExample;

public class Square extends GeometricObject {
    private double sideLength;
    public Square() {
    }
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }
    public Square(double sideLength, String color, boolean filled) {
        this.sideLength = sideLength;
        setColor(color);
        setFilled(filled);
    }
    public double getSideLength() {
        return sideLength;
    }
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
    public double getArea() {
        return sideLength * sideLength;
    }
    public double getPerimeter() {
        return 4 * sideLength;
    }
    public void printSquare() {
		System.out.println("The square is created " + getDateCreated() + " and the sideLength is " + sideLength);
    }
}
