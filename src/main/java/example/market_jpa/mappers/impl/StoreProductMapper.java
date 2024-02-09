package example.market_jpa.mappers.impl;

import example.market_jpa.dto.storeProduct.StoreProductDTO;
import example.market_jpa.dto.storeProduct.StoreProductResDTO;
import example.market_jpa.entity.StoreProduct;
import example.market_jpa.mappers.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StoreProductMapper extends EntityMapper<StoreProductDTO, StoreProduct, StoreProductResDTO> {
}
