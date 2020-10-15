public class ExceptionsLec {
    static String hello;
    static String[] fruits = {"Apples", "Oranges", "Pears", "Lemons", "Watermelons"};

    public static void main(String[] args){
        try {
//        NullPointerException
            if (hello.equals("hello")) {
                System.out.println("Hello, World!");
            }
//        IndexOutOfBoundsException
            System.out.println("The Ninth Fruit is: " + fruits[9]);

        }catch (NullPointerException npe) {
            System.out.println("NullPointerException");
            System.out.println("npr");
        }catch (IndexOutOfBoundsException iobe) {
            System.out.println("IndexOutOfBoundsException");
            System.out.println("iobe");
        }

    }
}
