public class Rectangle extends Shape {

    private double centerX;
    private double centerY;
    private double length;
    private double width;
    Rectangle() {
        super();
        setcenterY(1.0);
        setcenterX(1.0);
        setlength(1.0);
        setwidth(1.0);
    }
    public Rectangle(double centerX, double centerY, double length, double width) {
        setcenterX(centerX);
        setcenterY(centerY);
        setlength(length);
        setwidth(width);
    }
    public Rectangle(double centerX, double centerY, double length, double width, boolean tomau, boolean dichuyen) {
        super(tomau, dichuyen);
        setcenterX(centerX);
        setcenterY(centerY);
        setlength(length);
        setwidth(width);
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
    public void setlength(double length) {
        this.length = length;
    }
    public double getlength() {
        return length;
    }
    public void setwidth(double width) {
        this.width = width;
    }
    public double getwidth() {
        return width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPrimeter() {
        return (length + width) * 2;
    }
    @Override
    public String toString() {
        String output =getcenterX() + "\n" + getcenterY() + "\n" + getlength() + "\n" + getwidth() + "\n" + getArea() + "\n" + getPrimeter() + "\n" + iscolored() + "\n" + ismoving();
        return output;
    }

}