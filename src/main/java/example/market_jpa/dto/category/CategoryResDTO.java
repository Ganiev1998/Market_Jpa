package example.market_jpa.dto.category;

import example.market_jpa.dto.product.ProductResDTO;
import example.market_jpa.dto.product.ProductWithCategoryResDTO;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryResDTO {
    private Long id;
    private String categoryName;
    private List<ProductWithCategoryResDTO> products;
}
