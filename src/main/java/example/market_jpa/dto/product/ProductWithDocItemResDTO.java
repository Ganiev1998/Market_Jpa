package example.market_jpa.dto.product;

import example.market_jpa.dto.Measure.MeasureResDTO;
import example.market_jpa.dto.category.CategoryWithProductResDTO;
import example.market_jpa.dto.productPrice.ProductPriceWithProductResDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithDocItemResDTO {
    private Long id;
    private String productName;
    private CategoryWithProductResDTO category;
    private MeasureResDTO measure;
}
