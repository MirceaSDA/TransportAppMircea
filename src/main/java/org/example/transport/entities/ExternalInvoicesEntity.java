package org.example.transport.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "external_invoices")
public class ExternalInvoicesEntity {

    @Column(name = "invoiceSerial")
    private String invoiceSerial;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoiceNumber")
    private Integer invoiceNumber;

    @Column(name = "invoiceDate")
    private Timestamp invoiceDate;

    @Column(name = "sellerCompany")
    private String sellerCompany;

    @Column(name = "buyerCompany")
    private String buyerCompany;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Double price;

    @Column(name = "currency")
    private String currency;

    @Column(name = "exchangeRate")
    private Double exchangeRate;

    @Column(name = "VATpercentage")
    private Double VATpercentage;

    @Column(name = "VATvalue")
    private Double VATvalue; //= price * VATpercentage

    @Column(name = "VATcustomMessage")
    private String VATcustomMessage = "Neimpozabil in Romania";

    @Column(name = "priceInLei")
    private Double priceInLei; // = price * exchangeRate

    @Column(name = "VATinLei")
    private Double VATinLei; // = priceInLei * VATpercentage

    @Column(name = "total")
    private Double total; //= price + VATvalue

    @Column(name = "totalInLei")
    private Double totalInLei; // = priceInLei + VATinLei

    @Column(name = "paymentTerm")
    private Integer paymentTerm;

    @Column(name = "invoiceReceptionDate")
    private Timestamp invoiceReceptionDate;

    @Column(name = "invoiceDueDate")
    private Timestamp invoiceDueDate;

    @Column(name = "actualPaymentDate")
    private Timestamp actualPaymentDate;

    @Column(name = "paymentEfficiency")
    private Integer paymentEfficiency;

    @Column(name = "externalInvoiceStatus")
    private Integer externalInvoiceStatus;

    @OneToOne
    @JoinColumn(name = "transportId")
    private TransportEntity transport;

    public ExternalInvoicesEntity() {

    }

    public String getInvoiceSerial() {
        return invoiceSerial;
    }

    public void setInvoiceSerial(String invoiceSerial) {
        this.invoiceSerial = invoiceSerial;
    }

    public Integer getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Integer invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Timestamp getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Timestamp invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getSellerCompany() {
        return sellerCompany;
    }

    public void setSellerCompany(String sellerCompany) {
        this.sellerCompany = sellerCompany;
    }

    public String getBuyerCompany() {
        return buyerCompany;
    }

    public void setBuyerCompany(String buyerCompany) {
        this.buyerCompany = buyerCompany;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Double getVATpercentage() {
        return VATpercentage;
    }

    public void setVATpercentage(Double VATpercentage) {
        this.VATpercentage = VATpercentage;
    }

    public Double getVATvalue() {
        return VATvalue;
    }

    public void setVATvalue(Double VATvalue) {
        this.VATvalue = VATvalue;
    }

    public String getVATcustomMessage() {
        return VATcustomMessage;
    }

    public void setVATcustomMessage(String VATcustomMessage) {
        this.VATcustomMessage = VATcustomMessage;
    }

    public Double getPriceInLei() {
        return priceInLei;
    }

    public void setPriceInLei(Double priceInLei) {
        this.priceInLei = priceInLei;
    }

    public Double getVATinLei() {
        return VATinLei;
    }

    public void setVATinLei(Double VATinLei) {
        this.VATinLei = VATinLei;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotalInLei() {
        return totalInLei;
    }

    public void setTotalInLei(Double totalInLei) {
        this.totalInLei = totalInLei;
    }

    public Integer getPaymentTerm() {
        return paymentTerm;
    }

    public void setPaymentTerm(Integer paymentTerm) {
        this.paymentTerm = paymentTerm;
    }

    public Timestamp getInvoiceReceptionDate() {
        return invoiceReceptionDate;
    }

    public void setInvoiceReceptionDate(Timestamp invoiceReceptionDate) {
        this.invoiceReceptionDate = invoiceReceptionDate;
    }

    public Timestamp getInvoiceDueDate() {
        return invoiceDueDate;
    }

    public void setInvoiceDueDate(Timestamp invoiceDueDate) {
        this.invoiceDueDate = invoiceDueDate;
    }

    public Timestamp getActualPaymentDate() {
        return actualPaymentDate;
    }

    public void setActualPaymentDate(Timestamp actualPaymentDate) {
        this.actualPaymentDate = actualPaymentDate;
    }

    public Integer getPaymentEfficiency() {
        return paymentEfficiency;
    }

    public void setPaymentEfficiency(Integer paymentEfficiency) {
        this.paymentEfficiency = paymentEfficiency;
    }

    public Integer getExternalInvoiceStatus() {
        return externalInvoiceStatus;
    }

    public void setExternalInvoiceStatus(Integer externalInvoiceStatus) {
        this.externalInvoiceStatus = externalInvoiceStatus;
    }

    public TransportEntity getTransport() {
        return transport;
    }

    public void setTransport(TransportEntity transport) {
        this.transport = transport;
    }
}
