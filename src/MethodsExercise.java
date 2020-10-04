import java.util.Scanner;

public class MethodsExercise {
    public static void main (String[] args) {

        System.out.println(addInt(5, 10));

        System.out.println(subtractNum(65, 22));

        System.out.println(multiplyNum(42, 20));

        System.out.println(division(225, 5));

        System.out.println(modNumBy(30, 3));

    }
    public static int addInt (int one, int two) {
        return one + two;
    }

    public static int subtractNum (int first, int second) {
        return first - second;
    }

    public static int multiplyNum (int one, int two) {
        return one * two;
    }

    public static int division (int one, int two) {
        return one / two;
    }

    public static int modNumBy (int one, int two) {
        return one % two;
    }

    // User Input Table

    public static int getInteger (int min, int max) {

        Scanner scan = new Scanner(System.in);
        boolean isValid = true;

        System.out.println("Enter a number.");
        int userInput = scan.nextInt();
        if (userInput <= 10 && userInput >= 0) {
            System.out.println("Valid Integer");
        } else {
            System.out.println("Not a valid Integer!");
        }


    }
}
