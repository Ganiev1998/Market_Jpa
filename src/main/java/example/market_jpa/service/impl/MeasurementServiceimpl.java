package example.market_jpa.service.impl;

import example.market_jpa.dto.Measure.MeasureDTO;
import example.market_jpa.dto.Measure.MeasureResDTO;
import example.market_jpa.entity.Measurement;
import example.market_jpa.mappers.impl.MeasurementMapper;
import example.market_jpa.repository.MeasurementRepository;
import example.market_jpa.service.MeasurementService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Data
public class MeasurementServiceimpl implements MeasurementService {
    private final MeasurementRepository repository;
    private final MeasurementMapper mapper;
    @Override
    public MeasureResDTO getById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<MeasureResDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public MeasureResDTO create(MeasureDTO measureDTO) {
        return mapper.toDTO(repository.save(mapper.toENT(measureDTO)));
    }

    @Override
    public MeasureResDTO update(Long id, MeasureDTO measureDTO) {
        Measurement measurement = repository.getReferenceById(id);
        measurement.setName(measureDTO.getName());
        return mapper.toDTO(repository.save(measurement));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
