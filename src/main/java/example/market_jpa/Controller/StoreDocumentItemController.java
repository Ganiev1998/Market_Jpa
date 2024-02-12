package example.market_jpa.Controller;

import example.market_jpa.dto.storeDocItem.StoreDocItemDTO;
import example.market_jpa.dto.storeDocItem.StoreDocItemResDTO;
import example.market_jpa.service.StoreDocumentItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/storeDocumentItem")
@RequiredArgsConstructor
public class StoreDocumentItemController implements Controller<StoreDocItemResDTO, StoreDocItemDTO,Long> {
    private final StoreDocumentItemService service;
    @Override
    @GetMapping("/{id}")
    public StoreDocItemResDTO getById(Long id) {
        return service.getById(id);
    }

    @Override
    @GetMapping
    public List<StoreDocItemResDTO> getAll() {
        return service.getAll();
    }

    @Override
    @PostMapping
    public StoreDocItemResDTO create(StoreDocItemDTO storeDocItemDTO) {
        return service.create(storeDocItemDTO);
    }

    @Override
    @PutMapping("/{id}")
    public StoreDocItemResDTO update(Long id, StoreDocItemDTO storeDocItemDTO) {
        return service.update(id,storeDocItemDTO);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(Long id) {
        service.delete(id);
        System.out.println("object is deleted");
    }
}
