package platform.codingnomads.co.springdata.example.jpa.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWeapon is a Querydsl query type for Weapon
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWeapon extends EntityPathBase<Weapon> {

    private static final long serialVersionUID = -133919339L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWeapon weapon = new QWeapon("weapon");

    public final QCodeWarrior codeWarrior;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QWeapon(String variable) {
        this(Weapon.class, forVariable(variable), INITS);
    }

    public QWeapon(Path<? extends Weapon> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QWeapon(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QWeapon(PathMetadata metadata, PathInits inits) {
        this(Weapon.class, metadata, inits);
    }

    public QWeapon(Class<? extends Weapon> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.codeWarrior = inits.isInitialized("codeWarrior") ? new QCodeWarrior(forProperty("codeWarrior")) : null;
    }

}

