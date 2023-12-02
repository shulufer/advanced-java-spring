package platform.codingnomads.co.springsecurity.authentication.usernamepassword.models;

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

    private static final long serialVersionUID = -38674038L;

    public static final QUserPrincipal userPrincipal = new QUserPrincipal("userPrincipal");

    public final BooleanPath accountNonExpired = createBoolean("accountNonExpired");

    public final BooleanPath accountNonLocked = createBoolean("accountNonLocked");

    public final ListPath<Authority, QAuthority> authorities = this.<Authority, QAuthority>createList("authorities", Authority.class, QAuthority.class, PathInits.DIRECT2);

    public final BooleanPath credentialsNonExpired = createBoolean("credentialsNonExpired");

    public final BooleanPath enabled = createBoolean("enabled");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath password = createString("password");

    public final StringPath username = createString("username");

    public QUserPrincipal(String variable) {
        super(UserPrincipal.class, forVariable(variable));
    }

    public QUserPrincipal(Path<? extends UserPrincipal> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserPrincipal(PathMetadata metadata) {
        super(UserPrincipal.class, metadata);
    }

}

