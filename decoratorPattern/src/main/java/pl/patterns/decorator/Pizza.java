package pl.patterns.decorator;

public abstract class Pizza {

    String description = "Undefinied Pizza";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
