package example.market_jpa.Controller;

import example.market_jpa.dto.returnToStoreDoc.ReturnToStoreDocDTO;
import example.market_jpa.dto.returnToStoreDoc.ReturnToStoreDocResDTO;
import example.market_jpa.service.ReturnToStoreDocService;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/returnToStore")
@RequiredArgsConstructor
public class ReturnToStoreDocController implements Controller<ReturnToStoreDocResDTO, ReturnToStoreDocDTO,Long>{
    private final ReturnToStoreDocService service;
    @Override
    @GetMapping("/{id}")
    public ReturnToStoreDocResDTO getById(Long id) {
        return service.getById(id);
    }

    @Override
    @GetMapping
    public List<ReturnToStoreDocResDTO> getAll() {
        return service.getAll();
    }

    @Override
    @PostMapping
    public ReturnToStoreDocResDTO create(ReturnToStoreDocDTO returnToStoreDocDTO) {
        return service.create(returnToStoreDocDTO);
    }

    @Override
    @PutMapping("/{id}")
    public ReturnToStoreDocResDTO update(Long id, ReturnToStoreDocDTO returnToStoreDocDTO) {
        return service.update(id,returnToStoreDocDTO);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(Long id) {
        service.delete(id);
        System.out.println("object is deleted");
    }
}
