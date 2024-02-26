package example.market_jpa.dto.report.outlay;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullOutlayResDTO {
    private List<OutlayResDTO> outlayResDTOS;
    private Double totalAmount;
}
