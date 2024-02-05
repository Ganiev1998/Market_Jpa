package example.market_jpa.service.impl;

import example.market_jpa.dto.acceptDocument.AcceptDocumentDTO;
import example.market_jpa.dto.acceptDocument.AcceptDocumentResDTO;
import example.market_jpa.entity.AcceptDocument;
import example.market_jpa.mappers.impl.AcceptDocumentItemMapper;
import example.market_jpa.mappers.impl.AcceptDocumentMapper;
import example.market_jpa.mappers.impl.CompanyMapper;
import example.market_jpa.repository.AcceptDocumentItemRepository;
import example.market_jpa.repository.AcceptDocumentRepository;
import example.market_jpa.service.AcceptDocumentService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Data

public class AcceptDocumentServiceimpl implements AcceptDocumentService {
    private final AcceptDocumentRepository repository;
    private final AcceptDocumentMapper mapper;
    private final CompanyMapper c_mapper;
    @Override
    public AcceptDocumentResDTO getById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<AcceptDocumentResDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public AcceptDocumentResDTO create(AcceptDocumentDTO acceptDocumentDTO) {
        return mapper.toDTO(repository.save(mapper.toENT(acceptDocumentDTO)));
    }

    @Override
    public AcceptDocumentResDTO update(Long id, AcceptDocumentDTO acceptDocumentDTO) {
        AcceptDocument document = repository.getReferenceById(id);
        document.setDocNumber(acceptDocumentDTO.getDocNumber());
        document.setCompany(c_mapper.toENT(acceptDocumentDTO.getCompany()));
        document.setDate(acceptDocumentDTO.getDate());
        return mapper.toDTO(repository.save(document));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
