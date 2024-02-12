package example.market_jpa.Controller;

import example.market_jpa.dto.acceptDocument.AcceptDocumentDTO;
import example.market_jpa.dto.acceptDocument.AcceptDocumentResDTO;
import example.market_jpa.service.AcceptDocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/acceptDocument")
public class AcceptDocumentController {
    private final AcceptDocumentService service;
    @GetMapping("/{id}")
    public AcceptDocumentResDTO GetById(@PathVariable Long id) {
        return service.getById(id);
    }
    @GetMapping
    public List<AcceptDocumentResDTO> GetAll(){
        return service.getAll();
    }
    @PostMapping
    public AcceptDocumentResDTO create(@RequestBody AcceptDocumentDTO documentDTO){
        return service.create(documentDTO);
    }
    @PutMapping("/{id}")
    public AcceptDocumentResDTO update(@PathVariable Long id,@RequestBody AcceptDocumentDTO documentDTO){
        return service.update(id,documentDTO);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
        System.out.println("object is deleted");
    }
}
