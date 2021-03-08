package org.example.transport.models;

import org.example.transport.entities.TransportEntity;

import java.sql.Timestamp;

public class InvoiceModel {

    private String invoiceSerial;
    private Integer invoiceNumber;
    private Timestamp invoiceDate;
    private String sellerCompany; //identificabil prin CUI
    private String buyerCompany;
    private String description;
    private Double price;
    private String currency;
    private Double exchangeRate;
    private Double VATpercentage;
    private Double VATvalue; // = price * VATpercentage
    private Double priceInLei; // = price * exchangeRate
    private Double VATinLei; // = priceInLei * VATpercentage
    private Double total; // = price + VATvalue
    private Double totalInLei; // = priceInLei + VATinLei
    private Integer paymentTerm;
    private Timestamp invoiceReceptionDate;
    private Timestamp invoiceDueDate;
    private Timestamp actualPaymentDate;
    private Integer paymentEfficiency;
    private Integer internalInvoiceStatus;

    public InvoiceModel() {

    }

    public InvoiceModel(TransportEntity transportEntity) {

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

    public Integer getInternalInvoiceStatus() {
        return internalInvoiceStatus;
    }

    public void setInternalInvoiceStatus(Integer internalInvoiceStatus) {
        this.internalInvoiceStatus = internalInvoiceStatus;
    }
}
