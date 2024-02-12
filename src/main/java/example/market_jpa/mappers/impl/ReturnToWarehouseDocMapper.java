package example.market_jpa.mappers.impl;

import example.market_jpa.dto.returnToWarehouseDoc.ReturnToWarehouseDocDTO;
import example.market_jpa.dto.returnToWarehouseDoc.ReturnToWarehouseDocResDTO;
import example.market_jpa.entity.ReturnToWarehouseDoc;
import example.market_jpa.mappers.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReturnToWarehouseDocMapper extends EntityMapper<ReturnToWarehouseDocDTO, ReturnToWarehouseDoc, ReturnToWarehouseDocResDTO> {
}
