package shapes;

public class ShapeTest {

    public static void main(String[] args){
        System.out.println("Rectangle First: ");
        Measurable myShape = new Rectangle(4, 5);
        Measurable myShape1 = new Square(25);

        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());



    }
}
