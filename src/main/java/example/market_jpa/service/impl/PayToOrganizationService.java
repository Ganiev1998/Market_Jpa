package example.market_jpa.service.impl;

import example.market_jpa.dto.payToOrganization.PayToOrganizationDTO;
import example.market_jpa.dto.payToOrganization.PayToOrganizationResDTO;
import example.market_jpa.entity.PayToOrganization;
import example.market_jpa.mappers.impl.CompanyMapper;
import example.market_jpa.mappers.impl.PayToOrganizationMapper;
import example.market_jpa.repository.CompanyRepository;
import example.market_jpa.repository.PayToOrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PayToOrganizationService implements example.market_jpa.service.Service<PayToOrganizationResDTO, PayToOrganizationDTO> {

    private final PayToOrganizationRepository repository;
    private final PayToOrganizationMapper mapper;
    private final CompanyRepository c_repository;
    private final CompanyMapper c_mapper;
    @Override
    public PayToOrganizationResDTO getById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<PayToOrganizationResDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public PayToOrganizationResDTO create(PayToOrganizationDTO payToOrganizationDTO) {
        payToOrganizationDTO.setCompany(c_mapper.toDTO2(c_repository.getReferenceById(payToOrganizationDTO.getCompany().getId())));
        return mapper.toDTO(repository.save(mapper.toENT(payToOrganizationDTO)));
    }

    @Override
    public PayToOrganizationResDTO update(Long id, PayToOrganizationDTO payToOrganizationDTO) {
        PayToOrganization payToOrganization = repository.getReferenceById(id);
        payToOrganization.setCompany(c_repository.getReferenceById(payToOrganizationDTO.getCompany().getId()));
        payToOrganization.setDate(payToOrganizationDTO.getDate());
        payToOrganization.setPaySum(payToOrganizationDTO.getPaySum());
        return mapper.toDTO(repository.save(payToOrganization));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
