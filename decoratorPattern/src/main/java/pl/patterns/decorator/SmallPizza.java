package pl.patterns.decorator;

public class SmallPizza extends Pizza {

    public SmallPizza() {
        description = "SmallPizza";
    }

    @Override
    public double cost() {
        return 8.99;
    }
}
