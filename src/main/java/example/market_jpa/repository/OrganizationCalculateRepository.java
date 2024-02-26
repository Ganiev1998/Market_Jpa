package example.market_jpa.repository;

import example.market_jpa.entity.OrganizationCalculate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationCalculateRepository extends JpaRepository<OrganizationCalculate,Long> {
}
