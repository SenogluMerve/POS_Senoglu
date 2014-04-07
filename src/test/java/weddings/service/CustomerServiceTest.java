package weddings.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;


@ContextConfiguration(classes = ServiceTestConfiguration.class)
public class CustomerServiceTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    CustomerService customerService;

    @Test
    public void aTest() {
        Assert.assertNotNull(customerService);
    }
}
