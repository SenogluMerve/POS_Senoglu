package weddings.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import weddings.domain.Customer;


@Repository
public interface CustomerRepository extends 
		CustomerRepositoryCustom,
		JpaRepository<Customer, Long> {

	List<Customer> findByLastName(String lastname);
    List<Customer> findByFirstName(String firstname);
}
