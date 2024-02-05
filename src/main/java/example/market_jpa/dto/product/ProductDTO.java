package example.market_jpa.dto.product;

import example.market_jpa.dto.category.CategoryDTO;
import example.market_jpa.entity.Category;
import example.market_jpa.entity.Measurement;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private String productName;
    private CategoryDTO category;
    private Measurement measure;
    private Long amount;
}
