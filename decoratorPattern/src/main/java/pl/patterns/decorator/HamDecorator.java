package pl.patterns.decorator;

public class HamDecorator extends PizzaDecorator {

    public HamDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Ham";
    }

    @Override
    public double cost() {
        return pizza.cost() + 5.99;
    }
}
