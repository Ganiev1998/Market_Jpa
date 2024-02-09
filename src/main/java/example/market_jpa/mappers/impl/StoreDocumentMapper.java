package example.market_jpa.mappers.impl;

import example.market_jpa.dto.storeDocument.StoreDocumentDTO;
import example.market_jpa.dto.storeDocument.StoreDocumentResDTO;
import example.market_jpa.entity.StoreDocument;
import example.market_jpa.mappers.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StoreDocumentMapper extends EntityMapper<StoreDocumentDTO, StoreDocument, StoreDocumentResDTO> {
}
