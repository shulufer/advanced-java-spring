package platform.codingnomads.co.springweb.wrappingup.multipartdata.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QDatabaseFile is a Querydsl query type for DatabaseFile
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDatabaseFile extends EntityPathBase<DatabaseFile> {

    private static final long serialVersionUID = -850471504L;

    public static final QDatabaseFile databaseFile = new QDatabaseFile("databaseFile");

    public final ArrayPath<byte[], Byte> data = createArray("data", byte[].class);

    public final StringPath fileName = createString("fileName");

    public final StringPath fileType = createString("fileType");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> size = createNumber("size", Long.class);

    public QDatabaseFile(String variable) {
        super(DatabaseFile.class, forVariable(variable));
    }

    public QDatabaseFile(Path<? extends DatabaseFile> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDatabaseFile(PathMetadata metadata) {
        super(DatabaseFile.class, metadata);
    }

}

