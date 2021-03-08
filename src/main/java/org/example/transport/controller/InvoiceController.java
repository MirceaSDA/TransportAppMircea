package org.example.transport.controller;

import org.example.transport.entities.*;
import org.example.transport.models.InvoiceModel;
import org.example.transport.models.RegisterModel;
import org.example.transport.repositories.CompaniesRepository;
import org.example.transport.repositories.ExternalInvoicesRepository;
import org.example.transport.repositories.InternalInvoicesRepository;
import org.example.transport.services.InternalInvoiceService;
import org.example.transport.services.TransportServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InvoiceController {

    @Autowired
    private InternalInvoicesRepository internalInvoicesRepository;

    @Autowired
    private ExternalInvoicesRepository externalInvoicesRepository;

    @Autowired
    private CompaniesRepository companiesRepository;

    @Autowired
    private TransportServices transportServices;

    @GetMapping("/addInvoice/{id}")
    public ModelAndView addInvoice(@PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView("addInvoice");
        modelAndView.addObject("invoice", new InvoiceModel(transportServices.getTransport(id)));
        return modelAndView;
    }

    @PostMapping("/saveInvoice")
    public ModelAndView saveInvoice(@ModelAttribute("invoiceModel") InvoiceModel invoiceModel){
        CompanyEntity companyEntity = companiesRepository.getOne(invoiceModel.getSellerCompany());
        if (invoiceModel.getInvoiceSerial() == companyEntity.getInvoiceDomesticSerial()) {
            InternalInvoicesEntity internalInvoicesEntity = new InternalInvoicesEntity();
//            internalInvoicesEntity.set.....


            internalInvoicesRepository.save(internalInvoicesEntity);
        } else {
//            ExternalInvoicesEntity externalInvoicesEntity = new ExternalInvoicesEntity(invoiceModel);
//            externalInvoicesRepository.save(externalInvoicesEntity);
            //idem intern
        }

        ModelAndView modelAndView = new ModelAndView("redirect:/transports");
        return modelAndView;
    }
}
