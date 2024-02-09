package example.market_jpa.dto.product;

import example.market_jpa.dto.Measure.MeasureDTO;
import example.market_jpa.dto.category.CategoryDTO;
import example.market_jpa.entity.AcceptDocumentItem;
import example.market_jpa.entity.Category;
import example.market_jpa.entity.Measurement;
import lombok.*;

import java.util.List;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private String productName;
    private CategoryDTO category;
    private MeasureDTO measure;
    private Long amount;
    //private Set<AcceptDocumentItem> documentItems;
}
