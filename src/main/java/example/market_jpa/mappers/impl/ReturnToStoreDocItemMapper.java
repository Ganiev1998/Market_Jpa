package example.market_jpa.mappers.impl;

import example.market_jpa.dto.returnToStoreDocItem.ReturnToStoreDocItemDTO;
import example.market_jpa.dto.returnToStoreDocItem.ReturnToStoreDocItemResDTO;
import example.market_jpa.entity.ReturnToStoreDocItem;
import example.market_jpa.mappers.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReturnToStoreDocItemMapper extends EntityMapper<ReturnToStoreDocItemDTO, ReturnToStoreDocItem, ReturnToStoreDocItemResDTO> {
}
