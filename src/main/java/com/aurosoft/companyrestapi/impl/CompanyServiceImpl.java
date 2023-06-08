package com.aurosoft.companyrestapi.impl;

import com.aurosoft.companyrestapi.entity.Company;
import com.aurosoft.companyrestapi.repository.CompanyRepository;
import com.aurosoft.companyrestapi.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company getCompanyById(int id) {
        return companyRepository.findById(id).orElseThrow();
    }

    @Override
    public Company insertCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Company updateCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public int deleteCompany(int id) {
        companyRepository.deleteById(id);
        return id;
    }

}
