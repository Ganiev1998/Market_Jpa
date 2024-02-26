package example.market_jpa.Controller;

import example.market_jpa.dto.returnToStoreDocItem.ReturnToStoreDocItemDTO;
import example.market_jpa.dto.returnToStoreDocItem.ReturnToStoreDocItemResDTO;
import example.market_jpa.repository.ReturnToStoreDocItemRepository;
import example.market_jpa.service.ReturnToStoreDocitemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("returnToStoreItem")
@RequiredArgsConstructor
public class ReturnToStoreDocItemController implements Controller<ReturnToStoreDocItemResDTO, ReturnToStoreDocItemDTO,Long> {
    private final ReturnToStoreDocitemService service;
    @Override
    @GetMapping("/{id}")
    public ReturnToStoreDocItemResDTO getById(Long id) {
        return service.getById(id);
    }

    @Override
    @GetMapping
    public List<ReturnToStoreDocItemResDTO> getAll() {
        return service.getAll();
    }

    @Override
    @PostMapping
    public ReturnToStoreDocItemResDTO create(@RequestBody ReturnToStoreDocItemDTO returnToStoreDocItemDTO) {
        return service.create(returnToStoreDocItemDTO);
    }

    @Override
    @PutMapping("/{id}")
    public ReturnToStoreDocItemResDTO update(@PathVariable Long id,@RequestBody ReturnToStoreDocItemDTO returnToStoreDocItemDTO) {
        return service.update(id,returnToStoreDocItemDTO);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
        System.out.println("object is deleted");
    }
}
