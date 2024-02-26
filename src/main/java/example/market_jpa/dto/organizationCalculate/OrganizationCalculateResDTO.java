package example.market_jpa.dto.organizationCalculate;

import example.market_jpa.dto.company.CompanyResDTO;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationCalculateResDTO {
    private Long id;
    private CompanyResDTO company;
    private double take_sum;
    private double pay_sum;
}
