package BoCuc;

public class point {
	public double x,y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals(point p) {
		if (p.x == this.x && p.y == this.y) {
			return true;
		}
		else return false;
	}
}
