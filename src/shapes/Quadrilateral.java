package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    public Quadrilateral(){
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public abstract void setWidth(double width);
    public abstract void setLength(double length);
}
