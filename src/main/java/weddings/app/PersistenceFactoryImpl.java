package weddings.app;

import java.util.HashMap;

import javax.persistence.EntityManager;

import weddings.repository.jpa.CustomerJpaRepository;
import weddings.repository.jpa.JpaRepository;
import weddings.repository.jpa.PersistenceFactory;
import weddings.repository.jpa.ThemeJpaRepository;
import weddings.repository.jpa.WeddingHallJpaRepository;
import weddings.repository.jpa.WeddingJpaRepository;

public class PersistenceFactoryImpl implements PersistenceFactory {

    private final HashMap<Class<?>, JpaRepository> repositories = new HashMap<>();

    public PersistenceFactoryImpl(EntityManager entityManager) {
        CustomerJpaRepository customerJpaRepository = new CustomerJpaRepository();
        customerJpaRepository.setEntityManager(entityManager);
        repositories.put(CustomerJpaRepository.class, customerJpaRepository);

        ThemeJpaRepository themeJpaRepository = new ThemeJpaRepository();
        themeJpaRepository.setEntityManager(entityManager);
        repositories.put(ThemeJpaRepository.class, themeJpaRepository);

        WeddingHallJpaRepository weddingHallJpaRepository = new WeddingHallJpaRepository();
        weddingHallJpaRepository.setEntityManager(entityManager);
        repositories.put(WeddingHallJpaRepository.class, weddingHallJpaRepository);

        WeddingJpaRepository weddingJpaRepository = new WeddingJpaRepository();
        weddingJpaRepository.setEntityManager(entityManager);
        repositories.put(WeddingJpaRepository.class, weddingJpaRepository);
    }

	@Override
	public CustomerJpaRepository customerJpaRepository() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ThemeJpaRepository themeJpaRepository() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WeddingHallJpaRepository weddingHallJpaRepository() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WeddingJpaRepository weddingJpaRepository() {
		// TODO Auto-generated method stub
		return null;
	}
    
    
}
