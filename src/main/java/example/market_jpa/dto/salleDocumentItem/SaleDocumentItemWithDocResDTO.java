package example.market_jpa.dto.salleDocumentItem;

import example.market_jpa.dto.saleDocument.SaleDocumentResDTO;
import example.market_jpa.dto.storeProduct.StoreProductResDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SaleDocumentItemWithDocResDTO {
    private Long id;
    private StoreProductResDTO storeProduct;
    private Long count;
    private Double price;
}
