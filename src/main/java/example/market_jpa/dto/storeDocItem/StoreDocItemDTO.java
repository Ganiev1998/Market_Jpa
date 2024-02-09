package example.market_jpa.dto.storeDocItem;

import example.market_jpa.dto.storeDocument.StoreDocumentDTO;
import example.market_jpa.dto.storeProduct.StoreProductDTO;
import example.market_jpa.entity.StoreDocument;
import example.market_jpa.entity.StoreProduct;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StoreDocItemDTO {
    private StoreDocumentDTO storeDocument;
    private StoreProductDTO storeProduct;
    private Long count;
}
