package example.market_jpa.service.impl;

import example.market_jpa.dto.productPrice.ProductPriceDTO;
import example.market_jpa.dto.productPrice.ProductPriceResDTO;
import example.market_jpa.entity.ProductPrice;
import example.market_jpa.mappers.impl.ProductMapper;
import example.market_jpa.mappers.impl.ProductPriceMapper;
import example.market_jpa.repository.ProductPriceRepository;
import example.market_jpa.service.ProductPriceService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Data
public class ProductPriceServiceimpl implements ProductPriceService {
    private final ProductPriceRepository repository;
    private final ProductPriceMapper mapper;
    private final ProductMapper p_mapper;
    @Override
    public ProductPriceResDTO getById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<ProductPriceResDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public ProductPriceResDTO create(ProductPriceDTO productPriceDTO) {
        return mapper.toDTO(repository.save(mapper.toENT(productPriceDTO)));
    }

    @Override
    public ProductPriceResDTO update(Long id, ProductPriceDTO productPriceDTO) {
        ProductPrice productPrice = repository.getReferenceById(id);
        productPrice.setProduct(p_mapper.toENT(productPriceDTO.getProduct()));
        productPrice.setPrice(productPriceDTO.getPrice());
        productPrice.setDate(productPriceDTO.getDate());
        productPrice.setStatus(productPriceDTO.getStatus());
        return mapper.toDTO(repository.save(productPrice));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
