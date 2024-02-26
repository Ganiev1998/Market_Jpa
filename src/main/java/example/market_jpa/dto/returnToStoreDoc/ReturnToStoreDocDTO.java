package example.market_jpa.dto.returnToStoreDoc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReturnToStoreDocDTO {
    private Long id;
    private String docNumber;
    private Date date;
}
