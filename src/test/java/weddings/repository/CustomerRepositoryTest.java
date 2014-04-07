package weddings.repository;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import weddings.domain.Customer;


public class CustomerRepositoryTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    CustomerRepository customerRepository;

    @Before
    public void setup() {
        // remove existing data
        customerRepository.deleteAll();

        // create test data
        customerRepository.save(new Customer("Mer", "Sen", "1150"));
        customerRepository.save(new Customer("Merv", "Seno", "1160"));
        customerRepository.save(new Customer("Merve", "Senog", "1170"));
    }

    @Test
    public void testFindByName() {
        // given

        // when
        List<Customer> byName = customerRepository.findByFirstName("Mer");

        // then
        Assert.assertNotNull(byName);
        Assert.assertEquals(1, byName.size());
        Assert.assertNotNull(byName.get(0));
    }

    @Test
    public void testFindByBuilding() {
        // given

        // when
        List<Customer> byName = customerRepository.findByLastName("Sen");

        // then
        Assert.assertNotNull(byName);
        Assert.assertEquals(1, byName.size());
        Assert.assertNotNull(byName.get(0));
    }

    @Test
    public void testQueryDslQuery() {
        // given

        // when
        List<Customer> byName = customerRepository.findWithQueryDsl("Seno");

        // then
        Assert.assertNotNull(byName);
        Assert.assertEquals(1, byName.size());
        Assert.assertNotNull(byName.get(0));
    }

    @Test
    public void testQueryJpaQuery() {
        // given

        // when
        List<Customer> byNameX = customerRepository.findWithJqlQuery("X");
        List<Customer> byNameSeno = customerRepository.findWithJqlQuery("Seno");

        // then
        Assert.assertNotNull(byNameX);
        Assert.assertEquals(0, byNameX.size());

        Assert.assertNotNull(byNameSeno);
        Assert.assertEquals(1, byNameSeno.size());
        Assert.assertNotNull(byNameSeno.get(0));
    }

    @Test
    public void testQueryCriteriaApi() {
        // given

        // when
        List<Customer> byNameX = customerRepository.findWithCriteriaApi("X");
        List<Customer> byNameSeno = customerRepository.findWithCriteriaApi("Seno");

        // then
        Assert.assertNotNull(byNameX);
        Assert.assertEquals(0, byNameX.size());

        Assert.assertNotNull(byNameSeno);
        Assert.assertEquals(1, byNameSeno.size());
        Assert.assertNotNull(byNameSeno.get(0));
    }
}
