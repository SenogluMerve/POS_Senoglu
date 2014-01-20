package weddings.emp;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QWeddingPlanner is a Querydsl query type for WeddingPlanner
 */
@Generated("com.mysema.query.codegen.SupertypeSerializer")
public class QWeddingPlanner extends EntityPathBase<WeddingPlanner> {

    private static final long serialVersionUID = 2103718035;

    public static final QWeddingPlanner weddingPlanner = new QWeddingPlanner("weddingPlanner");

    public final QEmployee _super = new QEmployee(this);

    //inherited
    public final NumberPath<Integer> age = _super.age;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    //inherited
    public final DateTimePath<java.util.Date> startDate = _super.startDate;

    public final NumberPath<Integer> vacationDays = createNumber("vacationDays", Integer.class);

    public QWeddingPlanner(String variable) {
        super(WeddingPlanner.class, forVariable(variable));
    }

    public QWeddingPlanner(Path<? extends WeddingPlanner> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWeddingPlanner(PathMetadata<?> metadata) {
        super(WeddingPlanner.class, metadata);
    }

}

