package grades;

import java.util.ArrayList;

public class Student{
    private String name;
    private ArrayList<Integer> grades;

    public Student(String stuName){
        this.name = stuName;
        this.grades = new ArrayList<>();

    }

    public String getName(){
        return this.name;
    }
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    public double getGradeAverage(){
        double sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }


    public static void main(String[] args){
        Student roc = new Student("Rocco");
        roc.addGrade(70);
        roc.addGrade(98);
        roc.addGrade(82);
        roc.addGrade(80);
        System.out.println("Rocco's average grade is: " + roc.getGradeAverage());
    }

}
