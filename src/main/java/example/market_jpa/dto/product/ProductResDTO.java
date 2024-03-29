package example.market_jpa.dto.product;

import example.market_jpa.dto.Measure.MeasureResDTO;
import example.market_jpa.dto.acceptDocumentItem.AcceptDocumentItemWithProductResDTO;
import example.market_jpa.dto.category.CategoryResDTO;
import example.market_jpa.dto.category.CategoryWithProductResDTO;
import example.market_jpa.dto.productPrice.ProductPriceWithProductResDTO;
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
    private CategoryWithProductResDTO category;
    private MeasureResDTO measure;
    private Long amount;
    //private List<AcceptDocumentItemWithProductResDTO> documentItems;
    private List<ProductPriceWithProductResDTO> price;
}
