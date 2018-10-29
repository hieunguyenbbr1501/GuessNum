public class Triangle extends Shape {
    private double centerY;
    private double centerX;
    private double a;
    private double b;
    private double c;
    Triangle() {
        super();
        setcenterX(1.0);
        setcenterY(1.0);
        setA(1.0);
        setB(1.0);
        setC(1.0);
    }
    public Triangle(double centerX, double centerY, double a, double b, double c) {
        setcenterX(centerX);
        setcenterY(centerY);
        setA(a);
        setB(b);
        setC(c);
    }
    public Triangle(double centerX, double centerY, double a, double b, double c, boolean tomau, boolean dichuyen) {
        super(tomau, dichuyen);
        setcenterX(centerX);
        setcenterY(centerY);
        setA(a);
        setB(b);
        setC(c);
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
    public void setA(double a) {
        this.a = a;
    }
    public double getA() {
        return a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getB() {
        return b;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getC() {
        return c;
    }

    public double getArea() {
        double p = getPrimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double getPrimeter() {
        return a + b + c;
    }
    @Override
    public String toString() {
        String output = getcenterX() + "\n" + getcenterY() + "\n" + getA() + "\n" + getB() + "\n" + getC() + "\n" + getArea() + "\n" + getPrimeter() + "\n" + iscolored() + "\n" + ismoving();
        return output;

    }
}