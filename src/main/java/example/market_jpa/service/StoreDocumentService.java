package example.market_jpa.service;

import example.market_jpa.dto.storeDocument.StoreDocumentDTO;
import example.market_jpa.dto.storeDocument.StoreDocumentResDTO;

import java.util.List;

public interface StoreDocumentService extends Service<StoreDocumentResDTO, StoreDocumentDTO> {
    @Override
    StoreDocumentResDTO getById(Long id);

    @Override
    List<StoreDocumentResDTO> getAll();

    @Override
    StoreDocumentResDTO create(StoreDocumentDTO storeDocumentDTO);

    @Override
    StoreDocumentResDTO update(Long id, StoreDocumentDTO storeDocumentDTO);

    @Override
    void delete(Long id);
}
