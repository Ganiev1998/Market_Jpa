package example.market_jpa.service;

import example.market_jpa.dto.acceptDocument.AcceptDocumentDTO;
import example.market_jpa.dto.acceptDocument.AcceptDocumentResDTO;

import java.util.List;

public interface AcceptDocumentService extends Service<AcceptDocumentResDTO, AcceptDocumentDTO> {
    @Override
    AcceptDocumentResDTO getById(Long id);

    @Override
    List<AcceptDocumentResDTO> getAll();

    @Override
    AcceptDocumentResDTO create(AcceptDocumentDTO acceptDocumentDTO);

    @Override
    AcceptDocumentResDTO update(Long id, AcceptDocumentDTO acceptDocumentDTO);

    @Override
    void delete(Long id);
}
