package example.market_jpa.Controller;

import example.market_jpa.dto.returnToWarehouseDocItem.ReturnToWarehouseDocItemDTO;
import example.market_jpa.dto.returnToWarehouseDocItem.ReturnToWarehouseDocItemResDTO;
import example.market_jpa.entity.ReturnToWarehouseDocItem;
import example.market_jpa.service.ReturnToWarehouseDocItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/returnToWarehouseItem")
@RequiredArgsConstructor
public class ReturnToWarehouseDocItemController implements Controller<ReturnToWarehouseDocItemResDTO, ReturnToWarehouseDocItemDTO,Long> {
    private final ReturnToWarehouseDocItemService service;
    @Override
    @GetMapping("/{id}")
    public ReturnToWarehouseDocItemResDTO getById(Long id) {
        return service.getById(id);
    }

    @Override
    @GetMapping
    public List<ReturnToWarehouseDocItemResDTO> getAll() {
        return service.getAll();
    }

    @Override
    @PostMapping
    public ReturnToWarehouseDocItemResDTO create(ReturnToWarehouseDocItemDTO returnToWarehouseDocItemDTO) {
        return service.create(returnToWarehouseDocItemDTO);
    }

    @Override
    @PutMapping("/{id}")
    public ReturnToWarehouseDocItemResDTO update(Long id, ReturnToWarehouseDocItemDTO returnToWarehouseDocItemDTO) {
        return service.update(id,returnToWarehouseDocItemDTO);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(Long id) {
        service.delete(id);
    }
}
