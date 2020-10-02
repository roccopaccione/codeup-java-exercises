import java.util.Scanner;

public class StringExercise {

    public static void main (String[] args) {

        String anotherBrickInTheWall = "We don't need no education \nWe don't need no thought control";
        System.out.println(anotherBrickInTheWall);

        String check = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(check);

        String windows = "In Windows, the main drive is usually C:\\";
        System.out.println(windows);

        String backSlash = "I can do backslash \\, double backslashes \\\\, \nand the amazing triple backslash \\\\\\!";
        System.out.println(backSlash);
    }
    public static class Bob {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            boolean userContinue = true;
            do {
                System.out.println("Please start a conversation with Bob.");
                String userInitiate = sc.nextLine();
                if (userInitiate.endsWith("?")) {
                    System.out.println("Bob: 'Sure'");
                } else if (userInitiate.endsWith("!")) {
                    System.out.println("Bob: 'Whoa, chill out!'");
                } else if (userInitiate.equals("")) {
                    System.out.println("Bob: 'Fine. Be that way!'");
                } else {
                    System.out.println("Bob: 'Whatever'");
                }
                System.out.println("Would you like to continue your conversation with Bob (y/n)?");
                String userConfirm = sc.nextLine();
                if(!userConfirm.equalsIgnoreCase("y")){
                    userContinue = false;
                }
            } while(userContinue);
        }
    }
}
