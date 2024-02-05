package example.market_jpa.dto.company;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDTO {
    private String companyName;
    private String address;
    private String tell;
}
