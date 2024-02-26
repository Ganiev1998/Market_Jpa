package example.market_jpa.dto.report.income;

import example.market_jpa.entity.PayType;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InComeResDTO {
    private PayType payType;
    private double amount;
    private Date date;
}
