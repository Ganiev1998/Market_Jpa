package example.market_jpa.Controller;

import example.market_jpa.dto.Measure.MeasureDTO;
import example.market_jpa.dto.Measure.MeasureResDTO;
import example.market_jpa.service.MeasurementService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/measure")
@Data
public class MeasureController {
    private final MeasurementService service;
    @GetMapping
    public List<MeasureResDTO> getAll(){
        return service.getAll();
    }
    @GetMapping("/{id}")
    public MeasureResDTO getById(@PathVariable Long id){
        return service.getById(id);
    }
    @PostMapping
    public MeasureResDTO create(@RequestBody MeasureDTO measureDTO){
        return service.create(measureDTO);
    }
    @PutMapping("/{id}")
    public MeasureResDTO update(@PathVariable Long id,@RequestBody MeasureDTO measureDTO){
        return service.update(id,measureDTO);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        service.delete(id);
        return "object is deleted";
    }
}
