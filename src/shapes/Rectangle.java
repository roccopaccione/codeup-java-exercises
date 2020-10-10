package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double length, double width) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return (2 * this.getLength()) + (2 * this.getWidth());
    }

    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }

}
