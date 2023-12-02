package platform.codingnomads.co.springtest.testingjsonresponsecontent.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QStep is a Querydsl query type for Step
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStep extends EntityPathBase<Step> {

    private static final long serialVersionUID = -416706892L;

    public static final QStep step = new QStep("step");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> stepNumber = createNumber("stepNumber", Integer.class);

    public QStep(String variable) {
        super(Step.class, forVariable(variable));
    }

    public QStep(Path<? extends Step> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStep(PathMetadata metadata) {
        super(Step.class, metadata);
    }

}

