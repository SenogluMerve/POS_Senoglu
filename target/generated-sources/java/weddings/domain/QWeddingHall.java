package weddings.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QWeddingHall is a Querydsl query type for WeddingHall
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QWeddingHall extends EntityPathBase<WeddingHall> {

    private static final long serialVersionUID = 200736274;

    public static final QWeddingHall weddingHall = new QWeddingHall("weddingHall");

    public final QBasePersistable _super = new QBasePersistable(this);

    public final NumberPath<Integer> accommodations = createNumber("accommodations", Integer.class);

    public final NumberPath<Integer> costsPerHour = createNumber("costsPerHour", Integer.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final CollectionPath<Wedding, QWedding> weddings = this.<Wedding, QWedding>createCollection("weddings", Wedding.class, QWedding.class, PathInits.DIRECT2);

    public QWeddingHall(String variable) {
        super(WeddingHall.class, forVariable(variable));
    }

    public QWeddingHall(Path<? extends WeddingHall> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWeddingHall(PathMetadata<?> metadata) {
        super(WeddingHall.class, metadata);
    }

}

