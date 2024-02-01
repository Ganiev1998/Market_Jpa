package example.market_jpa.dto.category;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryResDTO {
    private Long id;
    private String name;
}
