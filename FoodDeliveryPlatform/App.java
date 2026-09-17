package FoodDeliveryPlatform;

public class App {
    public static void main(String[] args){
        Dish pizza = new Pizza();
        System.out.println(pizza.order());
        ExtraCheeseDish pizzaWithCheese = new ExtraCheeseDish(pizza);

        Cuisine cuisine = new ItalianRestaurant().createCuisine();
        System.out.println(cuisine.calculateDeliveryFee());
        System.out.println(pizzaWithCheese.order());

    }
}
