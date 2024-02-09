package example.market_jpa.service.impl;

import example.market_jpa.dto.saleDocument.SaleDocumentDTO;
import example.market_jpa.dto.saleDocument.SaleDocumentResDTO;
import example.market_jpa.entity.SaleDocument;
import example.market_jpa.mappers.impl.SaleDocMapper;
import example.market_jpa.repository.SaleDocumentRepository;
import example.market_jpa.service.SaleDocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class SaleDocumentServiceImpl implements SaleDocumentService {
    private final SaleDocumentRepository repository;
    private final SaleDocMapper mapper;
    @Override
    public SaleDocumentResDTO getById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<SaleDocumentResDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public SaleDocumentResDTO create(SaleDocumentDTO saleDocumentDTO) {
        return mapper.toDTO(repository.save(mapper.toENT(saleDocumentDTO)));
    }

    @Override
    public SaleDocumentResDTO update(Long id, SaleDocumentDTO saleDocumentDTO) {
        SaleDocument document = repository.getReferenceById(id);
        document.setDocNumber(saleDocumentDTO.getDocNumber());
        document.setDate(saleDocumentDTO.getDate());
        return mapper.toDTO(repository.save(document));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
