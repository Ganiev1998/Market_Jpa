package example.market_jpa.dto.storeProduct;

import example.market_jpa.dto.product.ProductResDTO;
import example.market_jpa.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StoreProductResDTO {
    private Long id;
    private ProductResDTO product;
    private Long amount;
}
