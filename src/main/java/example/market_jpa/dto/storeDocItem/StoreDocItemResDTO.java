package example.market_jpa.dto.storeDocItem;

import example.market_jpa.dto.storeDocument.StoreDocumentDTO;
import example.market_jpa.dto.storeDocument.StoreDocumentResDTO;
import example.market_jpa.dto.storeProduct.StoreProductDTO;
import example.market_jpa.dto.storeProduct.StoreProductResDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StoreDocItemResDTO {
    private Long id;
    private StoreDocumentResDTO storeDocument;
    private StoreProductResDTO storeProduct;
    private Long count;
}
