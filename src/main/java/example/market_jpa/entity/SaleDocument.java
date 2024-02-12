package example.market_jpa.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SaleDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(unique = true)
    private String docNumber;
    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    private Date date;
    @OneToMany(mappedBy = "saleDocument")
    private Set<SaleDocumentItem> documentItems;
}
