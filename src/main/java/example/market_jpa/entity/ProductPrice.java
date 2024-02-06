package example.market_jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Product product;
    private Double price;
    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(nullable = false)
    private Boolean status;
    @PrePersist
    public void prepersist(){
        if(status == null){
            status = true;
        }
    }
}
