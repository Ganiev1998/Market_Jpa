package example.market_jpa.dto.company;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompanyResDTO {
    private Long id;
    private String companyName;
    private String address;
    private String tell;
    private String description;
}
