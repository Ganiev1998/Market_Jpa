package example.market_jpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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
}
