package org.example.transport.controller;

import org.example.transport.entities.LoadingUnloadingAreas;
import org.example.transport.entities.TransportEntity;
import org.example.transport.models.TransportModel;
import org.example.transport.repositories.LoadingUnloadingAreasRepository;
import org.example.transport.repositories.TransportsRepository;
import org.example.transport.services.TransportServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class TransportController {

    @Autowired
    private TransportServices transportServices;

    @Autowired
    private TransportsRepository transportsRepository;

    @Autowired
    private LoadingUnloadingAreasRepository loadingUnloadingAreasRepository;

    private static final Logger logger = LoggerFactory.getLogger(TransportController.class);

    public TransportController() {
        logger.info(getClass().getSimpleName() + " created");
    }


    @GetMapping("/transports")
    public ModelAndView getTransports() {
        ModelAndView modelAndView = new ModelAndView("transports");
        modelAndView.addObject("transports", transportServices.getAllTransports());
        return modelAndView;
    }

    @GetMapping("/editTransport/{id}")
    public ModelAndView editTransport(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("addTransport");
        modelAndView.addObject("transport", transportServices.getTransport(id));
        return modelAndView;
    }

    @GetMapping("/deleteTransport/{id}")
    public ModelAndView deleteTransport(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("redirect:/transports");
        transportServices.deleteTransport(id);
        return modelAndView;
    }

    @GetMapping("/addTransport")
    public ModelAndView addTransport() {
        ModelAndView modelAndView = new ModelAndView("addTransport");
        modelAndView.addObject("transport", new TransportModel());
        return modelAndView;
    }

    @PostMapping("/saveTransport")
    public ModelAndView saveTransport(@Valid @ModelAttribute("addTransport") TransportModel transportModel, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView("redirect:/transports");
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("transport", transportModel);
            modelAndView.setViewName("transports");
            return modelAndView;
        }

        TransportEntity transportEntity = new TransportEntity(transportModel);
        transportEntity.setOrderNo(transportModel.getOrderNo());
        transportEntity.setOrderDate(transportModel.getOrderDate());
        transportEntity.setLoadingPlace(transportModel.getLoadingPlace());
        transportEntity.setLoadingArea(transportModel.getLoadingArea());
        transportEntity.setLoadingCountry(transportModel.getLoadingCountry());
        transportEntity.setLoadingDate(transportModel.getLoadingDate());
        transportEntity.setUnloadingPlace(transportModel.getUnloadingPlace());
        transportEntity.setUnloadingArea(transportEntity.getUnloadingArea());
        transportEntity.setUnloadingCountry(transportModel.getUnloadingCountry());
        transportEntity.setUnloadingDate(transportModel.getUnloadingDate());
        transportEntity.setPrice(transportModel.getPrice());
        transportEntity.setCurrency(transportModel.getCurrency());
        transportEntity.setPaymentTerm(transportModel.getPaymentTerm());
        transportEntity.setAutoNumber(transportModel.getAutoNumber());
        transportEntity.setDriverName(transportModel.getDriverName());
        transportEntity.setCompany(transportModel.getCompany());
        transportEntity.setClientContact(transportModel.getClientContact());
        transportEntity.setClientContactPhone(transportModel.getClientContactPhone());
        transportEntity.setTransportStatus(1);
        transportsRepository.save(transportEntity);

//        LoadingUnloadingAreas loadingUnloadingAreas = new LoadingUnloadingAreas();
//        loadingUnloadingAreas.setTransportEntity(transportEntity);
//        loadingUnloadingAreas.setLoadingArea(transportModel.getLoadingPlace());
//        loadingUnloadingAreas.setUnloadingArea(transportModel.getUnloadingPlace());
//        loadingUnloadingAreasRepository.save(loadingUnloadingAreas);

//        transportEntity.setLoadingAreas(loadingUnloadingAreas.getLoadingArea());
//        transportsRepository.save(transportEntity);

        return modelAndView;
    }
}
