import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QBasePersistable is a Querydsl query type for BasePersistable
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QBasePersistable extends NumberPath<BasePersistable> {

    private static final long serialVersionUID = 64676221;

    public static final QBasePersistable basePersistable = new QBasePersistable("basePersistable");

    public QBasePersistable(String variable) {
        super(BasePersistable.class, forVariable(variable));
    }

    public QBasePersistable(Path<? extends BasePersistable> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBasePersistable(PathMetadata<?> metadata) {
        super(BasePersistable.class, metadata);
    }

}

