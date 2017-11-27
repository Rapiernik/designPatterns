package pl.patterns.decorator;

public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Cheese";
    }

    @Override
    public double cost() {

        return pizza.cost() + 3.99;
    }
}
