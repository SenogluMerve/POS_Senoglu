package weddings.webapp.customer;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import weddings.domain.Customer;
import weddings.repository.CustomerRepository;


public class CustomerForm extends Form<Customer> {
    protected final Logger logger = LoggerFactory.getLogger(getClass());
    private List<Customer> customerList;
    
    @SpringBean
    private CustomerRepository teacherRepository;

    public CustomerForm(String id, List<Customer> customerList) {
    	super(id, new CompoundPropertyModel<Customer>(new Customer("Merve", "Senoglu", "Liesing")));
        add(new TextField<>("firstName"));
        add(new TextField<>("lastName"));
        add(new TextField<>("address"));
        this.customerList = customerList;
    }

    @Override
    public final void onSubmit() {
        Customer customer = getModelObject();
        customerRepository.save(customer);
       	customerList.add(0, customer);
    }
}
