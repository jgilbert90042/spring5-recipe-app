package guru.springframework.commands;

import guru.springframework.domain.Difficulty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class RecipeCommand {
    private Long id;
    private Set<CategoryCommand> categories;
    private Integer cookTime;
    private String description;
    private Difficulty difficulty;
    private String directions;
    private Byte[] image;
    private Set<IngredientCommand> ingredients;
    private NotesCommand notes;
    private Integer prepTime;
    private Integer servings;
    private String source;
    private String url;
}
