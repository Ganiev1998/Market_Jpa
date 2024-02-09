package example.market_jpa.service.impl;

import example.market_jpa.dto.storeDocument.StoreDocumentDTO;
import example.market_jpa.dto.storeDocument.StoreDocumentResDTO;
import example.market_jpa.entity.StoreDocument;
import example.market_jpa.mappers.impl.StoreDocumentMapper;
import example.market_jpa.repository.StoreDocumentRepository;
import example.market_jpa.service.StoreDocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class StoreDocumentServiceImpl implements StoreDocumentService {
    private final StoreDocumentRepository repository;
    private final StoreDocumentMapper mapper;
    @Override
    public StoreDocumentResDTO getById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<StoreDocumentResDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public StoreDocumentResDTO create(StoreDocumentDTO storeDocumentDTO) {
        return mapper.toDTO(repository.save(mapper.toENT(storeDocumentDTO)));
    }

    @Override
    public StoreDocumentResDTO update(Long id, StoreDocumentDTO storeDocumentDTO) {
        StoreDocument document = repository.getReferenceById(id);
        document.setDocNumber(storeDocumentDTO.getDocNumber());
        document.setDate(storeDocumentDTO.getDate());
        return mapper.toDTO(repository.save(document));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
