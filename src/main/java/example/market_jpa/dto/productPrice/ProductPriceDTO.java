package example.market_jpa.dto.productPrice;

import example.market_jpa.dto.product.ProductDTO;
import example.market_jpa.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductPriceDTO {
    private ProductDTO product;
    private Double price;
    private Date date;
    private Boolean status;
}
