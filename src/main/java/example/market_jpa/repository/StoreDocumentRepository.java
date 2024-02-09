package example.market_jpa.repository;

import example.market_jpa.entity.StoreDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreDocumentRepository extends JpaRepository<StoreDocument,Long> {
}
