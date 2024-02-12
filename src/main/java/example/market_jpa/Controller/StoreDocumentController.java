package example.market_jpa.Controller;

import example.market_jpa.dto.storeDocument.StoreDocumentDTO;
import example.market_jpa.dto.storeDocument.StoreDocumentResDTO;
import example.market_jpa.service.StoreDocumentService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/storeDocument")
@RequiredArgsConstructor
public class StoreDocumentController implements Controller<StoreDocumentResDTO, StoreDocumentDTO,Long> {
    private final StoreDocumentService service;
    @Override
    @GetMapping("/{id}")
    public StoreDocumentResDTO getById(Long id) {
        return service.getById(id);
    }

    @Override
    @GetMapping
    public List<StoreDocumentResDTO> getAll() {
        return service.getAll();
    }

    @Override
    @PostMapping
    public StoreDocumentResDTO create(StoreDocumentDTO storeDocumentDTO) {
        return service.create(storeDocumentDTO);
    }

    @Override
    @PutMapping("/{id}")
    public StoreDocumentResDTO update(Long id, StoreDocumentDTO storeDocumentDTO) {
        return service.update(id,storeDocumentDTO);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(Long id) {
        service.delete(id);
        System.out.println("object is deleted");
    }
}
