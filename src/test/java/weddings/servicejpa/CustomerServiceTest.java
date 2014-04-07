package weddings.servicejpa;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import weddings.service.jpa.CustomerServiceJpa;


@ContextConfiguration(classes = ServiceTestConfiguration.class)
public class CustomerServiceTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    CustomerServiceJpa customerServiceJpa;

    @Test
    public void aTest() {
        Assert.assertNotNull(customerServiceJpa);
    }
}
