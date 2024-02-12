package example.market_jpa.dto.acceptDocument;

import example.market_jpa.dto.acceptDocumentItem.AcceptDocumentItemWithDocResDTO;
import example.market_jpa.dto.company.CompanyResDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AcceptDocumentWithDocItemResDTO {
    private Long id;
    private String docNumber;
    private CompanyResDTO company;
    private Date date;
}

