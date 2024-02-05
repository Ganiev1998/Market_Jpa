package example.market_jpa.Controller;

import example.market_jpa.dto.company.CompanyDTO;
import example.market_jpa.dto.company.CompanyResDTO;
import example.market_jpa.dto.company.CompanyResDTO;
import example.market_jpa.service.CompanyService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@RestController
@RequestMapping("company")
public class CompanyController {
    @Autowired
    private CompanyService service;
    @GetMapping
    public List<CompanyResDTO> getAll(){
        return service.getAll();
    }
    @GetMapping("/{id}")
    public CompanyResDTO getById(@PathVariable Long id){
        return service.getById(id);
    }
    @PostMapping
    public CompanyResDTO create(@RequestBody CompanyDTO companyDTO){
        return service.create(companyDTO);
    }
    @PutMapping("/{id}")
    public CompanyResDTO update(@PathVariable Long id,@RequestBody CompanyDTO companyDTO){
        return service.update(id,companyDTO);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
        System.out.println("object is deleted");
    }
}
