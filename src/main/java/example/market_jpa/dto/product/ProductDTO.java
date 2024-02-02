package example.market_jpa.dto.product;

import example.market_jpa.dto.category.CategoryDTO;
import example.market_jpa.entity.Category;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {
    private String productName;
    private CategoryDTO category_id;
    private Double price;
    private String measure;
    private Long amount;
}
