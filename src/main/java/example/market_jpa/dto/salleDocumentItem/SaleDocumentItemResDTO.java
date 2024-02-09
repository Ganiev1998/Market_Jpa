package example.market_jpa.dto.salleDocumentItem;

import example.market_jpa.dto.saleDocument.SaleDocumentResDTO;
import example.market_jpa.dto.storeProduct.StoreProductResDTO;
import example.market_jpa.entity.SaleDocument;
import example.market_jpa.entity.StoreProduct;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SaleDocumentItemResDTO {
    private Long id;
    private SaleDocumentResDTO saleDocument;
    private StoreProductResDTO storeProduct;
    private Long count;
    private Double price;
}
