package FoodDeliveryPlatform;

public class MexicanRestaurant implements Restaurant{

    @Override
    public Cuisine createCuisine() {
        return new MexicanCuisine();
    }
    
}
