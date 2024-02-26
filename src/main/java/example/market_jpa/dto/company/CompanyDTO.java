package example.market_jpa.dto.company;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDTO {
    private Long id;
    private String companyName;
    private String address;
    private String tell;
}
