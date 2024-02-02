package example.market_jpa.dto.company;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDTO {
    private String companyName;
    private String address;
    private String tell;
    private String description;
}
