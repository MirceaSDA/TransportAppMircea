package org.example.transport.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "loading_unloading_areas")
public class LoadingUnloadingAreas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loadUnloadId")
    private Integer loadUnloadAreaId;

    @ManyToOne
    @JoinColumn(name = "transportId")
    private TransportEntity transportEntity;

    @Column(name = "loadingPlace")
    private String loadingArea;

    @Column(name="unloadingPlace")
    private String unloadingArea;

    public Integer getLoadUnloadAreaId() {
        return loadUnloadAreaId;
    }

    public void setLoadUnloadAreaId(Integer loadUnloadAreaId) {
        this.loadUnloadAreaId = loadUnloadAreaId;
    }

    public TransportEntity getTransportEntity() {
        return transportEntity;
    }

    public void setTransportEntity(TransportEntity transportEntity) {
        this.transportEntity = transportEntity;
    }

    public String getLoadingArea() {
        return loadingArea;
    }

    public void setLoadingArea(String loadingPlace) {
        this.loadingArea = loadingPlace;
    }

    public String getUnloadingArea() {
        return unloadingArea;
    }

    public void setUnloadingArea(String unloadingPlace) {
        this.unloadingArea = unloadingPlace;
    }
}
