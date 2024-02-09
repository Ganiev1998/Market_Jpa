package example.market_jpa.dto.acceptDocumentItem;

import example.market_jpa.dto.acceptDocument.AcceptDocumentResDTO;
import example.market_jpa.dto.product.ProductResDTO;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AcceptDocumentItemResDTO {
    private Long id;
    private AcceptDocumentResDTO acceptDocument;
    private Double comePrice;
    private Long count;
}
