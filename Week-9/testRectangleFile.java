package homework_PackageWeek9;
public class RectangleTester {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(0, 0));
        rectangles.add(new Rectangle(1, 2));
        rectangles.add(new Rectangle(2, 1));
        rectangles.add(new Rectangle(0.5, 1));
        rectangles.add(new Rectangle(5, 4));

        System.out.println("Before sorting:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        Collections.sort(rectangles);

        System.out.println("\nAfter sorting:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
