package example.market_jpa.service.impl;

import example.market_jpa.dto.saleDocument.SaleDocumentDTO;
import example.market_jpa.dto.saleDocument.SaleDocumentResDTO;
import example.market_jpa.dto.salleDocumentItem.SaleDocumentItemDTO;
import example.market_jpa.dto.salleDocumentItem.SaleDocumentItemResDTO;
import example.market_jpa.entity.SaleDocument;
import example.market_jpa.entity.SaleDocumentItem;
import example.market_jpa.entity.StoreProduct;
import example.market_jpa.mappers.impl.SaleDocItemMapper;
import example.market_jpa.mappers.impl.SaleDocMapper;
import example.market_jpa.mappers.impl.StoreProductMapper;
import example.market_jpa.repository.SaleDocumentItemRepository;
import example.market_jpa.repository.SaleDocumentRepository;
import example.market_jpa.repository.StoreProductRepository;
import example.market_jpa.service.SaleDocumentItemService;
import example.market_jpa.service.SaleDocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class SaleDocumentItemServiceImpl implements SaleDocumentItemService {
    private final SaleDocumentItemRepository repository;
    private final SaleDocItemMapper mapper;
    private final SaleDocMapper docMapper;
    private final SaleDocumentRepository docRepository;
    private final StoreProductMapper productMapper;
    private final StoreProductRepository productRepository;

    @Override
    public SaleDocumentItemResDTO getById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<SaleDocumentItemResDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public SaleDocumentItemResDTO create(SaleDocumentItemDTO saleDocumentItemDTO) {
        SaleDocumentItem item = mapper.toENT(saleDocumentItemDTO);
        item.setSaleDocument(docRepository.getReferenceById(saleDocumentItemDTO.getSaleDocument().getId()));
        item.setStoreProduct(productRepository.getReferenceById(saleDocumentItemDTO.getStoreProduct().getId()));
        decrease(saleDocumentItemDTO);
        return mapper.toDTO(repository.save(item));
    }

    @Override
    public SaleDocumentItemResDTO update(Long id, SaleDocumentItemDTO saleDocumentItemDTO) {
        SaleDocumentItem documentItem = repository.getReferenceById(id);
        documentItem.setSaleDocument(docMapper.toENT(saleDocumentItemDTO.getSaleDocument()));
        documentItem.setStoreProduct(productMapper.toENT(saleDocumentItemDTO.getStoreProduct()));
        documentItem.setPrice(saleDocumentItemDTO.getPrice());
        documentItem.setCount(saleDocumentItemDTO.getCount());
        return mapper.toDTO(repository.save(documentItem));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
    public void decrease(SaleDocumentItemDTO dto){
        StoreProduct product = productRepository.getReferenceById(dto.getStoreProduct().getId());
        product.setAmount(product.getAmount()-dto.getCount());
        productRepository.save(product);
    }
}
