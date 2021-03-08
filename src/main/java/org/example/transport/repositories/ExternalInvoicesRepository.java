package org.example.transport.repositories;

import org.example.transport.entities.ExternalInvoicesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExternalInvoicesRepository extends JpaRepository<ExternalInvoicesEntity, Integer> {

}
