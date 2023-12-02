package platform.codingnomads.co.springdata.example.querydsl.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoute is a Querydsl query type for Route
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoute extends EntityPathBase<Route> {

    private static final long serialVersionUID = 71848384L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRoute route = new QRoute("route");

    public final StringPath code = createString("code");

    public final QArea destination;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final QArea origin;

    public QRoute(String variable) {
        this(Route.class, forVariable(variable), INITS);
    }

    public QRoute(Path<? extends Route> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRoute(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRoute(PathMetadata metadata, PathInits inits) {
        this(Route.class, metadata, inits);
    }

    public QRoute(Class<? extends Route> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.destination = inits.isInitialized("destination") ? new QArea(forProperty("destination")) : null;
        this.origin = inits.isInitialized("origin") ? new QArea(forProperty("origin")) : null;
    }

}

