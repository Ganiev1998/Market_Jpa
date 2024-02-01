package example.market_jpa.dto.product;

import example.market_jpa.dto.category.CategoryResDTO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductResDTO {
    private Long id;
    private String name;
    private CategoryResDTO category_id;
    private Double price;
    private String measure;
    private Long amount;
}
