package example.market_jpa.dto.report.outlay;

import example.market_jpa.projection.OutLay;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullOutlayResDTONative {
    private List<OutLay> outlayResDTOS;
    private Double totalAmount;
}
