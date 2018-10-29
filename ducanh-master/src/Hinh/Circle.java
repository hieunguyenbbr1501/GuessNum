package Hinh;
import BoCuc.Diagram;
import BoCuc.point;

public class Circle extends Shape{
	private point center;
	private double radius;
	public Circle(String color, point center, double radius) {
		super(color);
		this.center = center;
		this.radius = radius;
	}
	public point getCenter() {
		return center;
	}
	public void setCenter(point center) {
		this.center = center;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public boolean move(double x, double y) {
		point tuyentinh = new point(x, y);
		double newX = center.x + tuyentinh.x;  // tọa độ x của điểm gốc mới
		double newY = center.y + tuyentinh.y;	// tạo đọ y của điểm gốc mới
		double widthDg = Diagram.getWidth();			// chiều rộng Diagram
		double heightDg = Diagram.getHeight();		// chiều dài Diagram
		if (newX > widthDg || newX < 0 || newY > heightDg || newY < 0) { // tọa độ mới phải nhỏ hơn giới hạn Diagram và lớn hơn 0
			return false;
		}
		else {
			 center.x = newX;
			 center.y = newY;
			 return true;
		}
	}
	@Override
	public String ToString() {
		return "Circle [center= (" + center.x + "," + center.y + ")"  + ", radius=" + radius + "]";
	}
}
