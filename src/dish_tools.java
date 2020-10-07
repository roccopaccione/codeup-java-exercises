public class dish_tools {
    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 2500;

    public static void shoutDishName(dish d){
        System.out.println(d.nameOfDish.toUpperCase());
    }

    public static void analyzeDishCost(dish d){
        String message = (d.costInCents < AVERAGE_COST_OF_DISH_IN_CENTS) ? "Less expensive than average" : "More expensive than average";
        System.out.println(message);
    }

    public static dish flipRecommendation(dish d){
        d.wouldRecommend = !d.wouldRecommend;
        return d;
    }
}
