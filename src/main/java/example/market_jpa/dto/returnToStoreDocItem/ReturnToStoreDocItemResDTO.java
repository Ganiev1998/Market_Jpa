package example.market_jpa.dto.returnToStoreDocItem;

import example.market_jpa.dto.returnToStoreDoc.ReturnToStoreDocDTO;
import example.market_jpa.dto.returnToStoreDoc.ReturnToStoreDocResDTO;
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
public class ReturnToStoreDocItemResDTO {
    private Long id;
    private ReturnToStoreDocResDTO doc;
    private StoreProductResDTO product;
    private Long count;
}
