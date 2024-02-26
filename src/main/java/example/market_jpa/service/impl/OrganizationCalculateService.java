package example.market_jpa.service.impl;

import example.market_jpa.dto.organizationCalculate.OrganizationCalculateDTO;
import example.market_jpa.dto.organizationCalculate.OrganizationCalculateResDTO;
import example.market_jpa.entity.OrganizationCalculate;
import example.market_jpa.mappers.impl.CompanyMapper;
import example.market_jpa.mappers.impl.OrganizationCalculateMapper;
import example.market_jpa.repository.CompanyRepository;
import example.market_jpa.repository.OrganizationCalculateRepository;
import example.market_jpa.service.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;
@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class OrganizationCalculateService implements Service<OrganizationCalculateResDTO, OrganizationCalculateDTO> {
    private final OrganizationCalculateRepository repository;
    private final OrganizationCalculateMapper mapper;
    private final CompanyRepository c_repository;
    private final CompanyMapper c_mapper;
    @Override
    public OrganizationCalculateResDTO getById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<OrganizationCalculateResDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public OrganizationCalculateResDTO create(OrganizationCalculateDTO organizationCalculateDTO) {
        organizationCalculateDTO.setCompany(c_mapper.toDTO2(c_repository.getReferenceById(organizationCalculateDTO.getCompany().getId())));
        return mapper.toDTO(repository.save(mapper.toENT(organizationCalculateDTO)));
    }

    @Override
    public OrganizationCalculateResDTO update(Long id, OrganizationCalculateDTO organizationCalculateDTO) {
        OrganizationCalculate calculate = repository.getReferenceById(id);
        calculate.setCompany(c_mapper.toENT(organizationCalculateDTO.getCompany()));
        calculate.setTake_sum(organizationCalculateDTO.getTake_sum());
        calculate.setPay_sum(organizationCalculateDTO.getPay_sum());
        return mapper.toDTO(repository.save(calculate));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
