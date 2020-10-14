package grades;

import java.util.ArrayList;

public class Student{
    private String name;
    private final ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, Integer grade){
        this.name = name;
        ArrayList<Integer> grades = new ArrayList<>();

//        // returns the student's name
//        public String getName(){
//            return name;
//        }
//// adds the given grade to the grades property
//        public void addGrade(int grade);
//// returns the average of the students grades
//        public double getGradeAverage();


    }

    public static void main(String[] args){
        String newStudent = new Student("Rocco", 75);

    }

}
