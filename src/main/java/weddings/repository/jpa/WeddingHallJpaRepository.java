package weddings.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import weddings.domain.WeddingHall;

@Repository
public class WeddingHallJpaRepository extends AbstractJpaRepository<WeddingHall>{
	
	protected EntityManager em;
	
	@Override
	public List<WeddingHall> findAll() {
		TypedQuery<WeddingHall> query = em.createQuery("SELECT w FROM WeddingHall w", WeddingHall.class);
		return query.getResultList();
	}

	@Override
	public WeddingHall findById(Long id) {
		return em.find(WeddingHall.class, id);
	}

}
