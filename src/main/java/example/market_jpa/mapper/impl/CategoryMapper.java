package example.market_jpa.mapper.impl;

import example.market_jpa.dto.category.CategoryDTO;
import example.market_jpa.dto.category.CategoryResDTO;
import example.market_jpa.entity.Category;
import example.market_jpa.mapper.Mapper;
@org.mapstruct.Mapper
public interface CategoryMapper extends Mapper<CategoryDTO, CategoryResDTO, Category> {
}
