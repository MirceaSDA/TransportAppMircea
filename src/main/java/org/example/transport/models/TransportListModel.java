package org.example.transport.models;

import org.example.transport.entities.TransportEntity;

import java.util.List;

public class TransportListModel {

    private List<TransportEntity> transportEntityList;

    public TransportListModel() {

    }

    public List<TransportEntity> getTransportEntityList() {
        return transportEntityList;
    }

    public void setTransportEntityList(List<TransportEntity> transportEntityList) {
        this.transportEntityList = transportEntityList;
    }
}
