package example.market_jpa.service;

import example.market_jpa.dto.category.CategoryDTO;
import example.market_jpa.dto.category.CategoryResDTO;

import java.util.List;

public interface CategoryService extends Service<CategoryResDTO, CategoryDTO> {
    @Override
    CategoryResDTO getById(Long id);

    @Override
    List<CategoryResDTO> getAll();

    @Override
    CategoryResDTO create(CategoryDTO categoryDTO);

    @Override
    CategoryResDTO update(Long id, CategoryDTO categoryDTO);

    @Override
    void delete(Long id);
}
