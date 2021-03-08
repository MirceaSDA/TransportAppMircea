package org.example.transport.repositories;

import org.example.transport.entities.InternalInvoicesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternalInvoicesRepository extends JpaRepository<InternalInvoicesEntity, Integer> {

}
