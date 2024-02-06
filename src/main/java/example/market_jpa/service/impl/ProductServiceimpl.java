package example.market_jpa.service.impl;

import example.market_jpa.dto.product.ProductDTO;
import example.market_jpa.dto.product.ProductResDTO;
import example.market_jpa.entity.Product;
import example.market_jpa.mappers.impl.CategoryMapper;
import example.market_jpa.mappers.impl.MeasurementMapper;
import example.market_jpa.mappers.impl.ProductMapper;
import example.market_jpa.repository.CategoryRepository;
import example.market_jpa.repository.MeasurementRepository;
import example.market_jpa.repository.ProductRepository;
import example.market_jpa.service.ProductService;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

//@Data
@Service
@Data
public class ProductServiceimpl implements ProductService {
    private final ProductRepository repository;
    private final ProductMapper mapper;
    private final CategoryRepository cat_repository;
    private final CategoryMapper cat_mapper;
    private final MeasurementRepository m_repository;
    private final MeasurementMapper measurementMapper;

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
        if (!cat_repository.existsById(productDTO.getCategory().getId())){
            throw new NoSuchElementException();
        }
        Product product = mapper.toENT(productDTO);
        product.setCategory(
                cat_repository.getReferenceById(productDTO.getCategory().getId())
        );
        repository.save(product);
        return mapper.toDTO(product);
    }

    @Override
    public ProductResDTO update(Long id, ProductDTO productDTO) {
        Product product = repository.getReferenceById(id);
        product.setProductName(productDTO.getProductName());
        product.setAmount(productDTO.getAmount());
        product.setMeasure(measurementMapper.toENT(productDTO.getMeasure()));
        product.setCategory(cat_mapper.toENT(productDTO.getCategory()));
        return mapper.toDTO(repository.save(product));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
