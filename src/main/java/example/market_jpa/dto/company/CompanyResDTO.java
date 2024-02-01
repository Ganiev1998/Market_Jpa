package example.market_jpa.dto.company;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompanyResDTO {
    private Long id;
    private String name;
    private String address;
    private String tell;
    private String description;
}
