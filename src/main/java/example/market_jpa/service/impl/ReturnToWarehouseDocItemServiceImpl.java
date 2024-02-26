package example.market_jpa.service.impl;

import example.market_jpa.dto.returnToWarehouseDocItem.ReturnToWarehouseDocItemDTO;
import example.market_jpa.dto.returnToWarehouseDocItem.ReturnToWarehouseDocItemResDTO;
import example.market_jpa.entity.Product;
import example.market_jpa.entity.ReturnToWarehouseDoc;
import example.market_jpa.entity.ReturnToWarehouseDocItem;
import example.market_jpa.entity.StoreProduct;
import example.market_jpa.mappers.impl.ProductMapper;
import example.market_jpa.mappers.impl.ReturnToWarehouseDocItemMapper;
import example.market_jpa.mappers.impl.ReturnToWarehouseDocMapper;
import example.market_jpa.mappers.impl.StoreProductMapper;
import example.market_jpa.repository.ProductRepository;
import example.market_jpa.repository.ReturnToWarehouseDocItemRepository;
import example.market_jpa.repository.ReturnToWarehouseDocRepository;
import example.market_jpa.repository.StoreProductRepository;
import example.market_jpa.service.ReturnToWarehouseDocItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ReturnToWarehouseDocItemServiceImpl implements ReturnToWarehouseDocItemService {
    private final ReturnToWarehouseDocItemRepository repository;
    private final ReturnToWarehouseDocItemMapper mapper;
    private final ReturnToWarehouseDocRepository docRepository;
    private final ReturnToWarehouseDocMapper docMapper;
    private final StoreProductRepository storeProductRepository;
    private final StoreProductMapper storeProductMapper;
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    @Override
    public ReturnToWarehouseDocItemResDTO getById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<ReturnToWarehouseDocItemResDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public ReturnToWarehouseDocItemResDTO create(ReturnToWarehouseDocItemDTO returnToWarehouseDocItemDTO) {
        ReturnToWarehouseDocItem item = mapper.toENT(returnToWarehouseDocItemDTO);
        item.setDoc(docRepository.getReferenceById(returnToWarehouseDocItemDTO.getDoc().getId()));
        item.setStoreProduct(storeProductRepository.getReferenceById(returnToWarehouseDocItemDTO.getStoreProduct().getId()));
        item.setProduct(productRepository.getReferenceById(returnToWarehouseDocItemDTO.getProduct().getId()));
        decrease_increase(returnToWarehouseDocItemDTO);
        return mapper.toDTO(repository.save(item));
    }

    @Override
    public ReturnToWarehouseDocItemResDTO update(Long id, ReturnToWarehouseDocItemDTO returnToWarehouseDocItemDTO) {
        ReturnToWarehouseDocItem docItem = repository.getReferenceById(id);
        docItem.setDoc(docMapper.toENT(returnToWarehouseDocItemDTO.getDoc()));
        docItem.setStoreProduct(storeProductMapper.toENT(returnToWarehouseDocItemDTO.getStoreProduct()));
        docItem.setProduct(productMapper.toENT(returnToWarehouseDocItemDTO.getProduct()));
        docItem.setCount(returnToWarehouseDocItemDTO.getCount());
        return mapper.toDTO(repository.save(docItem));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
    public void decrease_increase(ReturnToWarehouseDocItemDTO dto){
        StoreProduct product = storeProductRepository.getReferenceById(dto.getStoreProduct().getId());
        product.setAmount(product.getAmount()-dto.getCount());
        storeProductRepository.save(product);
        Product product1 = productRepository.getReferenceById(dto.getProduct().getId());
        product1.setAmount(product1.getAmount()+dto.getCount());
        productRepository.save(product1);
    }
}
