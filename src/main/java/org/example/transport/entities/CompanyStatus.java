package org.example.transport.entities;

import javax.persistence.*;

@Entity
@Table(name = "company_status")
public class CompanyStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "companyStatusId")
    private Integer companyStatusId;

    @Column(name = "companyStatusDescription")
    private String companyStatusDescription;

    public CompanyStatus() {

    }

    public Integer getCompanyStatusId() {
        return companyStatusId;
    }

    public void setCompanyStatusId(Integer companyStatusId) {
        this.companyStatusId = companyStatusId;
    }

    public String getCompanyStatusDescription() {
        return companyStatusDescription;
    }

    public void setCompanyStatusDescription(String companyStatusDescription) {
        this.companyStatusDescription = companyStatusDescription;
    }
}
