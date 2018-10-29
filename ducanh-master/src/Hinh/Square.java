package Hinh;

import BoCuc.point;

public class Square extends Rectangle {
	private double edege;

	public Square(String color, point topLeft, double edege) {
		super(color, topLeft);
		this.edege = edege;
	}

	public double getEdege() {
		return edege;
	}

	public void setEdege(double edege) {
		this.edege = edege;
	}
	public boolean equals(Square square) {
		boolean check = true;
		if (!TopLeft.equals(square.getTopLeft())) {
			check = false;
		}
		if (edege != square.getEdege()) {
			check = false;
		}
		return check;
	}
}
