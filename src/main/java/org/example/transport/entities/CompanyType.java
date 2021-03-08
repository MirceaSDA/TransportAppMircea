package org.example.transport.entities;

import javax.persistence.*;

@Entity
@Table(name = "company_type")
public class CompanyType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "companyTypeId")
    private Integer companyTypeId;

    @Column(name = "companyTypeDescription")
    private String companyTypeDescription;

    public CompanyType() {

    }

    public Integer getCompanyTypeId() {
        return companyTypeId;
    }

    public void setCompanyTypeId(Integer companyTypeId) {
        this.companyTypeId = companyTypeId;
    }

    public String getCompanyTypeDescription() {
        return companyTypeDescription;
    }

    public void setCompanyTypeDescription(String companyTypeDescription) {
        this.companyTypeDescription = companyTypeDescription;
    }
}
