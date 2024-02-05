package example.market_jpa.dto.acceptDocumentItem;

import example.market_jpa.dto.acceptDocument.AcceptDocumentDTO;
import example.market_jpa.dto.product.ProductDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AcceptDocumentItemDTO {
    private AcceptDocumentDTO acceptDocument;
    private ProductDTO product;
    private Double comePrice;
    private Long count;
}
