package weddings.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import weddings.domain.Customer;

import com.mysema.query.jpa.impl.JPAQuery;

@ContextConfiguration(classes = RepositoryTestConfiguration.class)
public class WhenUsingQueryDslTest extends AbstractJUnit4SpringContextTests {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    CustomerRepository customerRepository;

    @Before
    public void setup() {
        customerRepository.deleteAll();
    }

    @Test
    public void testFindByBuilding() {
        // given
        customerRepository.save(new Customer("Mer", "Sen", "1150"));
        customerRepository.save(new Customer("Merv", "Seno", "1160"));
        customerRepository.save(new Customer("Merve", "Senog", "1170"));

        // when
        JPAQuery query = new JPAQuery(entityManager);
        QCustomer customer = QCustomer.customer;

        query.from(customer).
                where(customer.building.eq("Seno")).
                orderBy(customer.name.asc());

        Customer result = query.singleResult(customer);

        // then
        Assert.assertNotNull(result);
        Assert.assertEquals("Seno", result.getVorname());
    }

    @Test
    public void testFindByFloorAndBuilding() {
        // given
    	customerRepository.save(new Customer("Mer", "Sen", "1150"));
        customerRepository.save(new Customer("Merv", "Seno", "1160"));
        customerRepository.save(new Customer("Merve", "Senog", "1170"));

        // when
        JPAQuery query = new JPAQuery(entityManager);
        query.from(QCustomer.classRoom).
                where(QCustomer.customer.floor.eq("1160").
                        and(QCustomer.classRoom.building.eq("Seno")));

        List<Customer> customers = query.list(QCustomer.customer);

        Assert.assertNotNull(customers.get(0));
    }
}
