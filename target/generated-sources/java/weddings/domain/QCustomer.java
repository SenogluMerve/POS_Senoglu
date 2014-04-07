package weddings.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCustomer is a Querydsl query type for Customer
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCustomer extends EntityPathBase<Customer> {

    private static final long serialVersionUID = 1957841817;

    public static final QCustomer customer = new QCustomer("customer");

    public final QBasePersistable _super = new QBasePersistable(this);

    public final StringPath address = createString("address");

    public final NumberPath<Integer> customerid = createNumber("customerid", Integer.class);

    public final StringPath firstname = createString("firstname");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath lastname = createString("lastname");

    public final CollectionPath<Wedding, QWedding> weddings = this.<Wedding, QWedding>createCollection("weddings", Wedding.class, QWedding.class, PathInits.DIRECT2);

    public QCustomer(String variable) {
        super(Customer.class, forVariable(variable));
    }

    public QCustomer(Path<? extends Customer> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCustomer(PathMetadata<?> metadata) {
        super(Customer.class, metadata);
    }

}

