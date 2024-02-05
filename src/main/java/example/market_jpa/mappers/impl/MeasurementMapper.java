package example.market_jpa.mappers.impl;

import example.market_jpa.dto.Measure.MeasureDTO;
import example.market_jpa.dto.Measure.MeasureResDTO;
import example.market_jpa.entity.Measurement;
import example.market_jpa.mappers.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MeasurementMapper extends EntityMapper<MeasureDTO, Measurement, MeasureResDTO> {
}
