package pl.patterns.decorator;

public abstract class PizzaDecorator extends Pizza {

    Pizza pizza;

    public abstract String getDescription();
}
