package example.market_jpa.service;

import example.market_jpa.dto.saleDocument.SaleDocumentDTO;
import example.market_jpa.dto.saleDocument.SaleDocumentResDTO;

import java.util.List;

public interface SaleDocumentService extends Service<SaleDocumentResDTO, SaleDocumentDTO> {
    @Override
    SaleDocumentResDTO getById(Long id);

    @Override
    List<SaleDocumentResDTO> getAll();

    @Override
    SaleDocumentResDTO create(SaleDocumentDTO saleDocumentDTO);

    @Override
    SaleDocumentResDTO update(Long id, SaleDocumentDTO saleDocumentDTO);

    @Override
    void delete(Long id);
}
