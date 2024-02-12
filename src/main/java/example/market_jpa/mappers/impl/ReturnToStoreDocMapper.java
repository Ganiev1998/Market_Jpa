package example.market_jpa.mappers.impl;

import example.market_jpa.dto.returnToStoreDoc.ReturnToStoreDocDTO;
import example.market_jpa.dto.returnToStoreDoc.ReturnToStoreDocResDTO;
import example.market_jpa.entity.ReturnToStoreDoc;
import example.market_jpa.mappers.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReturnToStoreDocMapper extends EntityMapper<ReturnToStoreDocDTO, ReturnToStoreDoc,ReturnToStoreDocResDTO> {
}
