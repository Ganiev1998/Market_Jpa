package example.market_jpa.mapper.impl;

import example.market_jpa.dto.company.CompanyDTO;
import example.market_jpa.dto.company.CompanyResDTO;
import example.market_jpa.entity.Company;
import example.market_jpa.mapper.Mapper;
@org.mapstruct.Mapper(componentModel = "spring")
public interface CompanyMapper extends Mapper<CompanyDTO, CompanyResDTO, Company> {
}
