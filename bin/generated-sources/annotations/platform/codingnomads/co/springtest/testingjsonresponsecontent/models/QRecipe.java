package platform.codingnomads.co.springtest.testingjsonresponsecontent.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRecipe is a Querydsl query type for Recipe
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRecipe extends EntityPathBase<Recipe> {

    private static final long serialVersionUID = -1065909386L;

    public static final QRecipe recipe = new QRecipe("recipe");

    public final NumberPath<Integer> difficultyRating = createNumber("difficultyRating", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final CollectionPath<Ingredient, QIngredient> ingredients = this.<Ingredient, QIngredient>createCollection("ingredients", Ingredient.class, QIngredient.class, PathInits.DIRECT2);

    public final NumberPath<Integer> minutesToMake = createNumber("minutesToMake", Integer.class);

    public final StringPath name = createString("name");

    public final CollectionPath<Review, QReview> reviews = this.<Review, QReview>createCollection("reviews", Review.class, QReview.class, PathInits.DIRECT2);

    public final CollectionPath<Step, QStep> steps = this.<Step, QStep>createCollection("steps", Step.class, QStep.class, PathInits.DIRECT2);

    public QRecipe(String variable) {
        super(Recipe.class, forVariable(variable));
    }

    public QRecipe(Path<? extends Recipe> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRecipe(PathMetadata metadata) {
        super(Recipe.class, metadata);
    }

}

