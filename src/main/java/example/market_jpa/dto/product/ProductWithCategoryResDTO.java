package example.market_jpa.dto.product;

import example.market_jpa.dto.Measure.MeasureResDTO;
import example.market_jpa.dto.acceptDocumentItem.AcceptDocumentItemWithProductResDTO;
import example.market_jpa.dto.category.CategoryResDTO;
import lombok.*;

import java.util.List;
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductWithCategoryResDTO {
    private Long id;
    private String productName;
    private MeasureResDTO measure;
    private Long amount;
}
