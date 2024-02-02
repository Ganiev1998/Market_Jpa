package example.market_jpa.mapper.impl;

import example.market_jpa.dto.product.ProductDTO;
import example.market_jpa.dto.product.ProductResDTO;
import example.market_jpa.entity.Product;
import example.market_jpa.mapper.Mapper;
@org.mapstruct.Mapper(componentModel = "spring")
public interface ProductMapper extends Mapper<ProductDTO, ProductResDTO, Product> {
}
