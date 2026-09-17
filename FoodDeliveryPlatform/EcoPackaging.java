package FoodDeliveryPlatform;

public class EcoPackaging extends BaseDishDecorator{

    public EcoPackaging(Dish dish) {
        super(dish);
    }

    @Override
    public String order() {
        return super.order() + " + Eco-Packaging";
    }

}
