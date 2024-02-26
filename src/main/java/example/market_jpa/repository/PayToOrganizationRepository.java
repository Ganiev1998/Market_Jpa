package example.market_jpa.repository;

import example.market_jpa.entity.PayToOrganization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayToOrganizationRepository extends JpaRepository<PayToOrganization,Long> {
}
