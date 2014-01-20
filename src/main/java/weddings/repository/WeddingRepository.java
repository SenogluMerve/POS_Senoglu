package weddings.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import weddings.domain.Wedding;

@Repository
public interface WeddingRepository extends CrudRepository<Wedding, Long> {

}
