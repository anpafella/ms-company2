package com.company.service.mapper;

import org.springframework.stereotype.Component;

import com.company.model.dto.CompanyDTO;
import com.company.model.entity.Company;

@Component
public class CompanyMapper {

	public Company toCompany(CompanyDTO companyDTO) {
		Company company = new Company();

		company.setId(companyDTO.getId());
		company.setName(companyDTO.getName());
		company.setAddres(companyDTO.getAddres());

		return company;
	}

	public CompanyDTO toCompanyDTO(Company company) {
		CompanyDTO companyDTO = new CompanyDTO();

		companyDTO.setId(company.getId());
		companyDTO.setName(company.getName());
		companyDTO.setAddres(company.getAddres());

		return companyDTO;

	}

}
