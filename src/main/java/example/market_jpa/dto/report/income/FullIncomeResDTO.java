package example.market_jpa.dto.report.income;

import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FullIncomeResDTO {
    private List<InComeResDTO> dtos;
    private double totalAmount;
}
