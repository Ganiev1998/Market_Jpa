package example.market_jpa.dto.product;

import example.market_jpa.dto.Measure.MeasureResDTO;
import example.market_jpa.dto.acceptDocumentItem.AcceptDocumentItemDTO;
import example.market_jpa.dto.acceptDocumentItem.AcceptDocumentItemResDTO;
import example.market_jpa.dto.category.CategoryResDTO;
import example.market_jpa.entity.AcceptDocumentItem;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductResDTO {
    private Long id;
    private String productName;
    private CategoryResDTO category;
    private MeasureResDTO measure;
    private Long amount;
    private List<AcceptDocumentItemResDTO> documentItems;
}
