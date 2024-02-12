package example.market_jpa.service;

import example.market_jpa.dto.returnToWarehouseDocItem.ReturnToWarehouseDocItemDTO;
import example.market_jpa.dto.returnToWarehouseDocItem.ReturnToWarehouseDocItemResDTO;

import java.security.Provider;
import java.util.List;

public interface ReturnToWarehouseDocItemService extends Service<ReturnToWarehouseDocItemResDTO, ReturnToWarehouseDocItemDTO> {
    @Override
    ReturnToWarehouseDocItemResDTO getById(Long id);

    @Override
    List<ReturnToWarehouseDocItemResDTO> getAll();

    @Override
    ReturnToWarehouseDocItemResDTO create(ReturnToWarehouseDocItemDTO returnToWarehouseDocItemDTO);

    @Override
    ReturnToWarehouseDocItemResDTO update(Long id, ReturnToWarehouseDocItemDTO returnToWarehouseDocItemDTO);

    @Override
    void delete(Long id);
}
