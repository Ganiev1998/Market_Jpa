package example.market_jpa.Controller;

import example.market_jpa.dto.returnToWarehouseDoc.ReturnToWarehouseDocDTO;
import example.market_jpa.dto.returnToWarehouseDoc.ReturnToWarehouseDocResDTO;
import example.market_jpa.repository.ReturnToWarehouseDocRepository;
import example.market_jpa.service.ReturnToWarehouseDocService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/returnToWarehouse")
@RequiredArgsConstructor
public class ReturnToWarehouseDocController implements Controller<ReturnToWarehouseDocResDTO, ReturnToWarehouseDocDTO,Long> {
    private final ReturnToWarehouseDocService service;
    @Override
    @GetMapping("/{id}")
    public ReturnToWarehouseDocResDTO getById(Long id) {
        return service.getById(id);
    }

    @Override
    @GetMapping
    public List<ReturnToWarehouseDocResDTO> getAll() {
        return service.getAll();
    }

    @Override
    @PostMapping
    public ReturnToWarehouseDocResDTO create(@RequestBody ReturnToWarehouseDocDTO returnToWarehouseDocDTO) {
        return service.create(returnToWarehouseDocDTO);
    }
    @Override
    @PutMapping("/{id}")
    public ReturnToWarehouseDocResDTO update(@PathVariable Long id,@RequestBody ReturnToWarehouseDocDTO returnToWarehouseDocDTO) {
        return service.update(id,returnToWarehouseDocDTO);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
        System.out.println("object is deleted");
    }
}
