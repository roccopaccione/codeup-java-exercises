package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);

    }

    public String getString(){
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Please enter yes or no");
        String input = scanner.nextLine();
      return (input.trim().toLowerCase().equals("y") || (input.trim().toLowerCase().equals("yes")));
    }

    public int getInt(){
        try{
            System.out.println("Please enter an integer");
            String num = getString();
            Integer integ = Integer.valueOf(num);
            return integ;
        } catch (NumberFormatException nfe) {
        System.out.println("NumberFormatException");
        System.out.println("nfe");
    } catch (NullPointerException npe) {
        System.out.println("NullPointerException");
        System.out.println("npe");
    }finally{
        System.out.println("okay");
    }
       return getInt();
    }

    public static int getInt(int min, int max){
        while (true) {
            System.out.printf("Please enter a number between %d and %d\n", min, max);
            String input = scanner.nextLine();
            int num = Integer.parseInt(input);
            if (num >= min && num <= max)
                return num;
        }
    }


        public double getDouble() {
            try {
                System.out.println("Please enter an number");
                String input = getString();
                double dub = Double.valueOf(input);
                return dub;
            } catch (NumberFormatException nfe) {
                System.out.println("NumberFormatException");
                System.out.println("nfe");
            } catch (NullPointerException npe) {
                System.out.println("NullPointerException");
                System.out.println("npe");
            }finally{
                System.out.println("okay");
            }
            return getDouble();
        }



    public double getDouble(double min, double max){
        while (true) {
            System.out.printf("Please enter a number between %f and %f\n", min, max);
            String input = scanner.nextLine();
            double num = Double.parseDouble(input);
            if (num >= min && num <= max)
                return num;
        }
    }
}
