package platform.codingnomads.co.springsecurity.recipeapi.models.securitymodels;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCustomUserDetails is a Querydsl query type for CustomUserDetails
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCustomUserDetails extends EntityPathBase<CustomUserDetails> {

    private static final long serialVersionUID = -662915168L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCustomUserDetails customUserDetails = new QCustomUserDetails("customUserDetails");

    public final CollectionPath<Role, QRole> authorities = this.<Role, QRole>createCollection("authorities", Role.class, QRole.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isAccountNonExpired = createBoolean("isAccountNonExpired");

    public final BooleanPath isAccountNonLocked = createBoolean("isAccountNonLocked");

    public final BooleanPath isCredentialsNonExpired = createBoolean("isCredentialsNonExpired");

    public final BooleanPath isEnabled = createBoolean("isEnabled");

    public final StringPath password = createString("password");

    public final platform.codingnomads.co.springsecurity.recipeapi.models.QUserMeta userMeta;

    public final StringPath username = createString("username");

    public QCustomUserDetails(String variable) {
        this(CustomUserDetails.class, forVariable(variable), INITS);
    }

    public QCustomUserDetails(Path<? extends CustomUserDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCustomUserDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCustomUserDetails(PathMetadata metadata, PathInits inits) {
        this(CustomUserDetails.class, metadata, inits);
    }

    public QCustomUserDetails(Class<? extends CustomUserDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userMeta = inits.isInitialized("userMeta") ? new platform.codingnomads.co.springsecurity.recipeapi.models.QUserMeta(forProperty("userMeta")) : null;
    }

}

