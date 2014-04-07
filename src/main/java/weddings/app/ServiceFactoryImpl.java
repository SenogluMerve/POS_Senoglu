package weddings.app;

import java.util.HashMap;

import weddings.repository.jpa.PersistenceFactory;
import weddings.service.jpa.CustomerServiceJpa;
import weddings.service.jpa.ServiceJpa;
import weddings.service.jpa.ServiceJpaFactory;

public class ServiceFactoryImpl implements ServiceJpaFactory {

    private final HashMap<Class<?>, ServiceJpa> services = new HashMap<>();

    private PersistenceFactory persistenceFactory;

    public ServiceFactoryImpl(PersistenceFactory persistenceFactory) {
        this.persistenceFactory = persistenceFactory;
    }

    @Override
    public CustomerServiceJpa customerServiceJpa() {
		return null;
/*        CustomerServiceJpa customerServiceJpa = new CustomerServiceJpa();
        customerServiceJpa.createNewCustomer((persistenceFactory.customerJpaRepository());
        customerServiceJpa.setTeachingUnitJpaRepository(persistenceFactory.teachingUnitJpaRepository());
        return customerServiceJpa; //methode implementieren
  */  }

}
