package weddings.repositoryjpa;

import org.junit.Assert;
import org.junit.Test;

import weddings.domain.Customer;
import weddings.repository.jpa.CustomerJpaRepository;


public class CustomerRepositoryTest extends AbstractJpaRepositoryTest {
    @Test
    public void verifyFindByUnknownId() {
        CustomerJpaRepository customerJpaRepository = new CustomerJpaRepository();
        customerJpaRepository.setEntityManager(entityManager);

        Customer customer = customerJpaRepository.findById(1l);

        Assert.assertNull(customer);
    }

    @Test
    public void verifyFindById() {
        CustomerJpaRepository customerJpaRepository = new CustomerJpaRepository();
        customerJpaRepository.setEntityManager(entityManager);

        Customer customer = new Customer("Merve", "Senoglu", "1150");
        customerJpaRepository.persist(customer);

        Customer customer2 = customerJpaRepository.findById(customer.getId());

        Assert.assertNotNull(customer2);
        Assert.assertEquals(customer, customer2);
    }
}
