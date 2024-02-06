package example.market_jpa.dto.product;

import example.market_jpa.dto.Measure.MeasureResDTO;
import example.market_jpa.dto.category.CategoryResDTO;
import example.market_jpa.entity.AcceptDocumentItem;
import lombok.*;

import java.util.List;

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
    //private List<AcceptDocumentItem> documentItems;
}
