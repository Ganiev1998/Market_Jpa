package example.market_jpa.service.impl;

import example.market_jpa.dto.acceptDocumentItem.AcceptDocumentItemDTO;
import example.market_jpa.dto.acceptDocumentItem.AcceptDocumentItemResDTO;
import example.market_jpa.entity.AcceptDocumentItem;
import example.market_jpa.entity.DocStatus;
import example.market_jpa.entity.Product;
import example.market_jpa.mappers.impl.AcceptDocumentItemMapper;
import example.market_jpa.mappers.impl.AcceptDocumentMapper;
import example.market_jpa.mappers.impl.ProductMapper;
import example.market_jpa.repository.AcceptDocumentItemRepository;
import example.market_jpa.repository.AcceptDocumentRepository;
import example.market_jpa.repository.ProductRepository;
import example.market_jpa.service.AcceptDocumentItemService;
import jakarta.persistence.PrePersist;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Data
public class AcceptDocumentItemServiceimpl implements AcceptDocumentItemService {
    private final AcceptDocumentItemRepository repository;
    private final AcceptDocumentItemMapper mapper;
    private final AcceptDocumentMapper a_mapper;
    private final AcceptDocumentRepository a_repository;
    private final ProductMapper p_mapper;
    private final ProductRepository p_repository;
    @Override
    public AcceptDocumentItemResDTO getById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<AcceptDocumentItemResDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public AcceptDocumentItemResDTO create(AcceptDocumentItemDTO acceptDocumentItemDTO) {
        AcceptDocumentItem item = mapper.toENT(acceptDocumentItemDTO);
        item.setAcceptDocument(a_repository.getReferenceById(acceptDocumentItemDTO.getAcceptDocument().getId()));
        item.setProduct(p_repository.getReferenceById(acceptDocumentItemDTO.getProduct().getId()));
        addProduct(item);
        return mapper.toDTO(repository.save(item));
    }

    @Override
    public AcceptDocumentItemResDTO update(Long id, AcceptDocumentItemDTO acceptDocumentItemDTO) {
        AcceptDocumentItem documentItem = repository.getReferenceById(id);
        documentItem.setAcceptDocument(a_mapper.toENT(acceptDocumentItemDTO.getAcceptDocument()));
        documentItem.setProduct(p_mapper.toENT(acceptDocumentItemDTO.getProduct()));
        documentItem.setComePrice(acceptDocumentItemDTO.getComePrice());
        documentItem.setCount(acceptDocumentItemDTO.getCount());
        return mapper.toDTO(repository.save(documentItem));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
    @PrePersist
    public void addProduct(AcceptDocumentItem item){
        if (item.getAcceptDocument().getStatus()==DocStatus.DONE){
            Product product = p_repository.getReferenceById(item.getProduct().getId());
            long amount = product.getAmount();
            amount+=item.getCount();
            product.setAmount(amount);
            p_repository.save(product);
        }
    }
}
