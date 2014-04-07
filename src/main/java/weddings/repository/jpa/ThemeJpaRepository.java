package weddings.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import weddings.domain.Theme;

@Repository
public class ThemeJpaRepository extends AbstractJpaRepository<Theme> {

	protected EntityManager em;
	
	@Override
	public List<Theme> findAll() {
		TypedQuery<Theme> query = em.createQuery("SELECT t FROM Theme t", Theme.class);
		return query.getResultList();
	}
	
	@Override
	public Theme findById(Long id) {
		return em.find(Theme.class, id);
	}

}
