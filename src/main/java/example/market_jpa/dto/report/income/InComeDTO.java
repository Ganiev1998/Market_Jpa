package example.market_jpa.dto.report.income;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InComeDTO {
    private Date from;
    private Date to;
}
