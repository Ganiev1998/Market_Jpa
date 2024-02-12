package example.market_jpa.mappers.impl;

import example.market_jpa.dto.returnToWarehouseDocItem.ReturnToWarehouseDocItemDTO;
import example.market_jpa.dto.returnToWarehouseDocItem.ReturnToWarehouseDocItemResDTO;
import example.market_jpa.entity.ReturnToWarehouseDocItem;
import example.market_jpa.mappers.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReturnToWarehouseDocItemMapper extends EntityMapper<ReturnToWarehouseDocItemDTO, ReturnToWarehouseDocItem,ReturnToWarehouseDocItemResDTO> {
}
