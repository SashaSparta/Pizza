package ex1.repositories;
import java.util.List;
import ex1.models.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotoRepositories extends CrudRepository<Photo, Long> {
	
	
	List<Photo> findFirst10ByIdNotIn(List<Long> photos);
	
}
