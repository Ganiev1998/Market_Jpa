package example.market_jpa.repository;

import example.market_jpa.entity.ReturnToStoreDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnToStoreDocRepository extends JpaRepository<ReturnToStoreDoc,Long> {
}
