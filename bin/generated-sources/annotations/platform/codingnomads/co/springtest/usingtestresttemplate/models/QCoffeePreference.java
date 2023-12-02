package platform.codingnomads.co.springtest.usingtestresttemplate.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCoffeePreference is a Querydsl query type for CoffeePreference
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCoffeePreference extends EntityPathBase<CoffeePreference> {

    private static final long serialVersionUID = -516352369L;

    public static final QCoffeePreference coffeePreference = new QCoffeePreference("coffeePreference");

    public final BooleanPath iced = createBoolean("iced");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> intensity = createNumber("intensity", Integer.class);

    public final EnumPath<CoffeePreference.Size> size = createEnum("size", CoffeePreference.Size.class);

    public final BooleanPath sugar = createBoolean("sugar");

    public final StringPath type = createString("type");

    public QCoffeePreference(String variable) {
        super(CoffeePreference.class, forVariable(variable));
    }

    public QCoffeePreference(Path<? extends CoffeePreference> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCoffeePreference(PathMetadata metadata) {
        super(CoffeePreference.class, metadata);
    }

}

