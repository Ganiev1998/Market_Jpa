package example.market_jpa.dto.category;

import example.market_jpa.dto.product.ProductWithCategoryResDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryWithProductResDTO {
    private Long id;
    private String categoryName;
}
