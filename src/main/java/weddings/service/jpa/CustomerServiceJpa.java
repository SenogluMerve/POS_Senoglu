package weddings.service.jpa;


import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;

import weddings.domain.Customer;

@Service
public class CustomerServiceJpa {
	
	protected EntityManager em;
	
	public Customer createNewCustomer(String firstname, String lastname, GregorianCalendar birthdate, String address) {
		Customer cu = new Customer(firstname, lastname, birthdate, address);
//		cu.setVorname(firstname);
//		cu.setNachname(lastname);
//		cu.setGeburtsdatum(birthdate);
//		cu.setAdresse(address);
		return cu;
	}

	public void removeCustomer(int id) {
		Customer ku = findCustomer(id);
		if (ku != null) {
			em.remove(ku);
		}
	}

	public Customer findCustomer(int id) {
		return em.find(Customer.class, id);
	}

	public List<Customer> findAllCustomers() {
		TypedQuery<Customer> query = em.createQuery("SELECT c FROM Customer c", Customer.class);
		return query.getResultList();
	}
}
