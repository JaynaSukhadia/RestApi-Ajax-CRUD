package com.aurosoft.companyrestapi.repository;

import com.aurosoft.companyrestapi.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository  extends JpaRepository<Company, Integer> {
}
