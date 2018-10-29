package Hinh;

import BoCuc.Diagram;
import BoCuc.point;

public class Rectangle extends Shape{
	protected point TopLeft;   // điểm trên cùng bên trái
	private double width;
	private double height;
	public point getTopLeft() {
		return TopLeft;
	}
	public void setTopLeft(point topLeft) {
		TopLeft = topLeft;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Rectangle(String color, point topLeft, double width, double height) {
		super(color);
		TopLeft = topLeft;
		this.width = width;
		this.height = height;
	}
	public Rectangle(String color, point topLeft) {
		super(color);
		TopLeft = topLeft;
	}
	@Override
	public boolean move(double x, double y) {
		point tuyentinh = new point(x, y);
		double newX = TopLeft.x + tuyentinh.x;  // tọa độ x của điểm gốc mới
		double newY = TopLeft.y + tuyentinh.y;	// tạo đọ y của điểm gốc mới
		double widthDg = Diagram.getWidth();			// chiều rộng Diagram
		double heightDg = Diagram.getHeight();		// chiều dài Diagram
		if (newX > widthDg || newX < 0 || newY > heightDg || newY < 0) { // tọa độ mới phải nhỏ hơn giới hạn Diagram và lớn hơn 0
			return false;
		}
		else {
			 TopLeft.x = newX;
			 TopLeft.y = newY;
			 return true;
		}
	}
	@Override
	public String ToString() {
		return "Rectangle [TopLeft= (" + TopLeft.x +","+ TopLeft.y + "), width=" + width + ", height=" + height + "]";
	}
	// so sánh 2 hình chữ nhật
	public boolean equals(Rectangle rectangle) {
		boolean check = true;
		if (!TopLeft.equals(rectangle.getTopLeft())) {
			check = false;
		}
		if (width != rectangle.getWidth() || height != rectangle.getHeight() ) {
			check = false;
		}
		return check;
			
	}
	
}
