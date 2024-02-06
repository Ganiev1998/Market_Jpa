package example.market_jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AcceptDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private Long docNumber;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Company company;
    private Date date;
    @OneToMany(mappedBy = "acceptDocument")
    private List<AcceptDocumentItem> documentItems;
}
