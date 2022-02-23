package com.company.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.model.dto.CompanyDTO;
import com.company.model.entity.Company;
import com.company.model.repository.CompanyRepository;
import com.company.service.CompanyService;
import com.company.service.mapper.CompanyMapper;

import lombok.SneakyThrows;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyRepository companyRepository;

	@Autowired
	CompanyMapper companyMapper;

	@SneakyThrows
	public CompanyDTO create(CompanyDTO companyDTO) {

		CompanyDTO companyDTOtoReturn = new CompanyDTO();

		Company company = companyMapper.toCompany(companyDTO);
		company.setAddres(company.getAddres());
		company.setId(company.getId());
		company.setName(company.getName());

		Company newCompany = companyRepository.save(company);

		companyDTOtoReturn = companyMapper.toCompanyDTO(newCompany);

		return companyDTOtoReturn;
	}

	@SneakyThrows
	public CompanyDTO getCompanyById(Integer id) {

		Company companyFound = companyRepository.findById(id).get();
		CompanyDTO companyToReturn = companyMapper.toCompanyDTO(companyFound);

		return companyToReturn;
	}

}
