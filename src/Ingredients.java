import units.Grams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Ingredients {
    public ArrayList<Ingredient> ingredients = new ArrayList<>();

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public void removeIngredient(Ingredient ingredient) {
        this.ingredients.remove(ingredient);
    }

    public Ingredient findIngredientByName(String name) {
        return this.ingredients.stream().filter(ingredient -> ingredient.getName().equals(name)).findFirst().orElse(null);
    }

//    public static Ingredients loadIngredientsFromFile(String file) {
//        var ingredients = new Ingredients();
//
//        // Get stuff loaded and saved
//        // Serialize (serialisation) arrayList
//
//        return ;
//    }

    public static void saveIngredientsToFile(Ingredients ingredients, String file) {
        // Reverse from loadIngredientsFromFile() => Save to File
    }
}
