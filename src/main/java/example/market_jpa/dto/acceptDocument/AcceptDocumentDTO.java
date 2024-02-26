package example.market_jpa.dto.acceptDocument;

import example.market_jpa.dto.company.CompanyDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AcceptDocumentDTO {
    private Long id;
    private String docNumber;
    private CompanyDTO company;
    private Date date;

}
