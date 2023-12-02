package platform.codingnomads.co.springdata.example.ddl.joincolumn;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QExample is a Querydsl query type for Example
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QExample extends EntityPathBase<Example> {

    private static final long serialVersionUID = -1666449124L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QExample example = new QExample("example");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QUser user;

    public QExample(String variable) {
        this(Example.class, forVariable(variable), INITS);
    }

    public QExample(Path<? extends Example> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QExample(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QExample(PathMetadata metadata, PathInits inits) {
        this(Example.class, metadata, inits);
    }

    public QExample(Class<? extends Example> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

