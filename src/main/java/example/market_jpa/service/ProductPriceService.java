package example.market_jpa.service;

import example.market_jpa.dto.productPrice.ProductPriceDTO;
import example.market_jpa.dto.productPrice.ProductPriceResDTO;

import java.util.List;

public interface ProductPriceService extends Service<ProductPriceResDTO, ProductPriceDTO> {
    @Override
    ProductPriceResDTO getById(Long id);

    @Override
    List<ProductPriceResDTO> getAll();

    @Override
    ProductPriceResDTO create(ProductPriceDTO productPriceDTO);

    @Override
    ProductPriceResDTO update(Long id, ProductPriceDTO productPriceDTO);

    @Override
    void delete(Long id);
}
