package example.market_jpa.Controller;

import example.market_jpa.dto.product.ProductDTO;
import example.market_jpa.dto.product.ProductResDTO;
import example.market_jpa.dto.product.ProductResDTO;
import example.market_jpa.service.ProductService;
import lombok.Data;
import org.hibernate.type.descriptor.sql.internal.CapacityDependentDdlType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService service;
    @GetMapping
    public List<ProductResDTO> getAll(){
        System.out.println(service.getAll());
        return service.getAll();
    }
    @GetMapping("/{id}")
    public ProductResDTO getById(@PathVariable Long id){
        return service.getById(id);
    }
    @PostMapping
    public ProductResDTO create(@RequestBody ProductDTO productDTO){
        return service.create(productDTO);
    }
    @PutMapping("/{id}")
    public ProductResDTO update(@PathVariable Long id,@RequestBody ProductDTO productDTO){
        return service.update(id,productDTO);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
        System.out.println("object is deleted");
    }
}
