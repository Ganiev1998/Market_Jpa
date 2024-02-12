package example.market_jpa.service;

import example.market_jpa.dto.returnToStoreDocItem.ReturnToStoreDocItemDTO;
import example.market_jpa.dto.returnToStoreDocItem.ReturnToStoreDocItemResDTO;

import java.util.List;

public interface ReturnToStoreDocitemService extends Service<ReturnToStoreDocItemResDTO, ReturnToStoreDocItemDTO> {
    @Override
    ReturnToStoreDocItemResDTO getById(Long id);

    @Override
    List<ReturnToStoreDocItemResDTO> getAll();

    @Override
    ReturnToStoreDocItemResDTO create(ReturnToStoreDocItemDTO returnToStoreDocItemDTO);

    @Override
    ReturnToStoreDocItemResDTO update(Long id, ReturnToStoreDocItemDTO returnToStoreDocItemDTO);

    @Override
    void delete(Long id);
}
