package example.market_jpa.entity;

import example.market_jpa.dto.productPrice.ProductPriceWithProductResDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Category category;
    @ManyToOne(cascade = CascadeType.ALL)
    private Measurement measure;
    private Long amount;
    @OneToMany(mappedBy = "product",fetch = FetchType.EAGER)
    private Set<AcceptDocumentItem> documentItems;
    @OneToMany(mappedBy = "product",fetch = FetchType.EAGER)
    private List<ProductPrice> price;
}
