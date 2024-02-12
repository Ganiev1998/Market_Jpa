package example.market_jpa.dto.returnToWarehouseDocItem;

import example.market_jpa.dto.product.ProductResDTO;
import example.market_jpa.dto.returnToWarehouseDoc.ReturnToWarehouseDocResDTO;
import example.market_jpa.dto.storeProduct.StoreProductResDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReturnToWarehouseDocItemResDTO {
    private Long id;
    private ReturnToWarehouseDocResDTO doc;
    private StoreProductResDTO storeProduct;
    private ProductResDTO product;
    private Long count;
}
