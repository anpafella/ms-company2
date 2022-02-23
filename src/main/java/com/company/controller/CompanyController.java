package com.company.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.model.dto.CompanyDTO;
import com.company.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private CompanyService companyService;

	@PostMapping("/crear")
	public CompanyDTO create(@RequestBody @Valid CompanyDTO company) {

		CompanyDTO compañiaRecibida = companyService.create(company);

		return compañiaRecibida;

	}

	@GetMapping("/{id}/get")
	public CompanyDTO getCompanyById(@PathVariable(value = "id") Integer id) {
		CompanyDTO compañiaEncontrada = companyService.getCompanyById(id);
		return compañiaEncontrada;

	}

}
