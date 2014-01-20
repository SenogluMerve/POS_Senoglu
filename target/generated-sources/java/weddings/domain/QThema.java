package weddings.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QThema is a Querydsl query type for Thema
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QThema extends EntityPathBase<Thema> {

    private static final long serialVersionUID = 1151712234;

    public static final QThema thema = new QThema("thema");

    public final StringPath bezeichnung = createString("bezeichnung");

    public final NumberPath<Integer> extraZuschlag = createNumber("extraZuschlag", Integer.class);

    public final StringPath farbe = createString("farbe");

    public final CollectionPath<Wedding, QWedding> hochzeiten = this.<Wedding, QWedding>createCollection("hochzeiten", Wedding.class, QWedding.class, PathInits.DIRECT2);

    public final NumberPath<Integer> themenid = createNumber("themenid", Integer.class);

    public QThema(String variable) {
        super(Thema.class, forVariable(variable));
    }

    public QThema(Path<? extends Thema> path) {
        super(path.getType(), path.getMetadata());
    }

    public QThema(PathMetadata<?> metadata) {
        super(Thema.class, metadata);
    }

}

