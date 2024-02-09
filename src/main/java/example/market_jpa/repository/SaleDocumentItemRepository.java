package example.market_jpa.repository;

import example.market_jpa.entity.SaleDocumentItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleDocumentItemRepository extends JpaRepository<SaleDocumentItem,Long> {
}
