package se_3355.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se_3355.entity.News;

public interface NewsRepository extends JpaRepository<News, Long> {
}
