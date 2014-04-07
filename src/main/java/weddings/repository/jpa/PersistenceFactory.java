package weddings.repository.jpa;

/**
 * A factory specification to create the JPA repositories.
 */
public interface PersistenceFactory {

    CustomerJpaRepository customerJpaRepository();

    ThemeJpaRepository themeJpaRepository();

    WeddingHallJpaRepository weddingHallJpaRepository();

    WeddingJpaRepository weddingJpaRepository();

}