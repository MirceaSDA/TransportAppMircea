package org.example.transport.controller;

import org.example.transport.entities.CompanyEntity;
import org.example.transport.services.CompanyServices;
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
public class CompanyController {

    @Autowired
    private CompanyServices companyServices;

    private static final Logger logger = LoggerFactory.getLogger(CompanyController.class);

    public CompanyController() {
        logger.info(getClass().getSimpleName() + " created");
    }

    @GetMapping("/companies")
    public ModelAndView getCompanies() {
        ModelAndView modelAndView = new ModelAndView("companies");
        modelAndView.addObject("companies", companyServices.getAllCompanies());
        return modelAndView;
    }

    @GetMapping("/editCompany/{cui}")
    public ModelAndView editCompany(@PathVariable String cui) {
        ModelAndView modelAndView = new ModelAndView("companies");
        modelAndView.addObject("company", companyServices.getCompany(cui));
        return modelAndView;
    }

    @GetMapping("/deleteCompany/{cui")
    public ModelAndView deleteCompany(@PathVariable String cui) {
        ModelAndView modelAndView = new ModelAndView("redirect:/companies");
        companyServices.deleteCompany(cui);
        return modelAndView;
    }

    @GetMapping("/addCompany")
    public ModelAndView addCompany() {
        ModelAndView modelAndView = new ModelAndView("addCompany");
        modelAndView.addObject("company", new CompanyEntity());
        return modelAndView;
    }

    @PostMapping("/saveCompany")
    public ModelAndView saveCompany(@Valid @ModelAttribute("addCompany") CompanyEntity companyEntity, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView("redirect:/companies");
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("company", companyEntity);
            modelAndView.setViewName("addCompany");
            return modelAndView;
        }
        companyEntity.setCompanyStatus(1);
        companyEntity.setCompanyType(3);
        companyServices.saveCompany(companyEntity);
        return modelAndView;
    }
}
