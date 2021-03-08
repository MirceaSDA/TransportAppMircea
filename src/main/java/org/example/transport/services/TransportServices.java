package org.example.transport.services;

import org.example.transport.entities.TransportEntity;
import org.example.transport.repositories.TransportsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportServices {

    @Autowired
    private TransportsRepository transportsRepository;

    private static final Logger logger = LoggerFactory.getLogger(TransportServices.class);

    public TransportServices() {
        logger.info(getClass().getSimpleName() + " created");
    }

    public List<TransportEntity> getAllTransports() {
        return transportsRepository.findAll();
    }

    public TransportEntity getTransport(Integer id) {
        return transportsRepository.getOne(id);
    }

    public void saveTransport(TransportEntity transportEntity) {
        transportsRepository.save(transportEntity);
    }

    public void deleteTransport(Integer id) {
        TransportEntity transportEntity = transportsRepository.getOne(id);
        transportEntity.setTransportStatus(2);
        transportsRepository.save(transportEntity);
    }

    public List<TransportEntity> getTransportsByLoadingArea(String loadingArea){
        return transportsRepository.findAllByLoadingAreas(loadingArea);
    }

    public List<TransportEntity> getTransportsByUnloadingArea(String unloadingArea){
        return transportsRepository.findAllByUnloadingAreas(unloadingArea);
    }

    public List<TransportEntity> getTransportsByClient(String companyName){
        return transportsRepository.findAllByCompany(companyName);
    }

}
