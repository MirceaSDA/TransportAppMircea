package org.example.transport.controller;

import org.example.transport.services.InternalInvoiceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InternalInvoiceController {

    private static final Logger logger = LoggerFactory.getLogger(InternalInvoiceController.class);

    public InternalInvoiceController() {
        logger.info(getClass().getSimpleName() + " created");
    }

    @Autowired
    private InternalInvoiceService internalInvoiceService;

    @GetMapping("/internalInvoices")
    public ModelAndView getAllInternalInvoices() {
        ModelAndView modelAndView = new ModelAndView("internalInvoices");
        modelAndView.addObject("iInvoice", internalInvoiceService.getAllInternalInvoices());
        return modelAndView;
    }
}
