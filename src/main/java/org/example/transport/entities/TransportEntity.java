package org.example.transport.entities;

import org.example.transport.models.TransportModel;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "transports")
public class TransportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transportId")
    private Integer transportId;

    @Column(name = "orderNo")
    private String orderNo;

    @Column(name = "orderDate")
    private Date orderDate;

    @Column(name = "loadingPlace")
    private String loadingPlace;

//    @OneToMany(mappedBy = "transportEntity")
//    private List<LoadingUnloadingAreas> loadingAreas;
    @Column(name = "loadingArea")
    private String loadingArea;

    @Column(name = "loadingCountry")
    private String loadingCountry;

    @Column(name = "loadingDate")
    private Timestamp loadingDate;

    @Column(name = "unloadingPlace")
    private String unloadingPlace;

//    @OneToMany(mappedBy = "transportEntity")
//    private List<LoadingUnloadingAreas> unloadingAreas;
    @Column(name = "unloadingArea")
    private String unloadingArea;

    @Column(name = "unloadingCountry")
    private String unloadingCountry;

    @Column(name = "unloadingDate")
    private Timestamp unloadingDate;

    @Column(name = "price")
    private Double price;

    @Column(name = "currency")
    private String currency; // sa fie enum cu cheie - valoare?

    @Column(name = "paymentTerm")
    private Integer paymentTerm;

    @Column(name = "autoNumber")
    private String autoNumber;

    @Column(name = "driverName")
    private String driverName;

//    @OneToOne
//    @JoinColumn(name = "companyName")
    @Column(name = "companyName")
    private String company;

    @Column(name = "clientContact")
    private String clientContact;

    @Column(name = "clientContactPhone")
    private String clientContactPhone;

    @Column(name = "transportStatus")
    private Integer transportStatus;

    public TransportEntity() {

    }

    public TransportEntity(TransportModel transportModel) {

    }

    public Integer getTransportId() {
        return transportId;
    }

    public void setTransportId(Integer transportId) {
        this.transportId = transportId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getLoadingPlace() {
        return loadingPlace;
    }

    public void setLoadingPlace(String loadingPlace) {
        this.loadingPlace = loadingPlace;
    }

    public String getLoadingArea() {
        return loadingArea;
    }

    public void setLoadingArea(String loadingArea) {
        this.loadingArea = loadingArea;
    }

    public String getLoadingCountry() {
        return loadingCountry;
    }

    public void setLoadingCountry(String loadingCountry) {
        this.loadingCountry = loadingCountry;
    }

    public Timestamp getLoadingDate() {
        return loadingDate;
    }

    public void setLoadingDate(Timestamp loadingDate) {
        this.loadingDate = loadingDate;
    }

    public String getUnloadingPlace() {
        return unloadingPlace;
    }

    public void setUnloadingPlace(String unloadingPlace) {
        this.unloadingPlace = unloadingPlace;
    }

    public String getUnloadingArea() {
        return unloadingArea;
    }

    public void setUnloadingArea(String unloadingArea) {
        this.unloadingArea = unloadingArea;
    }

    public String getUnloadingCountry() {
        return unloadingCountry;
    }

    public void setUnloadingCountry(String unloadingCountry) {
        this.unloadingCountry = unloadingCountry;
    }

    public Timestamp getUnloadingDate() {
        return unloadingDate;
    }

    public void setUnloadingDate(Timestamp unloadingDate) {
        this.unloadingDate = unloadingDate;
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

    public Integer getPaymentTerm() {
        return paymentTerm;
    }

    public void setPaymentTerm(Integer paymentTerm) {
        this.paymentTerm = paymentTerm;
    }

    public String getAutoNumber() {
        return autoNumber;
    }

    public void setAutoNumber(String autoNumber) {
        this.autoNumber = autoNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getClientContact() {
        return clientContact;
    }

    public void setClientContact(String clientContact) {
        this.clientContact = clientContact;
    }

    public String getClientContactPhone() {
        return clientContactPhone;
    }

    public void setClientContactPhone(String clientContactPhone) {
        this.clientContactPhone = clientContactPhone;
    }

    public Integer getTransportStatus() {
        return transportStatus;
    }

    public void setTransportStatus(Integer transportStatus) {
        this.transportStatus = transportStatus;
    }
}
