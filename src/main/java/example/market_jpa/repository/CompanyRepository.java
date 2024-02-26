package example.market_jpa.repository;

import example.market_jpa.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Long> {
    public Company findByCompanyName(String company);
}
