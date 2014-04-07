package weddings.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.mysema.query.jpa.impl.JPAQuery;

import weddings.domain.Customer;
import weddings.repository.CustomerRepositoryCustom;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom{

	@PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Customer> findWithQueryDsl(String building) {
        JPAQuery query = new JPAQuery(entityManager);
        QCustomer customer = QCustomer.customer;

        query.from(customer).
                where(customer.building.eq(building)).
                orderBy(customer.name.asc());

        return query.list(customer);
    }

    @Override
    public List<Customer> findWithJqlQuery(String building) {
        return entityManager.
                createQuery("from Customer where building = :building", Customer.class).
                setParameter("building", building).
                getResultList();
    }

    @Override
    public List<Customer> findWithCriteriaApi(String building) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Customer> query = builder.createQuery(Customer.class);
        Root<Customer> customer = query.from(Customer.class);
        Predicate buildingPredicate = builder.equal(customer.get("building"), building);
        query.where(buildingPredicate);

        return entityManager.
                createQuery(query.select(customer)).
                getResultList();
    }

}
