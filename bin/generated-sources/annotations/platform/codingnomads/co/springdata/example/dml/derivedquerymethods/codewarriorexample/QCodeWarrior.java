package platform.codingnomads.co.springdata.example.dml.derivedquerymethods.codewarriorexample;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCodeWarrior is a Querydsl query type for CodeWarrior
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCodeWarrior extends EntityPathBase<CodeWarrior> {

    private static final long serialVersionUID = 1753906604L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCodeWarrior codeWarrior = new QCodeWarrior("codeWarrior");

    public final BooleanPath active = createBoolean("active");

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final QEmailAddress emailAddress;

    public final StringPath firstName = createString("firstName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastName = createString("lastName");

    public QCodeWarrior(String variable) {
        this(CodeWarrior.class, forVariable(variable), INITS);
    }

    public QCodeWarrior(Path<? extends CodeWarrior> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCodeWarrior(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCodeWarrior(PathMetadata metadata, PathInits inits) {
        this(CodeWarrior.class, metadata, inits);
    }

    public QCodeWarrior(Class<? extends CodeWarrior> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.emailAddress = inits.isInitialized("emailAddress") ? new QEmailAddress(forProperty("emailAddress")) : null;
    }

}

