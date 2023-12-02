package platform.codingnomads.co.springdata.example.dml.derivedquerymethods.codewarriorexample;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QEmailAddress is a Querydsl query type for EmailAddress
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEmailAddress extends EntityPathBase<EmailAddress> {

    private static final long serialVersionUID = -761226111L;

    public static final QEmailAddress emailAddress1 = new QEmailAddress("emailAddress1");

    public final StringPath emailAddress = createString("emailAddress");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QEmailAddress(String variable) {
        super(EmailAddress.class, forVariable(variable));
    }

    public QEmailAddress(Path<? extends EmailAddress> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEmailAddress(PathMetadata metadata) {
        super(EmailAddress.class, metadata);
    }

}

