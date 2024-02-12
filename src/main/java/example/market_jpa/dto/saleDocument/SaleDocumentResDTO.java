package example.market_jpa.dto.saleDocument;

import example.market_jpa.dto.salleDocumentItem.SaleDocumentItemWithDocResDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SaleDocumentResDTO {
    private Long id;
    private String docNumber;
    private Date date;
    private List<SaleDocumentItemWithDocResDTO> documentItems;
}

