package example.market_jpa.repository;

import example.market_jpa.entity.StoreDocumentItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreDocumentItemRepository extends JpaRepository<StoreDocumentItem,Long> {
}
