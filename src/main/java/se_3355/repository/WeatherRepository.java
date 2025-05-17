package se_3355.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se_3355.entity.Weather;

public interface WeatherRepository extends JpaRepository<Weather, Long> {
}
