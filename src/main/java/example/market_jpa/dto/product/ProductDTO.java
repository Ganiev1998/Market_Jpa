package example.market_jpa.dto.product;

import example.market_jpa.dto.category.CategoryDTO;
import example.market_jpa.entity.Category;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDTO {
    private String name;
    private CategoryDTO category_id;
    private Double price;
    private String measure;
    private Long amount;
}
