package example.market_jpa.mappers.impl;

import example.market_jpa.dto.acceptDocumentItem.AcceptDocumentItemDTO;
import example.market_jpa.dto.acceptDocumentItem.AcceptDocumentItemResDTO;
import example.market_jpa.entity.AcceptDocumentItem;
import example.market_jpa.mappers.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AcceptDocumentItemMapper extends EntityMapper<AcceptDocumentItemDTO, AcceptDocumentItem, AcceptDocumentItemResDTO> {
}
