package example.market_jpa.repository;

import example.market_jpa.entity.SaleDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleDocumentRepository extends JpaRepository<SaleDocument,Long> {
}
