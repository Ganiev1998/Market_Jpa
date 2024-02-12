package example.market_jpa.dto.acceptDocumentItem;

import example.market_jpa.dto.product.ProductResDTO;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AcceptDocumentItemWithDocResDTO {
    private Long id;
    private ProductResDTO product;
    private Double comePrice;
    private Long count;
}
