package pl.patterns.decorator;

public class LargePizza extends Pizza {

    public LargePizza() {
        description = "LargePizza";
    }

    @Override
    public double cost() {
        return 15.99;
    }
}
