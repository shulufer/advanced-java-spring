package platform.codingnomads.co.springdata.example.dml.introducingrepositories.jparepository;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QSoftDrink is a Querydsl query type for SoftDrink
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSoftDrink extends EntityPathBase<SoftDrink> {

    private static final long serialVersionUID = 2051390226L;

    public static final QSoftDrink softDrink = new QSoftDrink("softDrink");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> rating = createNumber("rating", Integer.class);

    public QSoftDrink(String variable) {
        super(SoftDrink.class, forVariable(variable));
    }

    public QSoftDrink(Path<? extends SoftDrink> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSoftDrink(PathMetadata metadata) {
        super(SoftDrink.class, metadata);
    }

}

