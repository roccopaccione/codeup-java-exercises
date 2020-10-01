import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // While Loop
//
//        int i = 5;
//        while (i <= 15) {
//            System.out.printf("%s ", i);
//            i++;
//        }

        // Do While Loop
//
//        int i = 0;
//        do{
//            System.out.printf("\n %s", i);
//            i+=2;
//        }while(i<101);
//
//        int i = 100;
//        do{
//            System.out.printf("%s \n", i);
//            i-=5;
//        }while(i >= -10);
//
//        long i = 2;
//        do{
//            System.out.printf("%s\n", i);
//            i*=i;
//        }while(i <= 1000000);

        // For Loop
//            for(int i = 5; i <= 15; i++) {
//                System.out.println("i is " + i);
//        }

//        for(int i = 0; i <= 100; i += 2){
//            System.out.printf("%s\n", i);
//        }

//        for(int i = 100; i >= -10; i -= 5) {
//            System.out.printf("%s\n", i);
//        }

//        for(long i = 2; i <= 1000000; i *= i) {
//            System.out.printf("%s \n", i);
//        }

        // FizzBuzz

//        for(int i = 1; i <= 100; i++) {
//           if(i % 15 == 0) {
//               System.out.print("FizzBuzz \n");
//           } else if (i % 3 == 0) {
//               System.out.print("Fizz \n");
//           } else if (i % 5 == 0) {
//               System.out.print("Buzz \n");
//           } else {
//               System.out.printf("%s \n", i);
//           }
//        }

        // Table Of Powers

        Scanner sc = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");
        int userInt = sc.nextInt();
        System.out.println("Would you like to proceed (y/n)?");
        String choice = sc.nextLine();
        if(choice.equalsIgnoreCase("y")){
            System.out.print("Here is your table!");
            System.out.println( "Number | Squared | Cubed ");
            System.out.println(" ------   -------   ------");
        } else if(choice.equalsIgnoreCase("n")){
            System.out.print("Okay no table for you!");
        }







    }
}
