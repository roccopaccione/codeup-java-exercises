package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea(){
        System.out.println("The Squares area is: ");
        return Math.pow(this.length, 2);
    }

    @Override
    public double getPerimeter(){
        System.out.println("The Squares perimeter is: ");
        return 4 * this.length;
    }
}
