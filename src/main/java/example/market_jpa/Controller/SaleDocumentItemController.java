package example.market_jpa.Controller;

import example.market_jpa.dto.salleDocumentItem.SaleDocumentItemDTO;
import example.market_jpa.dto.salleDocumentItem.SaleDocumentItemResDTO;
import example.market_jpa.service.SaleDocumentItemService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/saleDocumentItem")
@RequiredArgsConstructor
public class SaleDocumentItemController implements Controller<SaleDocumentItemResDTO, SaleDocumentItemDTO,Long> {
    private final SaleDocumentItemService service;
    @Override
    @GetMapping("/{id}")
    public SaleDocumentItemResDTO getById(Long id) {
        return service.getById(id);
    }

    @Override
    @GetMapping
    public List<SaleDocumentItemResDTO> getAll() {
        return service.getAll();
    }

    @Override
    @PostMapping
    public SaleDocumentItemResDTO create(@RequestBody SaleDocumentItemDTO saleDocumentItemDTO) {
        return service.create(saleDocumentItemDTO);
    }

    @Override
    @PutMapping("/{id}")
    public SaleDocumentItemResDTO update(@PathVariable Long id,@RequestBody SaleDocumentItemDTO saleDocumentItemDTO) {
        return service.update(id,saleDocumentItemDTO);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
        System.out.println("object is deleted");
    }
}
