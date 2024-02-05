package example.market_jpa.mappers.impl;

import example.market_jpa.dto.product.ProductDTO;
import example.market_jpa.dto.product.ProductResDTO;
import example.market_jpa.entity.Product;
import example.market_jpa.mappers.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper extends EntityMapper<ProductDTO, Product, ProductResDTO> {
}
