import java.util.Scanner;

public class MethodsExercise {
    public static void main (String[] args) {

        System.out.println(addInt(5, 10));

        System.out.println(subtractNum(65, 22));

        System.out.println(multiplyNum(42, 20));

        System.out.println(division(225, 5));

        System.out.println(modNumBy(30, 3));

//        System.out.println(getInteger(1, 10));
//        System.out.println(getInteger(5, 9));

        System.out.println(factorialTable());


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

    // User Input Between two numbers

    public static int getInteger (int min, int max) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max);
        int userInput = Integer.parseInt(scan.nextLine());

        if (userInput < min) {
            System.out.println("This number is lower than " + min);
            return getInteger(min, max);
        } else if ( userInput > max){
            System.out.println("This number is larger than " + max);
            return getInteger(min, max);
        }

        return userInput;
    }

    // Factorial table

    public static long factorialTable(){
        int userInput = getInteger(1, 10);
        long output = 1;
        for (int counter = 1; counter <= userInput; counter++){
            output *= counter;
        }
        return output;
    }
}
