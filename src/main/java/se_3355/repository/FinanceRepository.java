package se_3355.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se_3355.entity.Finance;

public interface FinanceRepository extends JpaRepository<Finance, Long> {
}
