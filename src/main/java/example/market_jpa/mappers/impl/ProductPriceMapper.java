package example.market_jpa.mappers.impl;

import example.market_jpa.dto.productPrice.ProductPriceDTO;
import example.market_jpa.dto.productPrice.ProductPriceResDTO;
import example.market_jpa.entity.ProductPrice;
import example.market_jpa.mappers.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductPriceMapper extends EntityMapper<ProductPriceDTO, ProductPrice, ProductPriceResDTO> {
}
