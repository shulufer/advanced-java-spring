package platform.codingnomads.co.springsecurity.recipeapi.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserMeta is a Querydsl query type for UserMeta
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserMeta extends EntityPathBase<UserMeta> {

    private static final long serialVersionUID = 723386830L;

    public static final QUserMeta userMeta = new QUserMeta("userMeta");

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QUserMeta(String variable) {
        super(UserMeta.class, forVariable(variable));
    }

    public QUserMeta(Path<? extends UserMeta> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserMeta(PathMetadata metadata) {
        super(UserMeta.class, metadata);
    }

}

