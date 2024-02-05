package example.market_jpa.service;

import example.market_jpa.dto.acceptDocumentItem.AcceptDocumentItemDTO;
import example.market_jpa.dto.acceptDocumentItem.AcceptDocumentItemResDTO;

import java.util.List;

public interface AcceptDocumentItemService extends Service<AcceptDocumentItemResDTO, AcceptDocumentItemDTO> {
    @Override
    AcceptDocumentItemResDTO getById(Long id);

    @Override
    List<AcceptDocumentItemResDTO> getAll();

    @Override
    AcceptDocumentItemResDTO create(AcceptDocumentItemDTO acceptDocumentItemDTO);

    @Override
    AcceptDocumentItemResDTO update(Long id, AcceptDocumentItemDTO acceptDocumentItemDTO);

    @Override
    void delete(Long id);
}
