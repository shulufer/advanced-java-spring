package platform.codingnomads.co.springsecurity.authorization.addingauthorization.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserPrincipal is a Querydsl query type for UserPrincipal
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserPrincipal extends EntityPathBase<UserPrincipal> {

    private static final long serialVersionUID = -21300562L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserPrincipal userPrincipal = new QUserPrincipal("userPrincipal");

    public final BooleanPath accountNonExpired = createBoolean("accountNonExpired");

    public final BooleanPath accountNonLocked = createBoolean("accountNonLocked");

    public final ListPath<Authority, QAuthority> authorities = this.<Authority, QAuthority>createList("authorities", Authority.class, QAuthority.class, PathInits.DIRECT2);

    public final BooleanPath credentialsNonExpired = createBoolean("credentialsNonExpired");

    public final BooleanPath enabled = createBoolean("enabled");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath password = createString("password");

    public final QUserMeta userMeta;

    public final StringPath username = createString("username");

    public QUserPrincipal(String variable) {
        this(UserPrincipal.class, forVariable(variable), INITS);
    }

    public QUserPrincipal(Path<? extends UserPrincipal> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUserPrincipal(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUserPrincipal(PathMetadata metadata, PathInits inits) {
        this(UserPrincipal.class, metadata, inits);
    }

    public QUserPrincipal(Class<? extends UserPrincipal> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userMeta = inits.isInitialized("userMeta") ? new QUserMeta(forProperty("userMeta")) : null;
    }

}

