package example.market_jpa.mappers.impl;

import example.market_jpa.dto.acceptDocument.AcceptDocumentDTO;
import example.market_jpa.dto.acceptDocument.AcceptDocumentResDTO;
import example.market_jpa.entity.AcceptDocument;
import example.market_jpa.mappers.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AcceptDocumentMapper extends EntityMapper<AcceptDocumentDTO, AcceptDocument, AcceptDocumentResDTO> {
}
