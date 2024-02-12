package example.market_jpa.service.impl;

import example.market_jpa.dto.returnToStoreDoc.ReturnToStoreDocDTO;
import example.market_jpa.dto.returnToStoreDoc.ReturnToStoreDocResDTO;
import example.market_jpa.entity.ReturnToStoreDoc;
import example.market_jpa.mappers.impl.ReturnToStoreDocMapper;
import example.market_jpa.repository.ReturnToStoreDocRepository;
import example.market_jpa.service.ReturnToStoreDocService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ReturnToStoreDocServiceImpl implements ReturnToStoreDocService {
    private final ReturnToStoreDocRepository repository;
    private final ReturnToStoreDocMapper mapper;
    @Override
    public ReturnToStoreDocResDTO getById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<ReturnToStoreDocResDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public ReturnToStoreDocResDTO create(ReturnToStoreDocDTO returnToStoreDocDTO) {
        return mapper.toDTO(repository.save(mapper.toENT(returnToStoreDocDTO)));
    }

    @Override
    public ReturnToStoreDocResDTO update(Long id, ReturnToStoreDocDTO returnToStoreDocDTO) {
        ReturnToStoreDoc doc = repository.getReferenceById(id);
        doc.setDocNumber(returnToStoreDocDTO.getDocNumber());
        doc.setDate(returnToStoreDocDTO.getDate());
        return mapper.toDTO(repository.save(doc));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
