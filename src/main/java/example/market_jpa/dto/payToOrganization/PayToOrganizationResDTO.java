package example.market_jpa.dto.payToOrganization;

import example.market_jpa.dto.company.CompanyResDTO;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PayToOrganizationResDTO {
    private Long id;
    private CompanyResDTO company;
    private Date date;
    private double paySum;
}

