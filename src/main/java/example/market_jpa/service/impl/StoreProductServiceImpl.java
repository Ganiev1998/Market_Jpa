package example.market_jpa.service.impl;

import example.market_jpa.dto.storeProduct.StoreProductDTO;
import example.market_jpa.dto.storeProduct.StoreProductResDTO;
import example.market_jpa.entity.StoreProduct;
import example.market_jpa.mappers.impl.ProductMapper;
import example.market_jpa.mappers.impl.StoreProductMapper;
import example.market_jpa.repository.StoreProductRepository;
import example.market_jpa.service.StoreProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class StoreProductServiceImpl implements StoreProductService {
    private final StoreProductRepository repository;
    private final StoreProductMapper mapper;
    private final ProductMapper productMapper;

    @Override
    public StoreProductResDTO getById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<StoreProductResDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public StoreProductResDTO create(StoreProductDTO storeProductDTO) {
        return mapper.toDTO(repository.save(mapper.toENT(storeProductDTO)));
    }

    @Override
    public StoreProductResDTO update(Long id, StoreProductDTO storeProductDTO) {
        StoreProduct product = repository.getReferenceById(id);
        product.setProduct(productMapper.toENT(storeProductDTO.getProduct()));
        product.setAmount(storeProductDTO.getAmount());
        return mapper.toDTO(repository.save(product));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
