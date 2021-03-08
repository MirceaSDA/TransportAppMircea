package org.example.transport.services;

import org.example.transport.entities.ExternalInvoicesEntity;
import org.example.transport.repositories.ExternalInvoicesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExternalInvoiceService {

    @Autowired
    private ExternalInvoicesRepository externalInvoicesRepository;

    private static final Logger logger = LoggerFactory.getLogger(ExternalInvoiceService.class);

    public ExternalInvoiceService() {
        logger.info(getClass().getSimpleName() + " created");
    }

    public List<ExternalInvoicesEntity> getAllExternalInvoices() {
        return externalInvoicesRepository.findAll();
    }

    public ExternalInvoicesEntity getExternalInvoice(Integer id) {
        return externalInvoicesRepository.getOne(id);
    }

    public void saveExternalInvoice(ExternalInvoicesEntity externalInvoicesEntity) {
        externalInvoicesRepository.save(externalInvoicesEntity);
    }

    public void deleteExternalInvoice(Integer id) {
        ExternalInvoicesEntity externalInvoicesEntity = externalInvoicesRepository.getOne(id);
        externalInvoicesEntity.setExternalInvoiceStatus(2);
        externalInvoicesRepository.save(externalInvoicesEntity);
    }
}
