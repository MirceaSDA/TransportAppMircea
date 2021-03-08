package org.example.transport.entities;

import javax.persistence.*;

@Entity
@Table(name = "transport_status")
public class TransportStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transportStatusId")
    private Integer transportStatusId;

    @Column(name = "transportStatusDescription")
    private String transportStatusDescription;

    public TransportStatus() {

    }

    public Integer getTransportStatusId() {
        return transportStatusId;
    }

    public void setTransportStatusId(Integer transportStatusId) {
        this.transportStatusId = transportStatusId;
    }

    public String getTransportStatusDescription() {
        return transportStatusDescription;
    }

    public void setTransportStatusDescription(String transportStatusDescription) {
        this.transportStatusDescription = transportStatusDescription;
    }
}
