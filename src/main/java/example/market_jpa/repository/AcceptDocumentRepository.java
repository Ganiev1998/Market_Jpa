package example.market_jpa.repository;

import example.market_jpa.dto.report.outlay.OutlayResDTO;
import example.market_jpa.entity.AcceptDocument;
import example.market_jpa.entity.Company;
import example.market_jpa.entity.DocStatus;
import example.market_jpa.projection.OutLay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface AcceptDocumentRepository extends JpaRepository<AcceptDocument,Long> {
    public List<AcceptDocument> findByCompanyAndDateBetweenAndStatus(Company company, Date fromDate, Date toDate, DocStatus status);
    public List<AcceptDocument> findByAndDateBetweenAndStatus(Date fromDate,Date toDate,DocStatus status);
    @Query(value = "select c.company_name,sum(d.come_price*d.count) as amount,a.date\n" +
            "from accept_document a left join company c on a.company_id = c.id\n" +
            "left join accept_document_item d on a.id = d.accept_document_id\n" +
            "where c.company_name = ? and a.status = 'DONE' and a.date between " +
            "? and ? group by c.company_name,a.date order by a.date",nativeQuery = true)
    List<OutLay> outlayByCompanyNative(String company_name,Date from,Date to);
    @Query(value = "select c.company_name,sum(d.come_price*d.count) as amount,a.date\n" +
            "from accept_document a left join company c on a.company_id = c.id\n" +
            "left join accept_document_item d on a.id = d.accept_document_id\n" +
            "where a.date between ? and ? and a.status = 'DONE' group by c.company_name,\n" +
            "a.date order by a.date",nativeQuery = true)
    List<OutLay> outlayByDateNative(Date from,Date to);
}

