package example.market_jpa.repository;

import example.market_jpa.entity.ReturnToWarehouseDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnToWarehouseDocRepository extends JpaRepository<ReturnToWarehouseDoc,Long> {
}
