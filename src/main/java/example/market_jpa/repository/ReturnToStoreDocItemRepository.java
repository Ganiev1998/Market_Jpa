package example.market_jpa.repository;

import example.market_jpa.entity.ReturnToStoreDocItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnToStoreDocItemRepository extends JpaRepository<ReturnToStoreDocItem,Long> {
}
