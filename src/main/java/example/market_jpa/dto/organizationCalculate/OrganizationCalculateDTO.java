package example.market_jpa.dto.organizationCalculate;

import example.market_jpa.dto.company.CompanyDTO;
import jdk.jfr.Name;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationCalculateDTO {
    private CompanyDTO company;
    private double take_sum;
    private double pay_sum;
}
