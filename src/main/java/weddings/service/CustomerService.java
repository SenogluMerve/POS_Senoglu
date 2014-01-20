package weddings.service;


import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import weddings.domain.Customer;


public class CustomerService {
	
	protected EntityManager em;
	
	public Customer createKunde(String firstname, String lastname, GregorianCalendar birthdate, String address) {
		Customer cu = new Customer(firstname, lastname, birthdate, address);
//		cu.setVorname(firstname);
//		cu.setNachname(lastname);
//		cu.setGeburtsdatum(birthdate);
//		cu.setAdresse(address);
		return cu;
	}

	public void removeKunde(int id) {
		Customer ku = findKunde(id);
		if (ku != null) {
			em.remove(ku);
		}
	}

	public Customer findKunde(int id) {
		return em.find(Customer.class, id);
	}

	public List<Customer> findAllKunden() {
		TypedQuery<Customer> query = em.createQuery("SELECT k FROM Kunde k",
				Customer.class);
		return query.getResultList();
	}
}
