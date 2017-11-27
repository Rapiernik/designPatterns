package pl.patterns.decorator;

public class MediumPizza extends Pizza {

    public MediumPizza() {
        description = "MediumPizza";
    }

    @Override
    public double cost() {
        return 11.99;
    }

}
