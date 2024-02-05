package example.market_jpa.mappers.impl;

import example.market_jpa.dto.category.CategoryDTO;
import example.market_jpa.dto.category.CategoryResDTO;
import example.market_jpa.entity.Category;
import example.market_jpa.mappers.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper extends EntityMapper<CategoryDTO, Category, CategoryResDTO> {
}
