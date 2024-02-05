package example.market_jpa.service.impl;

import example.market_jpa.dto.product.ProductDTO;
import example.market_jpa.dto.product.ProductResDTO;
import example.market_jpa.entity.Product;
import example.market_jpa.mappers.impl.CategoryMapper;
import example.market_jpa.mappers.impl.ProductMapper;
import example.market_jpa.repository.ProductRepository;
import example.market_jpa.service.ProductService;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;

//@Data
@Service
@Data
public class ProductServiceimpl implements ProductService {
    private final ProductRepository repository;
    private final ProductMapper mapper;
    private final CategoryMapper cat_mapper;

    @Override
    public ProductResDTO getById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<ProductResDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public ProductResDTO create(ProductDTO productDTO) {
        return mapper.toDTO(repository.save(mapper.toENT(productDTO)));
    }

    @Override
    public ProductResDTO update(Long id, ProductDTO productDTO) {
        Product product = repository.getReferenceById(id);
        product.setProductName(productDTO.getProductName());
        product.setAmount(productDTO.getAmount());
        product.setMeasure(productDTO.getMeasure());
        product.setCategory(cat_mapper.toENT(productDTO.getCategory()));
        return mapper.toDTO(repository.save(product));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
