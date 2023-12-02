package platform.codingnomads.co.springdata.lab_complete.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPointOfInterest is a Querydsl query type for PointOfInterest
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPointOfInterest extends EntityPathBase<PointOfInterest> {

    private static final long serialVersionUID = -438529642L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPointOfInterest pointOfInterest = new QPointOfInterest("pointOfInterest");

    public final QArea area;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final ListPath<Route, QRoute> routes = this.<Route, QRoute>createList("routes", Route.class, QRoute.class, PathInits.DIRECT2);

    public final StringPath type = createString("type");

    public QPointOfInterest(String variable) {
        this(PointOfInterest.class, forVariable(variable), INITS);
    }

    public QPointOfInterest(Path<? extends PointOfInterest> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPointOfInterest(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPointOfInterest(PathMetadata metadata, PathInits inits) {
        this(PointOfInterest.class, metadata, inits);
    }

    public QPointOfInterest(Class<? extends PointOfInterest> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.area = inits.isInitialized("area") ? new QArea(forProperty("area")) : null;
    }

}

