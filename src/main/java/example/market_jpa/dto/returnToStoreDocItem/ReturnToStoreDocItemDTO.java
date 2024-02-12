package example.market_jpa.dto.returnToStoreDocItem;

import example.market_jpa.dto.returnToStoreDoc.ReturnToStoreDocDTO;
import example.market_jpa.dto.storeProduct.StoreProductDTO;
import example.market_jpa.entity.ReturnToStoreDoc;
import example.market_jpa.entity.StoreProduct;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReturnToStoreDocItemDTO {
    private ReturnToStoreDocDTO doc;
    private StoreProductDTO product;
    private Long count;
}
