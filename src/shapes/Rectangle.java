package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double rLength, double rWidth){
        this.length = rLength;
        this.width = rWidth;
    }

    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return (2 * this.length) + (2 * this.width);
    }

}
