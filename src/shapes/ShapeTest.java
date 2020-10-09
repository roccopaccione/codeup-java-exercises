package shapes;

public class ShapeTest {

    public static void main(String[] args){
        Rectangle box1 = new Rectangle(4, 5);
        Rectangle box2 = new Square(5);
        // Box1 Rectangle
        System.out.println("box1.getArea() = " + box1.getArea());
        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
        // Box2 Square
        System.out.println("box2.getArea() = " + box2.getArea());
        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
    }
}
