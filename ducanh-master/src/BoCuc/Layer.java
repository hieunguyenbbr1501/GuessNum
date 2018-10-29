package BoCuc;

import java.util.ArrayList;

import Hinh.Circle;
import Hinh.Rectangle;
import Hinh.Shape;
import Hinh.Square;
import Hinh.Triangle;

public class Layer {
	private boolean visible = true;
	protected double width;
	protected double height;
	private ArrayList<Shape>shape = new ArrayList<Shape>();
	public Layer(boolean visible, double width, double height) {
		this.visible = visible;
		this.width = width;
		this.height = height;
	}
	
	public Layer(boolean visible, double width, double height, ArrayList<Shape> shape) {
		this.visible = visible;
		this.width = width;
		this.height = height;
		this.shape = shape;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
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

	public ArrayList<Shape> getShape() {
		if (isVisible()) {
			return shape;
		}
		else {
			return null;
		}
	}

	public void setShape(ArrayList<Shape> shape) {
		this.shape = shape;
	}
	// xóa hình tam giác
	public void deleteTriangle () {
		for (int i = shape.size() - 1; i >= 0; i--) {
			Shape s = shape.get(i);
			if (s instanceof Triangle) {
				shape.remove(i);
			}
		}
	}
	// xóa hình tròn
	public void deleteCircle () {
		for (int i = shape.size() - 1; i >= 0; i--) {
			Shape s = shape.get(i);
			if (s instanceof Circle) {
				shape.remove(i);
			}
		}
	}
	// thêm shape
	public void addShape (Shape newshape) {
		this.shape.add(newshape);
;	}
	// xóa hình trùng nhau 
	public void XoaTrung () {
		ArrayList<Shape> Vuong = new ArrayList<Shape>();
		ArrayList<Shape> ChuNhat= new ArrayList<Shape>();
		ArrayList<Shape> Tron = new ArrayList<Shape>();
		ArrayList<Shape> TamGiac = new ArrayList<Shape>();
		for (int i = 0; i < shape.size();i++) {
			Shape s = shape.get(i);
			if(s instanceof Rectangle) ChuNhat.add(s);
			else if (s instanceof Square) Vuong.add(s);
			else if (s instanceof Triangle) TamGiac.add(s);
			else if (s instanceof Circle) Tron.add(s);
		}
		shape.clear();
		for (int i = 0 ; i < ChuNhat.size()-1;i++) {
			for (int j = i+1; j < ChuNhat.size();j++) {
				if (ChuNhat.get(i))
			}
		}
	}
}
