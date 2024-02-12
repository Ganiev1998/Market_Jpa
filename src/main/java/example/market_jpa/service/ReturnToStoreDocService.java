package example.market_jpa.service;

import example.market_jpa.dto.returnToStoreDoc.ReturnToStoreDocDTO;
import example.market_jpa.dto.returnToStoreDoc.ReturnToStoreDocResDTO;

import java.util.List;

public interface ReturnToStoreDocService extends Service<ReturnToStoreDocResDTO, ReturnToStoreDocDTO> {
    @Override
    ReturnToStoreDocResDTO getById(Long id);

    @Override
    List<ReturnToStoreDocResDTO> getAll();

    @Override
    ReturnToStoreDocResDTO create(ReturnToStoreDocDTO returnToStoreDocDTO);

    @Override
    ReturnToStoreDocResDTO update(Long id, ReturnToStoreDocDTO returnToStoreDocDTO);

    @Override
    void delete(Long id);
}
