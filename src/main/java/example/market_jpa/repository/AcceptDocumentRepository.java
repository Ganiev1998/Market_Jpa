package example.market_jpa.repository;

import example.market_jpa.entity.AcceptDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcceptDocumentRepository extends JpaRepository<AcceptDocument,Long> {
}
