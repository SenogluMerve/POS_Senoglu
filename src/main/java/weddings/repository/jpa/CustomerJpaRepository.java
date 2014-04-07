package weddings.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import weddings.domain.Customer;

@Repository
public class CustomerJpaRepository extends AbstractJpaRepository<Customer>{

	protected EntityManager em;
	
	@Override
	public List<Customer> findAll() 
	{
		TypedQuery<Customer> query = em.createQuery("SELECT c FROM Customer c", Customer.class);
		return query.getResultList();
	}

	@Override
	public Customer findById(Long id) {
		return em.find(Customer.class, id);
	}

}
