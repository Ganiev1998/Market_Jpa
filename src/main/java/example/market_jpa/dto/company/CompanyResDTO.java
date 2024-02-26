package example.market_jpa.dto.company;

import example.market_jpa.dto.acceptDocument.AcceptDocumentResDTO;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyResDTO {
    private Long id;
    private String companyName;
    private String address;
    private String tell;
    private List<AcceptDocumentResDTO> documentResDTOS;
}
