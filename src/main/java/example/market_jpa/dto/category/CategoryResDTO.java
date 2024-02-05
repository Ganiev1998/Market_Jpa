package example.market_jpa.dto.category;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryResDTO {
    private Long id;
    private String categoryName;
}
