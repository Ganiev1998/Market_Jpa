package example.market_jpa.dto.returnToStoreDoc;

import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import example.market_jpa.dto.returnToStoreDocItem.ReturnToStoreDocItemResDTO;
import example.market_jpa.dto.returnToStoreDocItem.ReturnToStoreDocItemWithDocResDTO;
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
public class ReturnToStoreDocResDTO {
    private Long id;
    private String docNumber;
    private Date date;
    private List<ReturnToStoreDocItemWithDocResDTO> docItems;
}
