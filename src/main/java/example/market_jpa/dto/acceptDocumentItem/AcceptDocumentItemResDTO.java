package example.market_jpa.dto.acceptDocumentItem;

import example.market_jpa.dto.acceptDocument.AcceptDocumentResDTO;
import example.market_jpa.dto.acceptDocument.AcceptDocumentWithDocItemResDTO;
import example.market_jpa.dto.product.ProductResDTO;
import example.market_jpa.dto.product.ProductWithDocItemResDTO;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AcceptDocumentItemResDTO {
    private Long id;
    private AcceptDocumentWithDocItemResDTO acceptDocument;
    private ProductWithDocItemResDTO product;
    private Double comePrice;
    private Long count;
}
