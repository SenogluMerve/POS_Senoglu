package weddings.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QTheme is a Querydsl query type for Theme
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTheme extends EntityPathBase<Theme> {

    private static final long serialVersionUID = 1151712238;

    public static final QTheme theme = new QTheme("theme");

    public final QBasePersistable _super = new QBasePersistable(this);

    public final NumberPath<Integer> additionalCharge = createNumber("additionalCharge", Integer.class);

    public final StringPath color = createString("color");

    public final StringPath description = createString("description");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final NumberPath<Integer> themeid = createNumber("themeid", Integer.class);

    public final CollectionPath<Wedding, QWedding> weddings = this.<Wedding, QWedding>createCollection("weddings", Wedding.class, QWedding.class, PathInits.DIRECT2);

    public QTheme(String variable) {
        super(Theme.class, forVariable(variable));
    }

    public QTheme(Path<? extends Theme> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTheme(PathMetadata<?> metadata) {
        super(Theme.class, metadata);
    }

}

