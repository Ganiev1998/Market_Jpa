package example.market_jpa.Controller;

import example.market_jpa.dto.productPrice.ProductPriceDTO;
import example.market_jpa.dto.productPrice.ProductPriceResDTO;
import example.market_jpa.service.ProductPriceService;
import example.market_jpa.service.ProductService;
import lombok.Data;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@RequestMapping("/productPrice")
public class ProductPriceController {
    private final ProductPriceService service;
    @GetMapping
    public List<ProductPriceResDTO> getAll(){
        return service.getAll();
    }
    @GetMapping("/{id}")
    public ProductPriceResDTO getById(@PathVariable Long id){
        return service.getById(id);
    }
    @PostMapping
    public ProductPriceResDTO create(@RequestBody ProductPriceDTO priceDTO){
        return service.create(priceDTO);
    }
    @PutMapping("/{id}")
    public ProductPriceResDTO update(@PathVariable Long id,@RequestBody ProductPriceDTO priceDTO){
        return service.update(id,priceDTO);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
        System.out.println("object is deleted");
    }
}
