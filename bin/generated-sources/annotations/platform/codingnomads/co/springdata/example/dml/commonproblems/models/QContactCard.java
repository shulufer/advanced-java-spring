package platform.codingnomads.co.springdata.example.dml.commonproblems.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QContactCard is a Querydsl query type for ContactCard
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QContactCard extends EntityPathBase<ContactCard> {

    private static final long serialVersionUID = -1712351246L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QContactCard contactCard = new QContactCard("contactCard");

    public final StringPath emailAddress = createString("emailAddress");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath phoneNumber = createString("phoneNumber");

    public final QUser user;

    public final StringPath websiteUrl = createString("websiteUrl");

    public QContactCard(String variable) {
        this(ContactCard.class, forVariable(variable), INITS);
    }

    public QContactCard(Path<? extends ContactCard> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QContactCard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QContactCard(PathMetadata metadata, PathInits inits) {
        this(ContactCard.class, metadata, inits);
    }

    public QContactCard(Class<? extends ContactCard> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user"), inits.get("user")) : null;
    }

}

