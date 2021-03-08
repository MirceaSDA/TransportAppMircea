package org.example.transport.controller;

import org.example.transport.services.ExternalInvoiceService;
import org.example.transport.services.InternalInvoiceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExternalInvoiceController {

    private static final Logger logger = LoggerFactory.getLogger(ExternalInvoiceController.class);

    public ExternalInvoiceController() {
        logger.info(getClass().getSimpleName() + " created");
    }

    @Autowired
    private ExternalInvoiceService externalInvoiceService;

    @GetMapping("/externalInvoices")
    public ModelAndView getAllExternalInvoices() {
        ModelAndView modelAndView = new ModelAndView("externalInvoices");
        modelAndView.addObject("eInvoice", externalInvoiceService.getAllExternalInvoices());
        return modelAndView;
    }
}
