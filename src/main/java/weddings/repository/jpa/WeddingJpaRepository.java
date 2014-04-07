package weddings.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import weddings.domain.Wedding;

@Repository
public class WeddingJpaRepository extends AbstractJpaRepository<Wedding> {

	protected EntityManager em;
	
	@Override
	public List<Wedding> findAll() {
		TypedQuery<Wedding> query = em.createQuery("SELECT we FROM Wedding we", Wedding.class);
		return query.getResultList();
	}

	@Override
	public Wedding findById(Long id) {
		return em.find(Wedding.class, id);	
	}

}
