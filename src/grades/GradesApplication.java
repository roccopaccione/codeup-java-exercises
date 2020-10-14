package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args){
        HashMap<String, Student> students = new HashMap<>();
        Student Rocco = new Student("Rocco");
        Student Dante = new Student("Dante");
        Student Shane = new Student("Shane");

        Rocco.addGrade(95);
        Rocco.addGrade(74);
        Rocco.addGrade(98);

        Dante.addGrade(85);
        Dante.addGrade(96);
        Dante.addGrade(64);

        Shane.addGrade(26);
        Shane.addGrade(76);
        Shane.addGrade(99);

        students.put("roccopaccione", Rocco);
        students.put("dantesInferno", Dante);
        students.put("shanethemane", Shane);

        cli(students);
    }

    public static void cli(HashMap<String,Student> students){
        Input input = new Input();
        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:");

        for (String ghUsername: students.keySet()) {
            System.out.println(ghUsername+" ");
        }

        do{
            System.out.println("What student would you like to see more information on?\n");
            String username = input.getString();
            if(students.containsKey(username)){
                System.out.printf("Name: %s - GitHub Username: %s\n" +
                        "Current Average: %f\n", students.get(username).getName(), username, students.get(username).getGradeAverage());
            } else {
                System.err.printf("Sorry, no student found with the GitHub username of %s.", username);
            }
        } while (input.yesNo("Would you like to see another student Y/N ?"));

        System.out.println("Goodbye, Have a wonderful day!");
    }
}
