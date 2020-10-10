package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super();
    }

    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }


    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return Math.pow(this.width, 2);
    }
}
