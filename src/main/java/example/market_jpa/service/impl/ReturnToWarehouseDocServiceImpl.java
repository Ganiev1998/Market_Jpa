package example.market_jpa.service.impl;

import example.market_jpa.dto.returnToWarehouseDoc.ReturnToWarehouseDocDTO;
import example.market_jpa.dto.returnToWarehouseDoc.ReturnToWarehouseDocResDTO;
import example.market_jpa.entity.ReturnToWarehouseDoc;
import example.market_jpa.mappers.impl.ReturnToWarehouseDocMapper;
import example.market_jpa.repository.ReturnToWarehouseDocRepository;
import example.market_jpa.service.ReturnToWarehouseDocService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ReturnToWarehouseDocServiceImpl implements ReturnToWarehouseDocService {
    private final ReturnToWarehouseDocRepository repository;
    private final ReturnToWarehouseDocMapper mapper;
    @Override
    public ReturnToWarehouseDocResDTO getById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<ReturnToWarehouseDocResDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public ReturnToWarehouseDocResDTO create(ReturnToWarehouseDocDTO returnToWarehouseDocDTO) {
        return mapper.toDTO(repository.save(mapper.toENT(returnToWarehouseDocDTO)));
    }

    @Override
    public ReturnToWarehouseDocResDTO update(Long id, ReturnToWarehouseDocDTO returnToWarehouseDocDTO) {
        ReturnToWarehouseDoc doc = repository.getReferenceById(id);
        doc.setDocNumber(returnToWarehouseDocDTO.getDocNumber());
        doc.setDate(returnToWarehouseDocDTO.getDate());
        return mapper.toDTO(repository.save(doc));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
