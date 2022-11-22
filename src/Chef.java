// All measurements are in milliliters (ml) and grams (g)

import java.util.HashMap;

public class Chef {
    public HashMap<String, String> currentIngredients = new HashMap<>();
    private final Ingredients ingredients = new Ingredients();

    public HashMap<String, String> getIngredients() {
        HashMap<String, String> foundIngredients = new HashMap<>();
        // Pull ingredients from file
        // Assign pulled ingredients to
        ingredients.readIngredientsFromFile();

        return foundIngredients;
    }

    public void addIngredient(HashMap<String, String> ingredients) {
        // Append ingredient to current list
        // Append ingredient to folder
    }

    public HashMap<String, String> getRecipes() {
        HashMap<String, String> foundRecipes = new HashMap<>();

        // Pull recipes from file (where you have ingredients)
        // Assign pulled ingredients to

        return foundRecipes;
    }

    // Create Recipe

    // Execute recipe
}
