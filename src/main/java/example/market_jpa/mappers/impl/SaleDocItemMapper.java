package example.market_jpa.mappers.impl;

import example.market_jpa.dto.salleDocumentItem.SaleDocumentItemDTO;
import example.market_jpa.dto.salleDocumentItem.SaleDocumentItemResDTO;
import example.market_jpa.entity.SaleDocumentItem;
import example.market_jpa.mappers.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SaleDocItemMapper extends EntityMapper<SaleDocumentItemDTO, SaleDocumentItem, SaleDocumentItemResDTO> {
}
