package example.market_jpa.mappers.impl;

import example.market_jpa.dto.saleDocument.SaleDocumentDTO;
import example.market_jpa.dto.saleDocument.SaleDocumentResDTO;
import example.market_jpa.entity.SaleDocument;
import example.market_jpa.mappers.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SaleDocumentMapper extends EntityMapper<SaleDocumentDTO, SaleDocument, SaleDocumentResDTO> {
}
