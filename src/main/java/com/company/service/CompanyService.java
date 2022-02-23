package com.company.service;

import com.company.model.dto.CompanyDTO;

public interface CompanyService {

	CompanyDTO create(CompanyDTO companyDTO);

	CompanyDTO getCompanyById(Integer id);

}
