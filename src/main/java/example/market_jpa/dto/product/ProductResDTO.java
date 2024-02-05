package example.market_jpa.dto.product;

import example.market_jpa.dto.Measure.MeasureResDTO;
import example.market_jpa.dto.category.CategoryResDTO;
import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductResDTO {
    private Long id;
    private String productName;
    private CategoryResDTO category;
    private MeasureResDTO measure;
    private Long amount;
}
