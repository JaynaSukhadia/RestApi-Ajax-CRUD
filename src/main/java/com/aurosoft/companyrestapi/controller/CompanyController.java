package com.aurosoft.companyrestapi.controller;


import com.aurosoft.companyrestapi.entity.Company;
import com.aurosoft.companyrestapi.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CompanyController {
@Autowired
    private  CompanyService companyService;


@GetMapping("/companyList")
public ResponseEntity<List<Company>> getCompanyList()
{
    return new ResponseEntity<List<Company>>(companyService.getAllCompanies(), HttpStatus.OK);
}
@GetMapping("company/{id}")
public  ResponseEntity<Company> getCompany(@PathVariable int id)
{
    return new ResponseEntity<Company>(companyService.getCompanyById(id), HttpStatus.OK);
}

    @PostMapping("/company/insert")
    public ResponseEntity<Void> insertCompany(@RequestBody Company company) {
        companyService.insertCompany(company);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @PostMapping("/company/update")
    public ResponseEntity<Void> updateCompany(@RequestBody Company company) {
        companyService.updateCompany(company);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping("/company/delete/{id}")
    public ResponseEntity<Void> deleteCompany(@PathVariable Integer id) {
        companyService.deleteCompany(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
