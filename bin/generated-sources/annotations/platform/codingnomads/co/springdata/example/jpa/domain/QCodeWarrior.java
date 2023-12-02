package platform.codingnomads.co.springdata.example.jpa.domain;

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

    private static final long serialVersionUID = 770035388L;

    public static final QCodeWarrior codeWarrior = new QCodeWarrior("codeWarrior");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final ListPath<Weapon, QWeapon> weapons = this.<Weapon, QWeapon>createList("weapons", Weapon.class, QWeapon.class, PathInits.DIRECT2);

    public QCodeWarrior(String variable) {
        super(CodeWarrior.class, forVariable(variable));
    }

    public QCodeWarrior(Path<? extends CodeWarrior> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCodeWarrior(PathMetadata metadata) {
        super(CodeWarrior.class, metadata);
    }

}

