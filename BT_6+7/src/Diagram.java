
	import java.util.ArrayList;

	public abstract class Diagram {
		public ArrayList<Layer> layers = new ArrayList();
	    public static Circle deleteCircle(Circle shape) {
	        if (shape instanceof Circle) {
	            shape = null;
	        }
	        return (Circle) shape;
	    }
	    public void moveLayer(Layer name, Shape shape ) {
	        name.layers.add(shape);
	    }
	}
