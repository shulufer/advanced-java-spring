package platform.codingnomads.co.springdata.example.dml.lifecyclecallback;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QGrantedAuthority is a Querydsl query type for GrantedAuthority
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QGrantedAuthority extends EntityPathBase<GrantedAuthority> {

    private static final long serialVersionUID = 2126020496L;

    public static final QGrantedAuthority grantedAuthority = new QGrantedAuthority("grantedAuthority");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> objectId = createNumber("objectId", Long.class);

    public final StringPath objectType = createString("objectType");

    public final StringPath permission = createString("permission");

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public QGrantedAuthority(String variable) {
        super(GrantedAuthority.class, forVariable(variable));
    }

    public QGrantedAuthority(Path<? extends GrantedAuthority> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGrantedAuthority(PathMetadata metadata) {
        super(GrantedAuthority.class, metadata);
    }

}

