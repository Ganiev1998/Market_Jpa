package example.market_jpa.repository;

import example.market_jpa.dto.report.income.FullIncomeResDTO;
import example.market_jpa.entity.SaleDocument;
import example.market_jpa.projection.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface SaleDocumentRepository extends JpaRepository<SaleDocument,Long> {
    public List<SaleDocument> findByAndDateBetween(Date fromDate, Date toDate);
    @Query(value = "select d.pay_type,sum(s.count*p.price) as amount,d.date from sale_document d\n" +
            "left join sale_document_item s on d.id = s.sale_document_id left join\n" +
            "    store_product sp on s.store_product_id = sp.id left join product pr\n" +
            "    on sp.product_id = pr.id left join product_price p on pr.id = p.product_id\n" +
            "    where d.date between '2024-02-01' and '2024-02-29' and d.status = 'DONE'\n" +
            "    group by d.date,d.pay_type",nativeQuery = true)
    public List<Income> incomeByDateNative(Date from,Date to);


}
