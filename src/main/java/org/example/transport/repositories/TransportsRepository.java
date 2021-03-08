package org.example.transport.repositories;

import org.example.transport.entities.TransportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransportsRepository extends JpaRepository<TransportEntity, Integer> {

    @Query("from TransportEntity where loadingArea =?1")
    List<TransportEntity> findAllByLoadingAreas(String loadingArea);

    @Query("from TransportEntity where unloadingArea =?1")
    List<TransportEntity> findAllByUnloadingAreas(String unloadingArea);

    @Query("from TransportEntity where company =?1")
    List<TransportEntity> findAllByCompany(String companyName);


}
