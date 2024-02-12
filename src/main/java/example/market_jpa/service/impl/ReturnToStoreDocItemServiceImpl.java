package example.market_jpa.service.impl;

import example.market_jpa.dto.returnToStoreDocItem.ReturnToStoreDocItemDTO;
import example.market_jpa.dto.returnToStoreDocItem.ReturnToStoreDocItemResDTO;
import example.market_jpa.entity.ReturnToStoreDocItem;
import example.market_jpa.mappers.impl.ReturnToStoreDocItemMapper;
import example.market_jpa.mappers.impl.ReturnToStoreDocMapper;
import example.market_jpa.mappers.impl.StoreProductMapper;
import example.market_jpa.repository.ReturnToStoreDocItemRepository;
import example.market_jpa.service.ReturnToStoreDocitemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ReturnToStoreDocItemServiceImpl implements ReturnToStoreDocitemService {
    private final ReturnToStoreDocItemRepository repository;
    private final ReturnToStoreDocItemMapper mapper;
    private final ReturnToStoreDocMapper docMapper;
    private final StoreProductMapper productMapper;
    @Override
    public ReturnToStoreDocItemResDTO getById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<ReturnToStoreDocItemResDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public ReturnToStoreDocItemResDTO create(ReturnToStoreDocItemDTO returnToStoreDocItemDTO) {
        return mapper.toDTO(repository.save(mapper.toENT(returnToStoreDocItemDTO)));
    }

    @Override
    public ReturnToStoreDocItemResDTO update(Long id, ReturnToStoreDocItemDTO returnToStoreDocItemDTO) {
        ReturnToStoreDocItem docItem = repository.getReferenceById(id);
        docItem.setDoc(docMapper.toENT(returnToStoreDocItemDTO.getDoc()));
        docItem.setProduct(productMapper.toENT(returnToStoreDocItemDTO.getProduct()));
        docItem.setCount(returnToStoreDocItemDTO.getCount());
        return mapper.toDTO(repository.save(docItem));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
