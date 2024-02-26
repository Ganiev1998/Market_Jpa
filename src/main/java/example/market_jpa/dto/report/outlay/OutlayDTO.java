package example.market_jpa.dto.report.outlay;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OutlayDTO {
    private String company;
    private Date from;
    private Date to;
}
