import java.util.Arrays;

public class ArraysExercise {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};


        Person[] people = new Person[3];
        people[0] = new Person("Leonardo");
        people[1] = new Person("Jack");
        people[2] = new Person("Warby");

        for(Person onePerson: people) {
            System.out.println("person = " + onePerson.getName());
        }
//        Person[] newArray = addPerson(people, new Person("Dante"))


        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(people));
    }
//    public static Person[] addPerson(Person[] originalArray, Person personToAdd)
//        originalArray = Arrays.copyOf(originalArray,);


}
