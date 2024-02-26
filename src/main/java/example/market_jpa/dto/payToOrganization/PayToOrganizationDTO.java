package example.market_jpa.dto.payToOrganization;

import example.market_jpa.dto.company.CompanyDTO;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PayToOrganizationDTO {
    private CompanyDTO company;
    private Date date;
    private double paySum;
}
