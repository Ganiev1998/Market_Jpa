package example.market_jpa.service;

import example.market_jpa.dto.category.CategoryDTO;
import example.market_jpa.dto.category.CategoryResDTO;
import example.market_jpa.dto.product.ProductDTO;
import example.market_jpa.dto.product.ProductResDTO;
import example.market_jpa.dto.product.ProductResDTO;

import java.util.List;

public interface ProductService extends Service<ProductResDTO, ProductDTO> {

    @Override
    ProductResDTO getById(Long id);

    @Override
    List<ProductResDTO> getAll();

    @Override
    ProductResDTO create(ProductDTO productDTO);

    @Override
    ProductResDTO update(Long id, ProductDTO productDTO);

    @Override
    void delete(Long id);
}
