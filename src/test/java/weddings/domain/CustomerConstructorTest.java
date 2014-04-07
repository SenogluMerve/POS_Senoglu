package weddings.domain;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

public class CustomerConstructorTest {

	private String firstname;
	private String lastname;
	private String address;
	
	public CustomerConstructorTest(String firstname, String lastname, String address)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		this.address=address;
	}
	
	@Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{ //
                {null, null, null}, //
                {null, "Test", null}, //
                {null, null, "1230"}, //
                {null, "Lastname", "Address"}};
        return Arrays.asList(data);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new Customer(firstname, lastname, address);
    }
	
}
