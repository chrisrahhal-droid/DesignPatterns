package FoodDeliveryPlatform;

public class AsianRestaurant implements Restaurant{

    @Override
    public Cuisine createCuisine() {
        return new AsianCuisine();
    }
    
}
