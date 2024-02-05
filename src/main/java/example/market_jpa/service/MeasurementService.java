package example.market_jpa.service;

import example.market_jpa.dto.Measure.MeasureDTO;
import example.market_jpa.dto.Measure.MeasureResDTO;
import example.market_jpa.entity.Measurement;

import java.util.List;

public interface MeasurementService extends Service<MeasureResDTO, MeasureDTO> {
    @Override
    MeasureResDTO getById(Long id);

    @Override
    List<MeasureResDTO> getAll();

    @Override
    MeasureResDTO create(MeasureDTO measureDTO);

    @Override
    MeasureResDTO update(Long id, MeasureDTO measureDTO);

    @Override
    void delete(Long id);
}
