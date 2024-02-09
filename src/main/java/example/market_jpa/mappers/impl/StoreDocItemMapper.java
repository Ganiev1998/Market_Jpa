package example.market_jpa.mappers.impl;

import example.market_jpa.dto.storeDocItem.StoreDocItemDTO;
import example.market_jpa.dto.storeDocItem.StoreDocItemResDTO;
import example.market_jpa.entity.StoreDocumentItem;
import example.market_jpa.mappers.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StoreDocItemMapper extends EntityMapper<StoreDocItemDTO, StoreDocumentItem, StoreDocItemResDTO> {
}
