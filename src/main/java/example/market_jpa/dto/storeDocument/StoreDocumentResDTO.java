package example.market_jpa.dto.storeDocument;

import example.market_jpa.dto.storeDocItem.StoreDocItemWithDocResDTO;
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
public class StoreDocumentResDTO {
    private Long id;
    private String docNumber;
    private Date date;
    private List<StoreDocItemWithDocResDTO> documentItems;
}
