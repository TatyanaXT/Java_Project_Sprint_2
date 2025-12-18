import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Food meat = new Meat(5, 100);
        Food redApples = new Apple(10, 50, "red");
        Food greenApples = new Apple(8, 60, "green");

        Food[] products = {meat, redApples, greenApples};
        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("Без скидки: " +
                cart.getSumWithoutDiscount());
        System.out.println("Со скидкой: " +
                cart.getSumWithDiscount());
        System.out.println("Вегетарианские без скидки: " +
                cart.getSumVegan());

    }
}