package platform.codingnomads.co.springsecurity.recipeapi.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QIngredient is a Querydsl query type for Ingredient
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QIngredient extends EntityPathBase<Ingredient> {

    private static final long serialVersionUID = 2072050607L;

    public static final QIngredient ingredient = new QIngredient("ingredient");

    public final StringPath amount = createString("amount");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final StringPath state = createString("state");

    public QIngredient(String variable) {
        super(Ingredient.class, forVariable(variable));
    }

    public QIngredient(Path<? extends Ingredient> path) {
        super(path.getType(), path.getMetadata());
    }

    public QIngredient(PathMetadata metadata) {
        super(Ingredient.class, metadata);
    }

}

