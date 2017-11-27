package pl.patterns.decorator;

public class PizzaShopMain {

    public static void main(String[] args) {

        Pizza pizza = new MediumPizza();

        pizza = new CheeseDecorator(pizza);
        pizza = new HamDecorator(pizza);

        System.out.println(pizza.getDescription());
        System.out.println(pizza.cost());
    }
}
