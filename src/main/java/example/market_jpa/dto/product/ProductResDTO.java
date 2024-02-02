package example.market_jpa.dto.product;

import example.market_jpa.dto.category.CategoryResDTO;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResDTO {
    private Long id;
    private String productName;
    private CategoryResDTO category_id;
    private Double price;
    private String measure;
    private Long amount;
}
