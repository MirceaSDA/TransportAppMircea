package org.example.transport.services;

import org.example.transport.entities.InternalInvoicesEntity;
import org.example.transport.repositories.InternalInvoicesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternalInvoiceService {

    @Autowired
    private InternalInvoicesRepository internalInvoiceRepository;

    private static final Logger logger = LoggerFactory.getLogger(InternalInvoiceService.class);

    public InternalInvoiceService() {
        logger.info(getClass().getSimpleName() + " created");
    }

    public List<InternalInvoicesEntity> getAllInternalInvoices() {
        return internalInvoiceRepository.findAll();
    }

    public InternalInvoicesEntity getInternalInvoice(Integer id) {
        return internalInvoiceRepository.getOne(id);
    }

    public void saveInternalInvoice(InternalInvoicesEntity internalInvoicesEntity) {
        internalInvoiceRepository.save(internalInvoicesEntity);
    }

    public void deleteInternalInvoice(Integer id) {
        InternalInvoicesEntity internalInvoicesEntity = internalInvoiceRepository.getOne(id);
        internalInvoicesEntity.setInternalInvoiceStatus(2);
        internalInvoiceRepository.save(internalInvoicesEntity);
    }
}
