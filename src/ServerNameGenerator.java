import java.lang.reflect.Array;
import java.util.Random;

public class ServerNameGenerator {

   public static String[] adjectives = {"big", "fat", "lazy", "helpless", "ambitious", "clean", "witty", "nervous", "microscopic", "flabby"};

   public static String[] nouns = {"theory", "nature", "investment", "operation", "engine", "lab", "feedback", "neutrino", "cookie", "mode"};

   public static void main(String[] args){
       System.out.println("Here is your server name: ");
       System.out.print(getName(adjectives) + " " + getName(nouns));
   }

   public static String getName(String[] name){
       Random rand = new Random();
       int randomIndex = rand.nextInt(name.length);
       return name[randomIndex];
   }
}
