// 9.9
public class RegularPolygon {
    // Private data fields
    private int n; // number of sides
    private double side; // length of the side
    private double x; // x-coordinate of the center
    private double y; // y-coordinate of the center

    // No-arg constructor
    public RegularPolygon() {
        n = 3; // default number of sides
        side = 1; // default length of side
        x = 0; // default x-coordinate
        y = 0; // default y-coordinate
    }

    // Constructor with specified number of sides and length of side
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        x = 0; // default x-coordinate
        y = 0; // default y-coordinate
    }

    // Constructor with specified number of sides, length of side, and coordinates
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // Accessor methods (getters)
    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Mutator methods (setters)
    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Method to calculate the perimeter
    public double getPerimeter() {
        return n * side;
    }

    // Method to calculate the area
    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args) {
        // Create three RegularPolygon objects
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        // Display perimeter and area for each object
        System.out.println("Polygon 1: Perimeter = " + polygon1.getPerimeter() + ", Area = " + polygon1.getArea());
        System.out.println("Polygon 2: Perimeter = " + polygon2.getPerimeter() + ", Area = " + polygon2.getArea());
        System.out.println("Polygon 3: Perimeter = " + polygon3.getPerimeter() + ", Area = " + polygon3.getArea());
    }
}