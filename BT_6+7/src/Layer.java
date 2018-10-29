
public abstract class Layer extends Diagram {

   
    public static Diagram xoaTriangle(Object shape) {
        if (shape instanceof Triangle) {
            shape = null;
        }
        return (Diagram)shape;
    }

    private boolean visible;

    Layer() {
        setVisible(false);
    }

    public Layer(boolean visible) {
        setVisible(visible);
    }

    
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    
    public boolean isVisible() {
        return visible;
    }

   
    @Override
    public String toString() {
        String output = ""+isVisible();
        return output;
    }
}