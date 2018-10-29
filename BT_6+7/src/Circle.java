public class Circle extends Shape {

    private double centerX;

    private double centerY;

    private double radius;

    private final double Pi = 3.14;

    Circle() {
        super();
        setcenterY(1.0);
        setcenterX(1.0);
        setradius(1.0);
    }

    public Circle(double centerX, double centerY, double radius) {
        setcenterX(centerX);
        setcenterY(centerY);
        setradius(radius);
    }

    public Circle(double centerX, double centerY, double radius, boolean tomau, boolean dichuyen) {
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
        this.radius = radius;
    }

    
    public double getradius() {
        return radius;
    }

   
    public double getArea() {
        return Pi * radius * radius;
    }

    public double getPrimeter() {
        return Pi * radius * 2;
    }
    @Override
    public String toString() {
        String string =getcenterX()+ "\n" + getcenterY() + "\n" + getradius() + "\n" + getArea() + "\n" + getPrimeter() + "\n" + iscolored() + "\n" + ismoving();
        return string;
    }

}