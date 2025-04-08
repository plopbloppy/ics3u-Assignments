public class Main {
    
    public static void main (String[] args) {
        Quadratic quadratic = new Quadratic(1, 6, 9);

        double[] roots = quadratic.getRoots();
        double[] vertex = quadratic.getVertex();

        System.out.println("a: " + quadratic.getA());
        System.out.println("b: " + quadratic.getB());
        System.out.println("c: " + quadratic.getC());
        System.out.println("Has roots: " + quadratic.hasRealRoots());
        System.out.println("Has maximum: " + quadratic.isMaximum());
        System.out.println("Discriminant: " + quadratic.getDiscriminant());
        System.out.println("Roots: (x = " + roots[0] + ") & (x =" + roots[1] + ")");
        System.out.println("Vertex: (" + vertex[0] + ", " + vertex[1] + ")");
        System.out.println("Y-int: " + quadratic.getYIntercept());
        quadratic.getStandardForm();
        quadratic.getVertexForm();
        quadratic.getFactoredForm();
    }
}