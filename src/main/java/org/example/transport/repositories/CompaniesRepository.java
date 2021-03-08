package org.example.transport.repositories;

import org.example.transport.entities.CompanyEntity;
import org.example.transport.entities.TransportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompaniesRepository extends JpaRepository<CompanyEntity, String> {

//    List<CompanyEntity> findAllByOrderCompanyName();
}
