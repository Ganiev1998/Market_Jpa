package example.market_jpa.Controller;

import example.market_jpa.dto.saleDocument.SaleDocumentDTO;
import example.market_jpa.dto.saleDocument.SaleDocumentResDTO;
import example.market_jpa.service.SaleDocumentService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/saleDocument")
@RequiredArgsConstructor
public class SaleDocumentController implements Controller<SaleDocumentResDTO, SaleDocumentDTO,Long> {
    private final SaleDocumentService service;
    @Override
    @GetMapping("/{id}")
    public SaleDocumentResDTO getById(Long id) {
        return service.getById(id);
    }

    @Override
    @GetMapping
    public List<SaleDocumentResDTO> getAll() {
        return service.getAll();
    }

    @Override
    @PostMapping
    public SaleDocumentResDTO create(@RequestBody SaleDocumentDTO saleDocumentDTO) {
        return service.create(saleDocumentDTO);
    }

    @Override
    @PutMapping("/{id}")
    public SaleDocumentResDTO update(@PathVariable Long id,@RequestBody SaleDocumentDTO saleDocumentDTO) {
        return service.update(id,saleDocumentDTO);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
        System.out.println("object is deleted");
    }
}
