package example.market_jpa.dto.storeDocItem;

import example.market_jpa.dto.storeDocument.StoreDocumentResDTO;
import example.market_jpa.dto.storeProduct.StoreProductResDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StoreDocItemWithDocResDTO {
    private Long id;
    private StoreProductResDTO storeProduct;
    private Long count;
}
