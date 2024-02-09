package example.market_jpa.dto.salleDocumentItem;

import example.market_jpa.dto.saleDocument.SaleDocumentDTO;
import example.market_jpa.dto.storeProduct.StoreProductDTO;
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
public class SaleDocumentItemDTO {
    private SaleDocumentDTO saleDocument;
    private StoreProductDTO storeProduct;
    private Long count;
    private Double price;
}
