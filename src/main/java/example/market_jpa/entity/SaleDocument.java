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
    @GeneratedValue
    private Long id;
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(unique = true)
    private Long docNumber;
    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    private Date date;
//    @OneToMany(mappedBy = "saleDocument")
//    private Set<SaleDocumentItem> documentItems;
}
