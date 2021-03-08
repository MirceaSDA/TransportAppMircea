package org.example.transport.entities;

import javax.persistence.*;

@Entity
@Table(name = "companies")
public class CompanyEntity {

    @Id
    @Column(name = "CUI", length = 10)
    private String cui;

    @Column(name = "companyVAT")
    private String companyVAT;

    @Column(name = "companyName")
    private String companyName;

    @Column(name = "companyCommerceRegistryNumber")
    private String companyCommerceRegistryNumber;

    @Column(name = "companyAddress")
    private String companyAddress;

    @Column(name = "companyTown")
    private String companyTown;

    @Column(name = "companyCountry")
    private String companyCountry;

    @Column(name = "companyBankAccount")
    private String CompanyBankAccount;

    @Column(name = "companyBank")
    private String companyBank;

    @Column(name = "invoiceDomesticSerial")
    private String invoiceDomesticSerial;

    @Column(name = "invoiceExternalSerial")
    private String invoiceExternalSerial;

    @Column(name = "companyType")
    private Integer companyType;

    @Column(name = "companyStatus")
    private Integer companyStatus;

//    @OneToOne(mappedBy = "company")
//    private TransportEntity transport;

    public CompanyEntity() {

    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public String getCompanyVAT() {
        return companyVAT;
    }

    public void setCompanyVAT(String companyVAT) {
        this.companyVAT = companyVAT;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyCommerceRegistryNumber() {
        return companyCommerceRegistryNumber;
    }

    public void setCompanyCommerceRegistryNumber(String companyCommerceRegistryNumber) {
        this.companyCommerceRegistryNumber = companyCommerceRegistryNumber;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyTown() {
        return companyTown;
    }

    public void setCompanyTown(String companyTown) {
        this.companyTown = companyTown;
    }

    public String getCompanyCountry() {
        return companyCountry;
    }

    public void setCompanyCountry(String companyCountry) {
        this.companyCountry = companyCountry;
    }

    public String getCompanyBankAccount() {
        return CompanyBankAccount;
    }

    public void setCompanyBankAccount(String companyBankAccount) {
        CompanyBankAccount = companyBankAccount;
    }

    public String getCompanyBank() {
        return companyBank;
    }

    public void setCompanyBank(String companyBank) {
        this.companyBank = companyBank;
    }

    public String getInvoiceDomesticSerial() {
        return invoiceDomesticSerial;
    }

    public void setInvoiceDomesticSerial(String invoiceDomesticSerial) {
        this.invoiceDomesticSerial = invoiceDomesticSerial;
    }

    public String getInvoiceExternalSerial() {
        return invoiceExternalSerial;
    }

    public void setInvoiceExternalSerial(String invoiceExternalSerial) {
        this.invoiceExternalSerial = invoiceExternalSerial;
    }

    public Integer getCompanyType() {
        return companyType;
    }

    public void setCompanyType(Integer companyType) {
        this.companyType = companyType;
    }

    public Integer getCompanyStatus() {
        return companyStatus;
    }

    public void setCompanyStatus(Integer companyStatus) {
        this.companyStatus = companyStatus;
    }

//    public TransportEntity getTransport() {
//        return transport;
//    }
//
//    public void setTransport(TransportEntity transport) {
//        this.transport = transport;
//    }
}
