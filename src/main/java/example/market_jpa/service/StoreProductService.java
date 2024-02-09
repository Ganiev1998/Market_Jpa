package example.market_jpa.service;

import example.market_jpa.dto.storeProduct.StoreProductDTO;
import example.market_jpa.dto.storeProduct.StoreProductResDTO;

import java.util.List;

public interface StoreProductService extends Service<StoreProductResDTO, StoreProductDTO> {
    @Override
    StoreProductResDTO getById(Long id);

    @Override
    List<StoreProductResDTO> getAll();

    @Override
    StoreProductResDTO create(StoreProductDTO storeProductDTO);

    @Override
    StoreProductResDTO update(Long id, StoreProductDTO storeProductDTO);

    @Override
    void delete(Long id);
}
