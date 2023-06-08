package com.aurosoft.companyrestapi.service;

import com.aurosoft.companyrestapi.entity.Company;

import java.util.List;

public interface CompanyService {

    List<Company> getAllCompanies();
    Company getCompanyById(int id);

    Company insertCompany(Company company);

    Company updateCompany(Company company);

    int deleteCompany(int id);

}
