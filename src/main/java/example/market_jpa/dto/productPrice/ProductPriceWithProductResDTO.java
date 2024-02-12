package example.market_jpa.dto.productPrice;

import example.market_jpa.dto.product.ProductResDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductPriceWithProductResDTO {
    private Long id;
    private Double price;
    private Date date;
    private Boolean status;
}
