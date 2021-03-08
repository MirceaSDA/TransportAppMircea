package org.example.transport.services;

import org.example.transport.entities.CompanyEntity;
import org.example.transport.repositories.CompaniesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class CompanyServices {

    @Autowired
    private CompaniesRepository companiesRepository;

    private static final Logger logger = LoggerFactory.getLogger(CompanyServices.class);

    public CompanyServices() {
        logger.info(getClass().getSimpleName() + " created");
    }

    public List<CompanyEntity> getAllCompanies() {
        List<CompanyEntity> companies = companiesRepository.findAll();
        companies.sort(Comparator.comparing(CompanyEntity::getCompanyName));
        return companies;
    }

    public CompanyEntity getCompany(String cui) {
        return companiesRepository.getOne(cui);
    }

    public void saveCompany(CompanyEntity companyEntity) {
        companiesRepository.save(companyEntity);
    }

    public void deleteCompany(String cui) {
        CompanyEntity companyEntity = companiesRepository.getOne(cui);
        companyEntity.setCompanyStatus(2);
        companiesRepository.save(companyEntity);
    }
}
