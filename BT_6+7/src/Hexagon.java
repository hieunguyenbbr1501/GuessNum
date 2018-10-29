public class Hexagon extends Shape {

    private double centerX;

    private double centerY;

    private double radius;

    Hexagon() {
        super();
        setcenterX(1.0);
        setcenterY(1.0);
        setradius(1.0);
    }

    public Hexagon(double centerX, double centerY, double radius) {
        setcenterX(centerX);
        setcenterY(centerY);
        setradius(radius);
    }

    public Hexagon(double centerX, double centerY, double radius, boolean tomau, boolean dichuyen) {
        super(tomau, dichuyen);
        setcenterX(centerX);
        setcenterY(centerY);
        setradius(radius);
    }

    public void setcenterX(double centerX) {
        this.centerX = centerX;
    }

    public double getcenterX() {
        return centerX;
    }

    public void setcenterY(double centerY) {
        this.centerY = centerY;
    }

    public double getcenterY() {
        return centerY;
    }

    public void setradius(double radius) {
        this.radius = radius
    }
    public double getradius() {
        return radius;
    }

    public double getArea() {
        return 6 * 1 / 2 * radius * radius * (Math.sqrt(3) / 2);
    }

    
    public double getPrimeter() {
        return 6 * 3 * radius;
    }

    
    @Override
    public String toString() {
        String output = getcenterX() + "\n" + getcenterY() + "\n" + getradius() + "\n" + getArea() + "\n" + getPrimeter() + "\n" + iscolored() + "\n" + ismoving();
        return output;
    }
}