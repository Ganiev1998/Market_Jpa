package example.market_jpa.dto.report.outlay;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OutlayResDTO {
    private String company_name;
    private Double amount;
    private Date date;
}
