import java.util.Scanner;


public class ConsoleExercise {
    public static void main(String[] args){
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f\n", pi);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Integer:");
        int userInput = sc.nextInt();
        System.out.printf("You entered: %s!", userInput);
        System.out.println("Enter your wu-tang clan name (It has to be 3 words):");
        String firstName = sc.next();
        String secondName = sc.next();
        String lastName = sc.next();
        System.out.format("Your Wu-Tang Clan Name is: %s\n %s\n %s !\n ", firstName, secondName, lastName);
        System.out.println("Print a sentence please!");
        String input = sc.nextLine();
        System.out.format("This is your sentence: %s", input);
        System.out.print("Enter The Length and Width of the Codeup classroom:\n");
        String userLength = sc.nextLine();
        int userInt = new Integer(Integer.parseInt(userLength, sc.radix()));
        String userWidth = sc.nextLine();
        int widthInt = new Integer(Integer.parseInt(userWidth, sc.radix()));
        int userPerimeter = (2 * widthInt) + (2 * userInt);
        int userArea = (userInt * widthInt);
        System.out.format("The perimeter is: %s\n", userPerimeter);
        System.out.format("The area is: %s\n", userArea);






    }
}
