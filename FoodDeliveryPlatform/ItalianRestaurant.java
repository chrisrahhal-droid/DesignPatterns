package FoodDeliveryPlatform;

public class ItalianRestaurant implements Restaurant{

    @Override
    public Cuisine createCuisine() {
        return new ItalianCuisine();
    }
    
}
