package platform.codingnomads.co.springdata.example.dml.derivedquerymethods.plantexample;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPlant is a Querydsl query type for Plant
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPlant extends EntityPathBase<Plant> {

    private static final long serialVersionUID = 1263937228L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPlant plant = new QPlant("plant");

    public final QSoilType favoriteSoilType;

    public final BooleanPath fruitBearing = createBoolean("fruitBearing");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> numDaysTillRipeFruit = createNumber("numDaysTillRipeFruit", Integer.class);

    public final StringPath sunType = createString("sunType");

    public QPlant(String variable) {
        this(Plant.class, forVariable(variable), INITS);
    }

    public QPlant(Path<? extends Plant> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPlant(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPlant(PathMetadata metadata, PathInits inits) {
        this(Plant.class, metadata, inits);
    }

    public QPlant(Class<? extends Plant> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.favoriteSoilType = inits.isInitialized("favoriteSoilType") ? new QSoilType(forProperty("favoriteSoilType")) : null;
    }

}

