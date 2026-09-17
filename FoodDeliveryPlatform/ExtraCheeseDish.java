package FoodDeliveryPlatform;

public class ExtraCheeseDish extends BaseDishDecorator {

    public ExtraCheeseDish(Dish dish) {
        super(dish);
    }

    @Override 
    public String order() {
        return super.order() + " + Extra cheese";
    }
}
