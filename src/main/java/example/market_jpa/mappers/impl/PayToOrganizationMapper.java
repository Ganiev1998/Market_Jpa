package example.market_jpa.mappers.impl;

import example.market_jpa.dto.payToOrganization.PayToOrganizationDTO;
import example.market_jpa.dto.payToOrganization.PayToOrganizationResDTO;
import example.market_jpa.entity.PayToOrganization;
import example.market_jpa.mappers.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PayToOrganizationMapper extends EntityMapper<PayToOrganizationDTO, PayToOrganization, PayToOrganizationResDTO> {
}
