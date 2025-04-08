public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(1, 2);

        p1.displayCoordinate();
        System.out.println("Difference: (" + p1.difference(p2).getX() + ", " + p1.difference(p2).getY() + ")");
        System.out.println("Distance: " + p1.distance(p2) + " units");
    }
}
