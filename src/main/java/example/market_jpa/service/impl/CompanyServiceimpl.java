package example.market_jpa.service.impl;

import example.market_jpa.dto.company.CompanyDTO;
import example.market_jpa.dto.company.CompanyResDTO;
import example.market_jpa.entity.Company;
import example.market_jpa.mapper.impl.CompanyMapper;
import example.market_jpa.repository.CompanyRepository;
import example.market_jpa.service.CompanyService;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@Setter
@RequiredArgsConstructor
@Builder
public class CompanyServiceimpl implements CompanyService {
    private final CompanyRepository repository;
    private final CompanyMapper mapper;

    @Override
    public CompanyResDTO getById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<CompanyResDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public CompanyResDTO create(CompanyDTO companyDTO) {
        return mapper.toDTO(repository.save(mapper.toENT(companyDTO)));
    }

    @Override
    public CompanyResDTO update(Long id, CompanyDTO companyDTO) {
        Company company = repository.getReferenceById(id);
        company.setCompanyName(companyDTO.getCompanyName());
        company.setAddress(companyDTO.getAddress());
        company.setTell(companyDTO.getTell());
        company.setDescription(companyDTO.getDescription());
        return mapper.toDTO(repository.save(company));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
