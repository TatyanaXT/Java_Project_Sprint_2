package service;
import model.Food;


public class ShoppingCart {
    private final Food[] foodCart;

    public ShoppingCart (Food[] foodCart) {

        this.foodCart = foodCart;
    }

    // получить общую сумму товаров в корзине без скидки
    public double getSumWithoutDiscount() {
        double sumValue = 0;

        for (Food f: foodCart) {
            sumValue += f.getTotalPrice();
        }
        return sumValue;
    }

    //получить общую сумму товаров в корзине со скидкой
    public double getSumWithDiscount() {

        double sumValueDiscount = 0;

        for (Food f: foodCart) {
            sumValueDiscount += (
                    f.getTotalPrice()
                    * (1 - ((double) f.getDiscount() / 100))
            );
        }
        return sumValueDiscount;
    }

    // получить общую сумму всех вегетарианских продуктов в корзине без скидки
    public double getSumVegan() {
        double sumValueVegan = 0;

        for (Food f: foodCart) {
            if (f.isVegetarian()) {
                sumValueVegan += f.getTotalPrice();
            }
        }
        return sumValueVegan;
    }
}
