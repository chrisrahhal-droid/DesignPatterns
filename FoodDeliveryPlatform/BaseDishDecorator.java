package FoodDeliveryPlatform;

public abstract class BaseDishDecorator implements Dish{
    private Dish dish;

    public BaseDishDecorator(Dish dish){
        this.dish = dish;
    }

    public String order(){
        return dish.order();
    }
}
