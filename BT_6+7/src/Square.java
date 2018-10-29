public class Square extends Shape {

    private double centerX;
    private double centerY;
    private double a;
    Square() {
        super();
        setcenterY(1.0);
        setcenterX(1.0);
        seta(1.0);
    }
    public Square(double centerX, double centerY, double a) {
        setcenterX(centerX);
        setcenterY(centerY);
        seta(a);
    }
    public Square(double centerX, double centerY, double a, boolean tomau, boolean dichuyen) {
        super(tomau, dichuyen);
        setcenterX(centerX);
        setcenterY(centerY);
        seta(a);
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
    public void seta(double a) {
        this.a = a;
    }
    public double geta() {
        return a;
    }
    public double getArea() {
        return a * a;
    }
    public double getPrimeter() {
        return a * 4;
    }
    @Override
    public String toString() {
        String output =getcenterX() + "\n" + getcenterY() + "\n" + getArea() + "\n" + getPrimeter() + "\n" + iscolored() + "\n" + ismoving();
        return output;
    }

}