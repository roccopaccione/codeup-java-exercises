import java.util.Arrays;

public class ArraysExercise {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        Person[] persons = new Person[3];

        persons[0] = new Person("Leonardo");
        persons[1] = new Person("Jack");
        persons[2] = new Person("Warby");




        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(persons));
    }
}
