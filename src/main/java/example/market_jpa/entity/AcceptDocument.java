package example.market_jpa.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AcceptDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.UUID)
    private String docNumber;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Company company;
    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    private Date date;
    @Enumerated(EnumType.STRING)
    private DocStatus status;
    @OneToMany(mappedBy = "acceptDocument")
    private List<AcceptDocumentItem> documentItems;
}
