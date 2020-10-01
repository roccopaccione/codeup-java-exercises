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
//        boolean userConfirm = true;
//
//        do {
//            System.out.println("What number would you like to go up to?");
//            int userInt = sc.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for(int i = 1; i <= userInt; i++){
//                System.out.printf("%-6d", i);
//                System.out.print(" | ");
//                System.out.printf("%-7d", i * i);
//                System.out.print(" | ");
//                System.out.print(i * i * i);
//                System.out.println();
//            }
//            System.out.println("Would you like to print another number (y/n) ?");
//            String userResponse = sc.next();
//            if(!userResponse.equalsIgnoreCase("y")) {
//                userConfirm = false;
//            }
//
//        } while(userConfirm);

        boolean userContinue = true;

        do {
            System.out.println("Please enter a numerical grade from 0 to 100 ");

            int numericGrade = sc.nextInt();

            if(numericGrade >= 88) {
                System.out.println("A");
            } else if(numericGrade >= 80) {
                System.out.println("B");
            } else if(numericGrade >= 67) {
                System.out.println("C");
            } else if(numericGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            System.out.println("Would you like to enter another grade (y/n)?");
            String userResponse = sc.next();
            if(!userResponse.equalsIgnoreCase("y")){
                userContinue = false;
            }
        } while(userContinue);






    }
}
