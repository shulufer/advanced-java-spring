package platform.codingnomads.co.springdata.example.dml.derivedquerymethods.plantexample;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QSoilType is a Querydsl query type for SoilType
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSoilType extends EntityPathBase<SoilType> {

    private static final long serialVersionUID = -496964520L;

    public static final QSoilType soilType = new QSoilType("soilType");

    public final BooleanPath dry = createBoolean("dry");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Long> ph = createNumber("ph", Long.class);

    public QSoilType(String variable) {
        super(SoilType.class, forVariable(variable));
    }

    public QSoilType(Path<? extends SoilType> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSoilType(PathMetadata metadata) {
        super(SoilType.class, metadata);
    }

}

