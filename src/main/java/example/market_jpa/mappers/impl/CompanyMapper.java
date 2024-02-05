package example.market_jpa.mappers.impl;

import example.market_jpa.dto.company.CompanyDTO;
import example.market_jpa.dto.company.CompanyResDTO;
import example.market_jpa.dto.product.ProductResDTO;
import example.market_jpa.entity.Company;
import example.market_jpa.mappers.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompanyMapper extends EntityMapper<CompanyDTO, Company, CompanyResDTO> {
}
