public class Point {

    private double x;
    private double y;
    
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point difference(Point point) {
        return new Point(x - point.getX(), y - point.getY());
    }

    public void displayCoordinate() {
        System.out.println("The x-coordinate is: " + x);
        System.out.println("The y-coordinate is: " + y);
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(difference(point).getX(), 2) + Math.pow(difference(point).getY(), 2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void linearEquation(Point point) {
        System.out.println("y = " + slope(point) + "x + " + yIntercept(point));
    }

    public Point midpoint(Point point) {
        return new Point(sum(point).getX() / 2, sum(point).getY() / 2);
    }

    public double slope(Point point) {
        return (difference(point).getY()) / difference(point).getX();
    }

    public Point sum(Point point) {
        return new Point(x + point.getX(), y + point.getY());
    }

    public double yIntercept(Point point) {
        return y - slope(point) * x;
    }
}