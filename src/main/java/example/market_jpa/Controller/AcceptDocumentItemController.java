package example.market_jpa.Controller;

import example.market_jpa.dto.acceptDocumentItem.AcceptDocumentItemDTO;
import example.market_jpa.dto.acceptDocumentItem.AcceptDocumentItemResDTO;
import example.market_jpa.service.AcceptDocumentItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("docItem")
public class AcceptDocumentItemController {
    private final AcceptDocumentItemService service;
    @GetMapping
    public List<AcceptDocumentItemResDTO> getALl(){
        return service.getAll();
    }
    @GetMapping("/{id}")
    public AcceptDocumentItemResDTO getById(@PathVariable Long id){
        return service.getById(id);
    }
    @PostMapping
    public AcceptDocumentItemResDTO create(@RequestBody AcceptDocumentItemDTO dto){
        return service.create(dto);
    }
    @PutMapping("/{id}")
    public AcceptDocumentItemResDTO update(@PathVariable Long id,@RequestBody AcceptDocumentItemDTO dto){
        return service.update(id,dto);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
        System.out.println("object is deleted");
    }
}

