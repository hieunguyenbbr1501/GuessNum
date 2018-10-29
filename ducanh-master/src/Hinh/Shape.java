package Hinh;

public abstract class Shape {
	protected String color;
	
	public Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract String ToString ();
	public abstract boolean move (double x, double y); // truyền đối số là số đơn vị tọa muốn thay đổi
}
