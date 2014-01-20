package hochzeiten.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QKunde is a Querydsl query type for Kunde
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QKunde extends EntityPathBase<Kunde> {

    private static final long serialVersionUID = 349645726;

    public static final QKunde kunde = new QKunde("kunde");

    public final StringPath adresse = createString("adresse");

    public final ComparablePath<java.util.GregorianCalendar> geburtsdatum = createComparable("geburtsdatum", java.util.GregorianCalendar.class);

    public final CollectionPath<Hochzeit, QHochzeit> hochzeiten = this.<Hochzeit, QHochzeit>createCollection("hochzeiten", Hochzeit.class, QHochzeit.class, PathInits.DIRECT2);

    public final NumberPath<Integer> kundenid = createNumber("kundenid", Integer.class);

    public final StringPath nachname = createString("nachname");

    public final StringPath vorname = createString("vorname");

    public QKunde(String variable) {
        super(Kunde.class, forVariable(variable));
    }

    public QKunde(Path<? extends Kunde> path) {
        super(path.getType(), path.getMetadata());
    }

    public QKunde(PathMetadata<?> metadata) {
        super(Kunde.class, metadata);
    }

}

