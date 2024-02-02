package example.market_jpa.dto.category;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryResDTO {
    private Long id;
    private String categoryName;
}
