package com.company.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company.model.entity.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer>{

}
