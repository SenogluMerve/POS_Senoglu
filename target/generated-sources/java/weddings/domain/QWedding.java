package weddings.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QWedding is a Querydsl query type for Wedding
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QWedding extends EntityPathBase<Wedding> {

    private static final long serialVersionUID = 1269337657;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWedding wedding = new QWedding("wedding");

    public final QBasePersistable _super = new QBasePersistable(this);

    public final QCustomer customer;

    public final ComparablePath<java.util.GregorianCalendar> day = createComparable("day", java.util.GregorianCalendar.class);

    public final NumberPath<Integer> discount = createNumber("discount", Integer.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final SimplePath<org.slf4j.Logger> log = createSimple("log", org.slf4j.Logger.class);

    public final QTheme theme;

    public final QWeddingHall weddingHall;

    public QWedding(String variable) {
        this(Wedding.class, forVariable(variable), INITS);
    }

    public QWedding(Path<? extends Wedding> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QWedding(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QWedding(PathMetadata<?> metadata, PathInits inits) {
        this(Wedding.class, metadata, inits);
    }

    public QWedding(Class<? extends Wedding> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer")) : null;
        this.theme = inits.isInitialized("theme") ? new QTheme(forProperty("theme")) : null;
        this.weddingHall = inits.isInitialized("weddingHall") ? new QWeddingHall(forProperty("weddingHall")) : null;
    }

}

