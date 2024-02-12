package example.market_jpa.dto.returnToWarehouseDocItem;

import example.market_jpa.dto.product.ProductDTO;
import example.market_jpa.dto.returnToWarehouseDoc.ReturnToWarehouseDocDTO;
import example.market_jpa.dto.storeProduct.StoreProductDTO;
import example.market_jpa.entity.Product;
import example.market_jpa.entity.ReturnToWarehouseDoc;
import example.market_jpa.entity.StoreProduct;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReturnToWarehouseDocItemDTO {
    private ReturnToWarehouseDocDTO doc;
    private StoreProductDTO storeProduct;
    private ProductDTO product;
    private Long count;
}
