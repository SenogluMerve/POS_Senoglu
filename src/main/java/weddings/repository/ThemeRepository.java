package weddings.repository;

import org.springframework.data.repository.CrudRepository;

import weddings.domain.Theme;

public interface ThemeRepository extends CrudRepository<Theme, Long>{
	Theme findByColor(String color);

}
