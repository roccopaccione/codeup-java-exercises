package util;

public class Input_Test {
    public static void main(String[] args){
        Input input = new Input();


        if (input.yesNo())
        {
            System.out.println("This returned true");
        }else{
            System.out.println("It says false");
        }

        System.out.println(input.getInt(255, 300));

        System.out.println(input.getDouble(255, 300));
    }
}
