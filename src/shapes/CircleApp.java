package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double r = input.getDouble(0,
                15000);
        Circle megaCurve  = new Circle(r);
        System.out.println("megaCurve.getCircumference() = " + megaCurve.getCircumference());
        System.out.println("megaCurve.getArea() = " + megaCurve.getArea());

    }
}
