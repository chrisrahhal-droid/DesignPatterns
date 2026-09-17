package FoodDeliveryPlatform;

public class Pizza implements Dish {

    @Override
    public String order() {
        return "Ordering Pizza";
    }
}