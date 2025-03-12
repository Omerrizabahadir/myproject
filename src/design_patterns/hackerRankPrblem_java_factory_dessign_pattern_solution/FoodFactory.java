package design_patterns.hackerRankPrblem_java_factory_dessign_pattern_solution;

public class FoodFactory {

    public  Food getFood(String order){
        if(order.equalsIgnoreCase("Pizza")){
            return new Pizza();
        }else if(order.equalsIgnoreCase("Cake")){
            return new Cake();
        }
        return null;
    }
}
