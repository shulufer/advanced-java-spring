package platform.codingnomads.co.springsecurity.authorization.custompermissions.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMyGrantedAuthority is a Querydsl query type for MyGrantedAuthority
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMyGrantedAuthority extends EntityPathBase<MyGrantedAuthority> {

    private static final long serialVersionUID = 788188516L;

    public static final QMyGrantedAuthority myGrantedAuthority = new QMyGrantedAuthority("myGrantedAuthority");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> objectId = createNumber("objectId", Long.class);

    public final StringPath objectType = createString("objectType");

    public final StringPath permission = createString("permission");

    public QMyGrantedAuthority(String variable) {
        super(MyGrantedAuthority.class, forVariable(variable));
    }

    public QMyGrantedAuthority(Path<? extends MyGrantedAuthority> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMyGrantedAuthority(PathMetadata metadata) {
        super(MyGrantedAuthority.class, metadata);
    }

}

