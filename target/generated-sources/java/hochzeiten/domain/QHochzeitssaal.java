package hochzeiten.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QHochzeitssaal is a Querydsl query type for Hochzeitssaal
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QHochzeitssaal extends EntityPathBase<Hochzeitssaal> {

    private static final long serialVersionUID = 1689674435;

    public static final QHochzeitssaal hochzeitssaal = new QHochzeitssaal("hochzeitssaal");

    public final NumberPath<Integer> kostenProStunde = createNumber("kostenProStunde", Integer.class);

    public final NumberPath<Integer> platzPersonen = createNumber("platzPersonen", Integer.class);

    public final NumberPath<Integer> saalid = createNumber("saalid", Integer.class);

    public QHochzeitssaal(String variable) {
        super(Hochzeitssaal.class, forVariable(variable));
    }

    public QHochzeitssaal(Path<? extends Hochzeitssaal> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHochzeitssaal(PathMetadata<?> metadata) {
        super(Hochzeitssaal.class, metadata);
    }

}

