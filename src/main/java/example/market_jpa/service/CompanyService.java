package example.market_jpa.service;

import example.market_jpa.dto.company.CompanyDTO;
import example.market_jpa.dto.company.CompanyResDTO;

import java.util.List;

public interface CompanyService extends Service<CompanyResDTO, CompanyDTO> {

    @Override
    CompanyResDTO getById(Long id);

    @Override
    List<CompanyResDTO> getAll();

    @Override
    CompanyResDTO create(CompanyDTO companyDTO);


    @Override
    CompanyResDTO update(Long id, CompanyDTO companyDTO);

    @Override
    void delete(Long id);
}
