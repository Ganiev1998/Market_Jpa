package example.market_jpa.dto.returnToWarehouseDoc;

import example.market_jpa.dto.returnToWarehouseDocItem.ReturnToWarehouseDocItemWithDocResDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReturnToWarehouseDocResDTO {
    private Long id;
    private String docNumber;
    private Date date;
    private List<ReturnToWarehouseDocItemWithDocResDTO> docItems;
}
