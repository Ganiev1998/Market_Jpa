package example.market_jpa.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
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
    @OneToMany(mappedBy = "product")
    private Set<AcceptDocumentItem> documentItems;
}
