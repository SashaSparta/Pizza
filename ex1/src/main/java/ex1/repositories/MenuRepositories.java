package ex1.repositories;
import java.util.List;
import ex1.models.Menu;
import org.springframework.data.repository.CrudRepository;

public interface MenuRepositories extends CrudRepository<Menu, Long> {
	
	
	List<Menu> findFirst10ByIdNotIn(List<Long> menus);
	
}