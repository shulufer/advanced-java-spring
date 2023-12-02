package platform.codingnomads.co.springmvc.customerwebsite.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRentalCar is a Querydsl query type for RentalCar
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRentalCar extends EntityPathBase<RentalCar> {

    private static final long serialVersionUID = -790651211L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRentalCar rentalCar = new QRentalCar("rentalCar");

    public final StringPath color = createString("color");

    public final QCustomer customer;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath license = createString("license");

    public final StringPath make = createString("make");

    public final StringPath model = createString("model");

    public QRentalCar(String variable) {
        this(RentalCar.class, forVariable(variable), INITS);
    }

    public QRentalCar(Path<? extends RentalCar> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRentalCar(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRentalCar(PathMetadata metadata, PathInits inits) {
        this(RentalCar.class, metadata, inits);
    }

    public QRentalCar(Class<? extends RentalCar> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer"), inits.get("customer")) : null;
    }

}

