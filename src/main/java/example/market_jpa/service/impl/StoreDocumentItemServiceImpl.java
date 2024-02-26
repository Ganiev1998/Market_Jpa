package example.market_jpa.service.impl;

import example.market_jpa.dto.storeDocItem.StoreDocItemDTO;
import example.market_jpa.dto.storeDocItem.StoreDocItemResDTO;
import example.market_jpa.entity.Product;
import example.market_jpa.entity.StoreDocument;
import example.market_jpa.entity.StoreDocumentItem;
import example.market_jpa.entity.StoreProduct;
import example.market_jpa.mappers.impl.StoreDocItemMapper;
import example.market_jpa.mappers.impl.StoreDocumentMapper;
import example.market_jpa.mappers.impl.StoreProductMapper;
import example.market_jpa.repository.ProductRepository;
import example.market_jpa.repository.StoreDocumentItemRepository;
import example.market_jpa.repository.StoreDocumentRepository;
import example.market_jpa.repository.StoreProductRepository;
import example.market_jpa.service.StoreDocumentItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class StoreDocumentItemServiceImpl implements StoreDocumentItemService {
    private final StoreDocumentItemRepository repository;
    private final StoreDocumentRepository d_repository;
    private final StoreProductRepository p_repository;
    private final StoreDocItemMapper mapper;
    private final StoreDocumentMapper storeDocumentMapper;
    private final StoreProductMapper productMapper;
    private final ProductRepository productRepository;
    @Override
    public StoreDocItemResDTO getById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<StoreDocItemResDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public StoreDocItemResDTO create(StoreDocItemDTO storeDocItemDTO) {
        StoreDocumentItem item = mapper.toENT(storeDocItemDTO);
        item.setStoreDocument(d_repository.getReferenceById(storeDocItemDTO.getStoreDocument().getId()));
        item.setStoreProduct(p_repository.getReferenceById(storeDocItemDTO.getStoreProduct().getId()));
        addProduct(item);
        return mapper.toDTO(repository.save(item));
    }

    @Override
    public StoreDocItemResDTO update(Long id, StoreDocItemDTO storeDocItemDTO) {
        StoreDocumentItem docItem = repository.getReferenceById(id);
        docItem.setStoreDocument(storeDocumentMapper.toENT(storeDocItemDTO.getStoreDocument()));
        docItem.setStoreProduct(productMapper.toENT(storeDocItemDTO.getStoreProduct()));
        docItem.setCount(storeDocItemDTO.getCount());
        return mapper.toDTO(repository.save(docItem));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
    public void addProduct(StoreDocumentItem item){
        StoreProduct product = p_repository.getReferenceById(item.getStoreProduct().getId());
        product.setAmount(product.getAmount()+ item.getCount());
        p_repository.save(product);
        Product product1 = productRepository.getReferenceById(product.getProduct().getId());
        product1.setAmount(product1.getAmount()-item.getCount());
        productRepository.save(product1);
    }
}
