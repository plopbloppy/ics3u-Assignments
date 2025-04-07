public class Point {

    private double x;
    private double y;
    private double x2;
    private double y2;
    
    public Point() {
        Point point = new Point(0, 0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point difference(Point point) {
        Point p1 = new Point(x, y);
        Point p2 = new Point(x2, y2);

        return p1.difference(p2);
    }

    public void displayCoordinate() {
        System.out.println("The x-coordinate is: " + x);
        System.out.println("The y-coordinate is: " + y);
    }

    public double distance(Point point) {
        Point p2 = new Point(x2, y2);
        return Math.sqrt(Math.pow(p2.getX() - getX(), 2) + Math.pow(p2.getY() - getY(), 2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void linearEquation(Point point) {
        Point p2 = new Point(x2, y2);
        double m = (p2.getY() - getY()) / (p2.getX() - getX());
        double b = 

        System.out.println("y = " + m + "x + " + )
        
    }
}
