package example.market_jpa.repository;

import example.market_jpa.entity.AcceptDocumentItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcceptDocumentItemRepository extends JpaRepository<AcceptDocumentItem,Long> {
}
