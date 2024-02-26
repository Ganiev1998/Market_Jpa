package example.market_jpa.Controller;

import example.market_jpa.dto.storeProduct.StoreProductDTO;
import example.market_jpa.dto.storeProduct.StoreProductResDTO;
import example.market_jpa.entity.StoreProduct;
import example.market_jpa.service.StoreProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/storeProduct")
@RequiredArgsConstructor
public class StoreProductController implements Controller<StoreProductResDTO, StoreProductDTO,Long> {
    private final StoreProductService service;

    @Override
    @GetMapping("/{id}")
    public StoreProductResDTO getById(Long id) {
        return service.getById(id);
    }

    @Override
    @GetMapping
    public List<StoreProductResDTO> getAll() {
        return service.getAll();
    }

    @Override
    @PostMapping
    public StoreProductResDTO create(@RequestBody StoreProductDTO storeProductDTO) {
        return service.create(storeProductDTO);
    }

    @Override
    @PutMapping("/{id}")
    public StoreProductResDTO update(@PathVariable Long id,@RequestBody StoreProductDTO storeProductDTO) {
        return service.update(id,storeProductDTO);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
        System.out.println("object is deleted");
    }
}
