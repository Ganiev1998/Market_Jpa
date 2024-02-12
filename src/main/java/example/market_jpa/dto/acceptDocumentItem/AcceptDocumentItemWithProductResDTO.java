package example.market_jpa.dto.acceptDocumentItem;

import example.market_jpa.dto.acceptDocument.AcceptDocumentResDTO;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AcceptDocumentItemWithProductResDTO {
    private Long id;
    private AcceptDocumentResDTO acceptDocument;
    private Double comePrice;
    private Long count;
}
