package BoCuc;

import java.util.ArrayList;

import Hinh.Shape;

public class Diagram {
	static double width = 600;
	static double height = 600;
	private static ArrayList<Layer> layer = new ArrayList<Layer>();
	public static double getWidth() {
		return width;
	}
	public static void setWidth(double width) {
		Diagram.width = width;
	}
	public static double getHeight() {
		return height;
	}
	public static void setHeight(double height) {
		Diagram.height = height;
	}
	public static ArrayList<Layer> getLayer() {
		return layer;
	}
	public static void setLayer(ArrayList<Layer> newlayer) {
		layer = newlayer;
	}
	public static void deleteCircles() {
		for (Layer i : layer) {
			i.deleteCircle();
		}
	}
	public static void addLayer (Layer newlayer) {
		layer.add(newlayer);
	}
	
	// lấy các hình có trên Diagram
	public static ArrayList<Shape> getShape () {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		for (Layer i : layer) {
			shapes.addAll(i.getShape());
		}
		return shapes;
	}
}
