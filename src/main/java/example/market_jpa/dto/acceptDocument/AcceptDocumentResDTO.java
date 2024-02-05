package example.market_jpa.dto.acceptDocument;

import example.market_jpa.dto.company.CompanyResDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AcceptDocumentResDTO {
    private Long id;
    private Long docNumber;
    private CompanyResDTO company;
    private Date date;
}
