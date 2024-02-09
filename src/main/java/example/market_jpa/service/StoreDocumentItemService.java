package example.market_jpa.service;

import example.market_jpa.dto.storeDocItem.StoreDocItemDTO;
import example.market_jpa.dto.storeDocItem.StoreDocItemResDTO;

import java.util.List;

public interface StoreDocumentItemService extends Service<StoreDocItemResDTO, StoreDocItemDTO> {
    @Override
    StoreDocItemResDTO getById(Long id);

    @Override
    List<StoreDocItemResDTO> getAll();

    @Override
    StoreDocItemResDTO create(StoreDocItemDTO storeDocItemDTO);

    @Override
    StoreDocItemResDTO update(Long id, StoreDocItemDTO storeDocItemDTO);

    @Override
    void delete(Long id);
}
