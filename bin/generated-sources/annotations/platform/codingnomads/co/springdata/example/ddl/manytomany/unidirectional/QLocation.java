package platform.codingnomads.co.springdata.example.ddl.manytomany.unidirectional;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QLocation is a Querydsl query type for Location
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLocation extends EntityPathBase<Location> {

    private static final long serialVersionUID = -1636103020L;

    public static final QLocation location = new QLocation("location");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> latitude = createNumber("latitude", Long.class);

    public final NumberPath<Long> longitude = createNumber("longitude", Long.class);

    public final StringPath name = createString("name");

    public QLocation(String variable) {
        super(Location.class, forVariable(variable));
    }

    public QLocation(Path<? extends Location> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLocation(PathMetadata metadata) {
        super(Location.class, metadata);
    }

}

