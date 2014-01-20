package weddings.repository;

import java.util.List;

import weddings.domain.Customer;

public interface CustomerRepositoryCustom {

    List<Customer> findWithQueryDsl(String lastname);

    List<Customer> findWithJqlQuery(String lastname);

    List<Customer> findWithCriteriaApi(String lastname);
}
