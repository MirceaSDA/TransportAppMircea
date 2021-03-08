package org.example.transport.controller;

import org.example.transport.entities.TransportEntity;
import org.example.transport.models.TransportListModel;
import org.example.transport.repositories.TransportsRepository;
import org.example.transport.services.TransportServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransportRestController {

    @Autowired
    private TransportServices transportServices;

    @Autowired
    private TransportsRepository transportsRepository;

    private static final Logger logger = LoggerFactory.getLogger(TransportRestController.class);

    public TransportRestController() {
        logger.info(getClass().getSimpleName() + " created");
    }

    @GetMapping("/transportList")
    public List<TransportEntity> getTransportsList() {
        TransportListModel transportListModel = new TransportListModel();
        transportListModel.setTransportEntityList(transportsRepository.findAll());
        return transportsRepository.findAll();
    }

    @GetMapping("/transportById/{id}")
    public TransportEntity getTransportById(@PathVariable Integer id) {
        TransportEntity transportEntity = transportsRepository.getOne(id);
        return transportEntity;
    }

    @GetMapping("/transportById/{loadingArea}")
    public List<TransportEntity> getTransportByLoadingPlace(@PathVariable String loadingArea) {
        List<TransportEntity> transportEntity = transportsRepository.findAllByLoadingAreas(loadingArea);
        return transportEntity;
    }



}
