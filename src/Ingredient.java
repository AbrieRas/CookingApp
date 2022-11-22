import units.Units;

public class Ingredient {
    private final String name;
    private final Units amount;

    public Ingredient(String name, Units amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public Units getAmount() {
        return amount;
    }
}
