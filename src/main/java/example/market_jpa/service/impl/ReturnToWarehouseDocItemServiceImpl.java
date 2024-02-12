package example.market_jpa.service.impl;

import example.market_jpa.dto.returnToWarehouseDocItem.ReturnToWarehouseDocItemDTO;
import example.market_jpa.dto.returnToWarehouseDocItem.ReturnToWarehouseDocItemResDTO;
import example.market_jpa.entity.ReturnToWarehouseDocItem;
import example.market_jpa.mappers.impl.ProductMapper;
import example.market_jpa.mappers.impl.ReturnToWarehouseDocItemMapper;
import example.market_jpa.mappers.impl.ReturnToWarehouseDocMapper;
import example.market_jpa.mappers.impl.StoreProductMapper;
import example.market_jpa.repository.ReturnToWarehouseDocItemRepository;
import example.market_jpa.service.ReturnToWarehouseDocItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ReturnToWarehouseDocItemServiceImpl implements ReturnToWarehouseDocItemService {
    private final ReturnToWarehouseDocItemRepository repository;
    private final ReturnToWarehouseDocItemMapper mapper;
    private final ReturnToWarehouseDocMapper docMapper;
    private final StoreProductMapper storeProductMapper;
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
        return mapper.toDTO(repository.save(mapper.toENT(returnToWarehouseDocItemDTO)));
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
}
