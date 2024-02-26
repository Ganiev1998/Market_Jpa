package example.market_jpa.dto.acceptDocument;

import example.market_jpa.dto.acceptDocumentItem.AcceptDocumentItemResDTO;
import example.market_jpa.dto.acceptDocumentItem.AcceptDocumentItemWithDocResDTO;
import example.market_jpa.dto.company.CompanyResDTO;
import example.market_jpa.entity.AcceptDocumentItem;
import example.market_jpa.entity.DocStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AcceptDocumentResDTO {
    private Long id;
    private String docNumber;
    private CompanyResDTO company;
    private Date date;
    private DocStatus status;
    private List<AcceptDocumentItemWithDocResDTO> documentItems;
}
