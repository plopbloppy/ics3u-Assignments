public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(2, 5);
        Point p2 = new Point(3, 6);
        Point p3 = new Point(0.5, 2);

        p1.displayCoordinate();
        System.out.println("Difference: (" + p1.difference(p2).getX() + ", " + p1.difference(p2).getY() + ")");
        System.out.println("Distance: " + p1.distance(p2) + " units");
        p1.linearEquation(p3);
        System.out.println("Midpoint: (" + p1.midpoint(p2).getX() + ", " + p1.midpoint(p2).getY() + ")");
        System.out.println("Slope: " + p1.slope(p2));
        System.out.println("Sum: (" + p1.sum(p2).getX() + ", " + p1.sum(p2).getY() + ")");
        System.out.println("Y-intercept: " + p1.yIntercept(p2));
    }
}