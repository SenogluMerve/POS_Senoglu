package weddings.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QHochzeit is a Querydsl query type for Hochzeit
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QHochzeit extends EntityPathBase<Hochzeit> {

    private static final long serialVersionUID = 583075581;

    public static final QHochzeit hochzeit = new QHochzeit("hochzeit");

    public final NumberPath<Integer> ermaessigung = createNumber("ermaessigung", Integer.class);

    public final NumberPath<Integer> kundenid = createNumber("kundenid", Integer.class);

    public final SimplePath<org.slf4j.Logger> log = createSimple("log", org.slf4j.Logger.class);

    public final NumberPath<Integer> saalid = createNumber("saalid", Integer.class);

    public final ComparablePath<java.util.GregorianCalendar> tag = createComparable("tag", java.util.GregorianCalendar.class);

    public final NumberPath<Integer> themenid = createNumber("themenid", Integer.class);

    public QHochzeit(String variable) {
        super(Hochzeit.class, forVariable(variable));
    }

    public QHochzeit(Path<? extends Hochzeit> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHochzeit(PathMetadata<?> metadata) {
        super(Hochzeit.class, metadata);
    }

}

