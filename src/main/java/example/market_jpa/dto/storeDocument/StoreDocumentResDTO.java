package example.market_jpa.dto.storeDocument;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StoreDocumentResDTO {
    private Long id;
    private String docNumber;
    private Date date;
}
