package example.market_jpa.dto.acceptDocument;

import example.market_jpa.dto.acceptDocumentItem.AcceptDocumentItemResDTO;
import example.market_jpa.dto.company.CompanyResDTO;
import lombok.*;

import java.util.Date;
import java.util.List;
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AcceptDocumentwithCompanyResDTO {
    private Long id;
    private String docNumber;
    private Date date;
    private List<AcceptDocumentItemResDTO> documentItems;
}
