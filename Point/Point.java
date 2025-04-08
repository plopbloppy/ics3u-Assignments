public class Point {

    private double x;
    private double y;
    
    public Point() {
        Point point = new Point(0, 0);
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
        return Math.sqrt(Math.pow(point.getX() - x, 2) + Math.pow(point.getY() - y, 2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void linearEquation(Point point) {
        double m = (point.getY() - y) / (point.getX() - x);
        double b = y - m * x;

        System.out.println("y = " + m + "x + " + b);
    }

    public Point midpoint(Point point) {
        return new Point((x + point.getX()) / 2, (y + point.getY()) / 2);
    }

    public double slope(Point point) {
        return (point.getY() - y) / (point.getX() - x);
    }

    public Point sum(Point point) {
        return new Point(x + point.getX(), y + point.getY());
    }

    public double yIntercept(Point point) {
        double m = (point.getY() - y) / (point.getX() - x);
        
        return y - m * x;
    }
}