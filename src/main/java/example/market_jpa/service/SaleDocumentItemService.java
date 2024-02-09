package example.market_jpa.service;

import example.market_jpa.dto.salleDocumentItem.SaleDocumentItemDTO;
import example.market_jpa.dto.salleDocumentItem.SaleDocumentItemResDTO;

import java.util.List;

public interface SaleDocumentItemService extends Service<SaleDocumentItemResDTO, SaleDocumentItemDTO> {
    @Override
    SaleDocumentItemResDTO getById(Long id);

    @Override
    List<SaleDocumentItemResDTO> getAll();

    @Override
    SaleDocumentItemResDTO create(SaleDocumentItemDTO saleDocumentItemDTO);

    @Override
    SaleDocumentItemResDTO update(Long id, SaleDocumentItemDTO saleDocumentItemDTO);

    @Override
    void delete(Long id);
}
