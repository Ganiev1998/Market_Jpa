package example.market_jpa.repository;

import example.market_jpa.entity.ReturnToWarehouseDocItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnToWarehouseDocItemRepository extends JpaRepository<ReturnToWarehouseDocItem,Long> {
}
