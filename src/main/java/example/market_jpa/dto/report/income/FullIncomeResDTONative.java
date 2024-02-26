package example.market_jpa.dto.report.income;

import example.market_jpa.projection.Income;
import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FullIncomeResDTONative {
    private List<Income> incomes;
    private double totalAmount;
}
