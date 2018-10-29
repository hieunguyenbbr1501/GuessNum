public abstract class Shape extends Layer {

    private boolean colored;
    private boolean moving;
    Shape() {
        setcolored(true);
        setmoving(true);
    }
    public Shape(boolean colored, boolean moving) {
        setcolored(colored);
        setmoving(moving);
    }
    public void setcolored(boolean colored) {
        this.colored = colored;
    }
    public boolean iscolored() {
        return colored;
    }
    public void setmoving(boolean moving) {
        this.moving = moving;
    }
    public boolean ismoving() {
        return moving;
    }
    @Override
    public String toString() {
        String output = iscolored() + "\n" + ismoving();
        return output;
    }
}