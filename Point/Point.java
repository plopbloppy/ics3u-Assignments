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
        double x2 = point.getX();
        double y2 = point.getY(); 

        return new Point(x - x2, y - y2);
    }

    public void displayCoordinate() {
        System.out.println("The x-coordinate is: " + x);
        System.out.println("The y-coordinate is: " + y);
    }

    public double distance(Point point) {
        double x2 = point.getX();
        double y2 = point.getY(); 

        return Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void linearEquation(Point point) {
        x2 = point.getX();
        y2 =
        double m = (p2.getY() - getY()) / (p2.getX() - getX());
        double b = 

        System.out.println("y = " + m + "x + " + )
        
    }
}
