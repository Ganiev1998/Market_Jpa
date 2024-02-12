package example.market_jpa.service;

import example.market_jpa.dto.returnToWarehouseDoc.ReturnToWarehouseDocDTO;
import example.market_jpa.dto.returnToWarehouseDoc.ReturnToWarehouseDocResDTO;
import example.market_jpa.entity.ReturnToWarehouseDoc;

import java.util.List;

public interface ReturnToWarehouseDocService extends Service<ReturnToWarehouseDocResDTO, ReturnToWarehouseDocDTO> {
    @Override
    ReturnToWarehouseDocResDTO getById(Long id);

    @Override
    List<ReturnToWarehouseDocResDTO> getAll();

    @Override
    ReturnToWarehouseDocResDTO create(ReturnToWarehouseDocDTO returnToWarehouseDocDTO);

    @Override
    ReturnToWarehouseDocResDTO update(Long id, ReturnToWarehouseDocDTO returnToWarehouseDocDTO);

    @Override
    void delete(Long id);
}
