package example.market_jpa.dto.storeProduct;

import example.market_jpa.dto.product.ProductDTO;
import example.market_jpa.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StoreProductDTO {
    private Long id;
    private ProductDTO product;
    private Long amount;
}
