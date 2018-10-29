import java.util.ArrayList;

import BoCuc.Diagram;
import BoCuc.Layer;
import BoCuc.point;
import Hinh.Shape;
import Hinh.Triangle;
import Hinh.Circle;


public class Main {
	public static void main(String[] args) {
		Layer layer1 = new Layer(true, Diagram.getWidth(), Diagram.getHeight());
		Shape circle1 = new Circle(null, new point(4, 5), 40);
		Shape circle2 = new Circle(null, new point(3, 1), 30);
		Shape triangle = new Triangle(null, new point(2,3), new point(4, 5), new point(6, 7));
		layer1.addShape(circle1);
		layer1.addShape(circle2);
		layer1.addShape(triangle);
		Diagram.addLayer(layer1);
		
		// test phương thức di chuyển
		System.out.println(circle1.ToString());
		if (!circle1.move(1, 2)) {
			System.out.println("không di chuyển đc");
		}
		System.out.println(circle1.ToString());
		// test phương thức xóa hình tròn
		Diagram.deleteCircles();
		for (Shape i : Diagram.getShape()) {
			if (i instanceof Circle) {
				System.out.println("Không xóa đc rồi");
			}
		}
		// test phương thức xóa hình chữ nhật
		layer1.deleteTriangle();
		for (Shape i: layer1.getShape()) {
			if (i instanceof Triangle) {
				System.out.println("Không xóa đc rồi");
			}
		}
		
	}
}
