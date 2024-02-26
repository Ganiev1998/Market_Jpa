package example.market_jpa.dto.saleDocument;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SaleDocumentDTO {
    private Long id;
    private String docNumber;
    private Date date;
}