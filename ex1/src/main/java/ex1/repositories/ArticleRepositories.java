package ex1.repositories;
import java.util.List;
import ex1.models.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepositories extends CrudRepository<Article, Long> {
	
	
	List<Article> findFirst10ByIdNotIn(List<Long> articles);
	
}