package platform.codingnomads.co.springsecurity.recipeapi.models;

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

    private static final long serialVersionUID = -1791984020L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRecipe recipe = new QRecipe("recipe");

    public final NumberPath<Integer> difficultyRating = createNumber("difficultyRating", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final CollectionPath<Ingredient, QIngredient> ingredients = this.<Ingredient, QIngredient>createCollection("ingredients", Ingredient.class, QIngredient.class, PathInits.DIRECT2);

    public final NumberPath<Integer> minutesToMake = createNumber("minutesToMake", Integer.class);

    public final StringPath name = createString("name");

    public final CollectionPath<Review, QReview> reviews = this.<Review, QReview>createCollection("reviews", Review.class, QReview.class, PathInits.DIRECT2);

    public final CollectionPath<Step, QStep> steps = this.<Step, QStep>createCollection("steps", Step.class, QStep.class, PathInits.DIRECT2);

    public final platform.codingnomads.co.springsecurity.recipeapi.models.securitymodels.QCustomUserDetails user;

    public QRecipe(String variable) {
        this(Recipe.class, forVariable(variable), INITS);
    }

    public QRecipe(Path<? extends Recipe> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRecipe(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRecipe(PathMetadata metadata, PathInits inits) {
        this(Recipe.class, metadata, inits);
    }

    public QRecipe(Class<? extends Recipe> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new platform.codingnomads.co.springsecurity.recipeapi.models.securitymodels.QCustomUserDetails(forProperty("user"), inits.get("user")) : null;
    }

}

