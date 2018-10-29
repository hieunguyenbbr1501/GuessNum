package Hinh;

import BoCuc.Diagram;
import BoCuc.point;

public class Triangle extends Shape{
	private point Top1;
	private point Top2;
	private point Top3;
	public Triangle(String color, point top1, point top2, point top3) {
		super(color);
		Top1 = top1;
		Top2 = top2;
		Top3 = top3;
	}
	public point getTop1() {
		return Top1;
	}
	public void setTop1(point top1) {
		Top1 = top1;
	}
	public point getTop2() {
		return Top2;
	}
	public void setTop2(point top2) {
		Top2 = top2;
	}
	public point getTop3() {
		return Top3;
	}
	public void setTop3(point top3) {
		Top3 = top3;
	}
	@Override
	public boolean move (double x, double y) {
		point tuyentinh = new point(x, y);
		double newX1 = Top1.x + tuyentinh.x;
		double newY1 = Top1.y +tuyentinh.y;
		
		double newX2 = Top2.x + tuyentinh.x;
		double newY2 = Top2.y +tuyentinh.y;
		
		double newX3 = Top3.x + tuyentinh.x;
		double newY3 = Top3.y +tuyentinh.y;
		
		double newXmax = Math.max(Math.max(newX1, newX2), newX3);
		double newYmax = Math.max(Math.max(newY1, newY2), newY3);
		
		double newXmin = Math.min(Math.min(newX1,newX2), newX3);
		double newYmin = Math.min(Math.min(newY1,newY2), newY3);
		
		double widthDg = Diagram.getWidth();			// chiều rộng Diagram
		double heightDg = Diagram.getHeight();		// chiều dài Diagram
		
		if (newXmax > widthDg || newXmin < 0 || newYmax > heightDg || newYmin < 0) {
			return false;
		}
		else {
			Top1.x = newX1; Top1.y = newY1;
			Top2.x = newX2; Top2.y = newY2;
			Top3.x = newX3; Top3.y = newY3;
			return true;
		}
		
	}
	@Override
	public String ToString() {
		return "Triangle [Top1=(" + Top1.x +","+Top1.y+")" + ", Top2=(" + Top2.x +","+Top2.y+ "), Top3=(" + Top3.x+","+Top3.y + ")]";
	}
	
	public boolean equals (Triangle triangle) {
		boolean check = true;
		if (!triangle.getTop1().equals(Top1) && !triangle.getTop1().equals(Top2) && !triangle.getTop1().equals(Top3)) {
			check = false;
		}
		else if (!triangle.getTop2().equals(Top1) && !triangle.getTop2().equals(Top2) && !triangle.getTop2().equals(Top3)) {
			check = false;
		}
		else if (!triangle.getTop3().equals(Top1) && !triangle.getTop3().equals(Top2) && !triangle.getTop3().equals(Top3)) {
			check = false;
		}
		return check;
	}
	
}
