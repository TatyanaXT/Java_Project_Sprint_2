import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;
import model.constants.Colour;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Food meat = new Meat(5, 100);
        Food redApples = new Apple(10, 50, Colour.RED);
        Food greenApples = new Apple(8, 60, Colour.GREEN);

        Food[] products = {meat, redApples, greenApples};
        ShoppingCart cart = new ShoppingCart(products);

        System.out.printf("Без скидки: %s\n",
                cart.getSumWithoutDiscount());
        System.out.printf("Со скидкой: %s\n",
                cart.getSumWithDiscount());
        System.out.printf("Вегетарианские без скидки: %s\n",
                cart.getSumVegan());

    }
}