package example.market_jpa.Controller;

import example.market_jpa.dto.category.CategoryDTO;
import example.market_jpa.dto.category.CategoryResDTO;
import example.market_jpa.dto.category.CategoryResDTO;
import example.market_jpa.service.CategoryService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@Data
public class CategoryController {
    @Autowired
    private CategoryService service;
    @GetMapping
    public List<CategoryResDTO> getAll(){
        return service.getAll();
    }
    @GetMapping("/{id}")
    public CategoryResDTO getById(@PathVariable Long id){
        return service.getById(id);
    }
    @PostMapping
    public CategoryResDTO create(@RequestBody CategoryDTO categoryDTO){
        return service.create(categoryDTO);
    }
    @PutMapping("/{id}")
    public CategoryResDTO update(@PathVariable Long id,@RequestBody CategoryDTO categoryDTO){
        return service.update(id,categoryDTO);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
        System.out.println("object is deleted");
    }
}
