package weddings.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import weddings.domain.WeddingHall;

@Repository
public interface WeddingHallRepository extends CrudRepository<WeddingHall,Long>{
	WeddingHall findByCostsPerHour(int costsPerHour);
}
