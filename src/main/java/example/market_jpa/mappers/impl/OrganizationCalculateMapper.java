package example.market_jpa.mappers.impl;

import example.market_jpa.dto.organizationCalculate.OrganizationCalculateDTO;
import example.market_jpa.dto.organizationCalculate.OrganizationCalculateResDTO;
import example.market_jpa.entity.OrganizationCalculate;
import example.market_jpa.mappers.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrganizationCalculateMapper extends EntityMapper<OrganizationCalculateDTO, OrganizationCalculate, OrganizationCalculateResDTO> {
}
