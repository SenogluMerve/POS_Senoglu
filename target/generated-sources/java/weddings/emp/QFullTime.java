package weddings.emp;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QFullTime is a Querydsl query type for FullTime
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QFullTime extends EntityPathBase<FullTime> {

    private static final long serialVersionUID = 526405745;

    public static final QFullTime fullTime = new QFullTime("fullTime");

    public final QWeddingPlanner _super = new QWeddingPlanner(this);

    //inherited
    public final NumberPath<Integer> age = _super.age;

    public final NumberPath<Integer> hours = createNumber("hours", Integer.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    public final NumberPath<Long> salary = createNumber("salary", Long.class);

    //inherited
    public final DateTimePath<java.util.Date> startDate = _super.startDate;

    //inherited
    public final NumberPath<Integer> vacationDays = _super.vacationDays;

    public QFullTime(String variable) {
        super(FullTime.class, forVariable(variable));
    }

    public QFullTime(Path<? extends FullTime> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFullTime(PathMetadata<?> metadata) {
        super(FullTime.class, metadata);
    }

}

