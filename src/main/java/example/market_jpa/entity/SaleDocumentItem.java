package example.market_jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SaleDocumentItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private SaleDocument saleDocument;
    @ManyToOne(cascade =CascadeType.ALL,fetch = FetchType.EAGER)
    private StoreProduct storeProduct;
    private Long count;
    private Double price;
}
