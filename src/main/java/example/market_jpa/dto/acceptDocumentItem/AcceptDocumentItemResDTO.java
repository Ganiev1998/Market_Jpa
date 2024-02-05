package example.market_jpa.dto.acceptDocumentItem;

import example.market_jpa.dto.acceptDocument.AcceptDocumentResDTO;
import example.market_jpa.dto.product.ProductResDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AcceptDocumentItemResDTO {
    private Long id;
    private AcceptDocumentResDTO acceptDocument;
    private ProductResDTO product;
    private Double comePrice;
    private Long count;
}
