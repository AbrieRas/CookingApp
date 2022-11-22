import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Objects;

public class Ingredients {
    public HashMap<String, String> readIngredientsFromFile() {
        HashMap<String, String> ingredients = new HashMap<>();

        try {
            Path source = Paths.get(this.getClass().getResource("/")
                    .getPath()
                    .replace("/C:","C:")
                    .replace("CookingApp", "Resources"));
//            System.out.println(source);
            Path newFilePath = Paths.get(String.valueOf(source.toAbsolutePath()));

            if(!Files.exists(newFilePath)) Files.createDirectory(newFilePath);
//            File file = new File(newFilePath + "\\Ingredients.txt");
//            System.out.println(newFilePath);
//            if (file.createNewFile()) System.out.println("Created Ingredients.txt in " + newFilePath);;
//        } catch (IOException e) {
        } catch (Exception e) {
            System.out.println("Hmm, it seems that I ran into an error.\n" + e);
        }



        return ingredients;
    }

    public void addIngredientToFile() {
        // Append ingredient to file
    }
}
