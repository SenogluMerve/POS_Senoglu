package weddings.domain;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CustomerTest extends AbstractDomainPersistenceTest {
    @Test
    public void persistClassRoom() {
        // given
        Customer customer = new Customer("Neuer", "Kunde", "1140");
        assertThat(customer.getId(), is(nullValue()));
        // when
        entityManager().persist(customer);
        // then
        assertThat(customer.getId(), is(notNullValue()));
    }
}
