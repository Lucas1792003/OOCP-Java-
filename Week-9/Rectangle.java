package homework_PackageWeek9;

public class Rectangle implements RectangleComparable {
    private double width;
    private double height;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }

    @Override
    public int compareTo(Rectangle other) {
        return Double.compare(getPerimeter(), other.getPerimeter());
    }

    @Override
    public String toString() {
        return String.format("Height: %.1f, Width: %.1f, Perimeter: %.1f",
                             height, width, getPerimeter());
    }
}
