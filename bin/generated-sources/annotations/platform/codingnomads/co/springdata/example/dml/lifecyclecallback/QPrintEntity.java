package platform.codingnomads.co.springdata.example.dml.lifecyclecallback;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPrintEntity is a Querydsl query type for PrintEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPrintEntity extends EntityPathBase<PrintEntity> {

    private static final long serialVersionUID = 1686061864L;

    public static final QPrintEntity printEntity = new QPrintEntity("printEntity");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QPrintEntity(String variable) {
        super(PrintEntity.class, forVariable(variable));
    }

    public QPrintEntity(Path<? extends PrintEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPrintEntity(PathMetadata metadata) {
        super(PrintEntity.class, metadata);
    }

}

