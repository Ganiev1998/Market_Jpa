package example.market_jpa.service.impl;

import example.market_jpa.dto.category.CategoryDTO;
import example.market_jpa.dto.category.CategoryResDTO;
import example.market_jpa.entity.Category;
import example.market_jpa.mapper.impl.CategoryMapper;
import example.market_jpa.repository.CategoryRepository;
import example.market_jpa.service.CategoryService;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
@Builder
public class CategoryServiceimpl implements CategoryService {
    private final CategoryRepository repository;
    private final CategoryMapper mapper;
    @Override
    public CategoryResDTO getById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<CategoryResDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public CategoryResDTO create(CategoryDTO categoryDTO) {
        return mapper.toDTO(repository.save(mapper.toENT(categoryDTO)));
    }

    @Override
    public CategoryResDTO update(Long id, CategoryDTO categoryDTO) {
        Category category = repository.getReferenceById(id);
        category.setCategoryName(categoryDTO.getCategoryName());
        return mapper.toDTO(repository.save(category));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
