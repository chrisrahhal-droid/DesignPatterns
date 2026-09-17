package FoodDeliveryPlatform;

public class PriorityDelivery extends BaseDishDecorator {

    public PriorityDelivery(Dish dish) {
        super(dish);
    }

    @Override 
    public String order(){
        return super.order() + " + priority delivery";
    }
}
